# Trend with Tweepy

import tweepy
import csv
import json
import time
from textwrap import TextWrapper
from datetime import datetime
from elasticsearch import Elasticsearch
import sys
import numpy as np
import pandas as pd

### 1. API key & token

# api_1
c_key = "cqBrLtGgcmMOVVujAhYH74sAD"
c_secret = "Kh3TjMUXXfEP2iZmJVCavjEpxWLr5yz93abe6alNejpeiVV4WY"
a_token = "403109204-fsqizf8LQPiW5edNFrBqNXOKee4beUn0bUJeK3qx"
a_token_secret = "4BXdQDvl9eiKDaGlAPiQW8811NU80jLMVvwWHO4z9URDE"

tweepy_auth = tweepy.OAuthHandler(c_key, c_secret)
tweepy_auth.set_access_token(a_token,a_token_secret)
tweepy_api = tweepy.API(tweepy_auth, timeout=300000)

# api_2
c_key2 = "eVsSW7yWRBqle5VeiLgMP3ufC"
c_secret2 = "TmReOPxOFm754hcCRTmjBsVXRDnvecZetf4N862fUDwMnPJyOr"
a_token2 = "1333282740104400897-J7ypSnwUoKbQ5L6BXpSlK6zMNThnsh"
a_token_secret2 = "T7S24JJCoV5JeHJDVYEnHfGhzNZBY4KvWkVUfylyVfCs0"

tweepy_auth2 = tweepy.OAuthHandler(c_key2, c_secret2)
tweepy_auth2.set_access_token(a_token2,a_token_secret2)
tweepy_api2 = tweepy.API(tweepy_auth2, timeout=300000)


### 2. Location csv

location_csv = pd.read_csv('location.csv')
del location_csv['Unnamed: 5']
del location_csv['Unnamed: 6']

location_csv.head()

### 3. ElasticSearch Setting

kpop_list = ['bts', '방탄', 'jimin', '슈가', '제이홉', '뷔', '정국', 'suga', 'taehyung'
             'jungkook', 'bighit', 'dynamite', 'fakelove', 'jhope', 'hobi', '호석', '호비',
            'blackpink', 'jisoo', 'killthislove', 'lovesickgirls', 'Rosé', '블랙핑크',
             '블핑', '제니', '리사', '로제', '지수', 'howyoulikethat', 'kpop', '카이', '엑소',
            'exo', '백현', 'baekhyun', 'suho', 'chanyeol', 'sehun', 'xiumin', '시우민', '찬열']

es = Elasticsearch('localhost:9200')
es2 = Elasticsearch('54.173.14.202:9200')

### 4. Mapping for geo_poin

mappings = {
    "mappings": {
        "properties": {
            "trends": {
                "properties":{
                    "name": {"type":"text"},
                    "url":{"type" : "text"},
                    "promoted_content":{"type" : "text"},
                    "query":{"type" : "text"},
                    "tweet_volume":{"type":"long"}
                }

             },
            "as_of": {"type":"date"},
            "created_at": {"type":"date"},
            "locations": {
                "properties":{
                    "name":{"type":"text"},
                    "woeid":{"type":"long"}
                }
             },
            "coordinates": {"type":"geo_point"}
            }
        }
    }

#es.indices.create(index='trend_final', body=mappings)
#es2.indices.create(index='trend_final-', body=mappings)

trend_dict = {}

for i in range(len(location_csv)): # csv 내의 모든 location

    woeid = location_csv.iloc[i]['WOEID']

    # 해당 location의 trend 불러오기
    trends = tweepy_api.trends_place(woeid)
    trends = trends[0]

    # 해당 location의 위도, 경도 불러오기
    lat = location_csv.iloc[i]['lat']
    lng = location_csv.iloc[i]['lng']

    # coordinate 형식으로 만들기
    coor = {}
    coor['lon'] = lng
    coor['lat'] = lat

    trends['coordinates'] = coor
    trends['locations'] = trends['locations'][0]

    for k in range(len(trends['trends'])): # 여러 개의 trend 쪼개서 elasticsearch로 넘기기

        # kpop_list의 단어가 포함되었는지 확인
        num = 0
        for word in kpop_list:
            if (word in trends['trends'][k]['name'].lower()):
                num += 1

        # 포함되었다면 elasticsearch로 넘기기
        if (num > 0):
            push_trend={}
            push_trend['trends'] = trends['trends'][k]
            push_trend['as_of'] = trends['as_of']
            push_trend['created_at'] = trends['created_at']
            push_trend['locations'] = trends['locations']
            push_trend['coordinates'] = trends['coordinates']

            es.index(index="trend_final", body=push_trend)
            es2.index(index="trend_last", body=push_trend)