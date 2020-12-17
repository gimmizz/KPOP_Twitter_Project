## ELK Stack Tutorial (Execution)

- 2020-12-17 ver.



### 1. SSH를 이용해 EC2 인스턴스에 접속

`ybigta-elk2.pem`가 저장되어 있는 폴더에서 `Git Bash` 실행

```bash
ssh -i ybigta-elk2.pem ubuntu@{IP_Address}

# 질문이 나오면 Yes를 입력하고 Enter 키를 누른다.
```



### 2. Elasticsearch와 Kibana의 실행

Elasticsearch와 Kibana를 실행한다. 

Elasticsearch는 system이 부팅할 때, 자동으로 백그라운드에서 실행되도록 해놔서, 실행이 바로 될 것. Kibana의 경우는 사용자가 직접 실행을 해주도록 설정해 놓았다.

``` bash
# Elasticsearch / Kibana 실행하기
sudo systemctl start elasticsearch.service
sudo systemctl start kibana.service

# Elasticsearch / Kibana 실행 상태 확인하기
# 'active(running)'이 뜨면 정상 작동 중이다.
sudo systemctl status elasticsearch.service
sudo systemctl status kibana.service

```



### 3. Logstash 실행

Logstash를 실행할 땐, 적용할 config 파일을 명시하면서 실행해야 한다.

(2020-12-17 기준) logstash-ybigta-sample.conf 파일을 사용하여 실행한다.

- logstash-ybigta-sample.conf : 간단한 input/output만 실행한 version

``` bash
# Logstash 실행하기
# 동작하는 데 시간이 오래 걸린다. 
sudo /usr/share/logstash/bin/logstash -f logstash-ybigta-sample.conf
```



### 4. Kibana에서 Data flow 확인하기

주소창에 `{ec2IP_address}:5601 ` 를 입력하여 Kibana에 접속한다.

![Kibana 시작화면](https://user-images.githubusercontent.com/69383392/102457265-ca12f480-4085-11eb-8941-620f62ab1cf1.PNG)

맨왼쪽 상단부에 [메뉴] - [Kibana] - [Discover] 탭을 클릭한다.

![Kibana Discover](https://user-images.githubusercontent.com/69383392/102457317-e3b43c00-4085-11eb-8a73-a59ef56b0984.PNG)


데이터가 들어오는 것을 확인할 수 있다!

