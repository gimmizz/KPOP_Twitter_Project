# KPOP_Twitter_Project

### 20-2 YBIGTA Conference_ KpopTwitter Stream
Twitter에서 받아온 KPOP 관련 **실시간 / 대용량 데이터** 를 수집 / 처리 / 분석 / 시각화해보는 프로젝트입니다. 

팀원 : 김희진(17기), 김용우(15기), 노연수(17기), 송민석(16기), 신예진(17기), 이형구(17기)

<br>

1. **트위터 등 소셜미디어에서 데이터 수집** : 선정한 10 KPOP aritists에 대한 Twitter 데이터를 수집합니다.
2. **데이터 파이프라인 시스템 설계/개발** : ELK Stack, Kafka 
3. **대용량/실시간 스트리밍 데이터 처리** : 6 millon per day, (Near) Real-time Streaming
4. **얻은 데이터를 활용한 다양한 분석 진행** : Visulizations, Ranking, Count, Twitter Trends

<br><br>

## 데이터 파이프라인 설계도

![image](https://user-images.githubusercontent.com/69383392/103443351-d3b17480-4ca1-11eb-80d6-e836185be21e.png)

### 1. ELK (Elasticsearch - Logstash - Kibana)  _blue

5개의 logstash 서버가 데이터를 수집하고, 1개의 Elasticsearch 서버가 이를 indexing 하여 저장합니다. 그리고 그 결과는 Kibana를 통해 보여집니다. Twitter API를 통해 넘어오는 모든 field들을 활용하여, 방탄소년단과 블랙핑크, 두 artists의 데이터를 분석했습니다.

### 2. Kafka - Elasticsearch - Kibana _ yellow

총 3개의 Kafka 서버가 broker의 역할을 해주고, Source로는 Twitter와의 connector, Sink로는 분석을 위한 Elasticsearch와 저장을 위한 MongoDB와의 connector가 각각 하나씩의 서버로 구현되어 있습니다. 마찬가지로, Elasticsearch, Kibana를 거쳐 시각화 됩니다. Twitter API를 통해 넘어오는 모든 field들을 활용하지 않고, 선별된 fields를 기반으로 총 10개의 artist에 대한 데이터를 분석했습니다.

### 3. Twitter Trends _ pink

Twitter에서는 다른 사람보다 더 많이 언급되는 단어, 또는 주제를 Twitter Trends 탭을 통해 보여줍니다. 해당 데이터를 linux crontab을 활용해 15분마다 자동 배치처리하여, elasticsearch로 보내지도록 했습니다. 



<br><br>

## Repository

- ELK - src : ELK stack에서의 configurations
- Json_to_POJO : Json 형태의 데이터를 POJO 형태로 변형
- KafkaStreams - Twitter Aggr & Clean : Kafka Stream 처리
- docs : 회의록 정리
- instance_save : Kafka Connectors (Elasticsearch, MongoDB, Twitter)
- kpoptwitter : Web 화면 구현 코드
- trends_crontab : 실시간 Twitter Trends 데이터 수집 및 자동배치화
- wiki : 기술 사용법에 대해 정리

<br><br>

## 발표 영상

20-2 YBIGTA Conference에서 발표했던 영상은 [Youtube](https://www.youtube.com/watch?v=7eK-HoVYKrA)에 업로드되어 있습니다. 

<br>

## 구글 드라이브 링크 (프로젝트 시연,  발표자료)

20-2 YBIGTA Conference에 사용되었던 발표자료와 Kibana (Discover, Dashboard) / Web 시현 영상을 [구글드라이브](https://drive.google.com/drive/folders/11wHjBFWkZ0lIaKkhe01nV_7tHp-W9Qla?usp=sharing) 에 업로드하였습니다. 