# Twitter Trends with Linux Crontab

### 리눅스 내장 프로그램인 Crontab을 이용하여 일정 시간마다 ```trends.py```를 실행해보자! 

먼저, 현재 등록된 Crontab task목록을 확인해줍니다. 아무것도 안 뜰 겁니다.
```bash
crontab -l
```

새로운 Task를 등록해줍시다.
```bash
crontab -e
```

이상한 주석들은 무시하고 맨 밑 라인으로 넘어가 다음 줄을 추가해 줍시다.  	

 ```console
00,15,30,45 * * * * /home/ubuntu/trends.py
```    



### How to use Crontab
맨 앞 부분 00,15,30,45는 매 시 00분,15분,30분,45분에 해당 명령어를 실행하라는 뜻입니다. * 의 경우 와일드 카드로, 이후 4개의  * 는 매 시, 매 일, 매 월, 매 요일마다 실행해 달라는 의미입니다.

ex 1) 매 분마다 start.sh 실행하고 싶다면? crontab -e 이후
```console
* * * * * {dir}/start.sh
```
위와 같이 아랫줄에 추가해주면 됩니다.

ex 2) 매주 금요일 오전 2시부터 2시30분까지 avi.sh를 실행(?)
```console
00-30 2 * * 5 {dir}/avi.sh
```
