## java_mysql
#### Main package
- java:17

#### CLI with Dockerfile and compose.xml : duration 150.4s
```
# --project-name is docker container name
~$ docker-compose --project-name java_mysql up -d --build
```
#### samples
- [src/Sameple.java](./src/Sample.java)

#### Quest
<detail>
<summary>Quest</summary>

|구분|파일명|적용내용|파일내용|비고|
|--|--|--|--|--|
|1|Additions.java(./src/Additions.java)|Scanner|Scanner 사용하여 입력받은 값 합산하기||
|2|ForsIfs.java(./src/ForsIfs.java)|For 구문/지수연산|입력받은 값의 지수연산하여 4의 배수인지 찾아내기||
|3|WhilesIfsBreak.java(./src/WhilesIfsBreak.java)|While & break 구문|입력받은 점수가 어떠한 학점인지 계산하기||
|4|pollsWithoutDB.java(./src/pollsWithoutDB.java)|ArrayList(add, get) / for-loop문 / for-each문|영화 선호도 설문조사하기||
</detail>