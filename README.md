# <div align="center"><img align="center" src="https://github.com/ykim-yeji/daumnal/assets/68416691/04a95dc7-fdf5-43c5-abd4-891ee09e6fc0" width=40% height=40%><hr><h3 align="center">다음날</h3></div>

<div>
<p align="center">
당신의 일상에 위로가 필요할 때, '다음날'이 여러분 곁에 있습니다.

하루하루를 힘겹게 보내며, 때로는 우울함에 잠기는 그 순간들, 일기를 통해 속마음을 풀어내고 싶은 분들을 위한 우리의 서비스입니다. 여러분이 남긴 감정의 기록을 통해, '다음날'은 여러분의 기분을 공감하고 그에 맞는 음악을 선별해 추천해드립니다. 힘든 하루의 무게를 조금이나마 덜어줄 수 있는, 마음을 어루만지는 멜로디를 경험하세요.
지금 '다음날'과 함께, 새로운 위로를 만나보세요. ❣❣
</p>
</div><br>

<p>

## 목차

1. [개발 환경](#개발-환경)

2. [화면 구성 소개](#화면-구성-소개)

3. [시스템 아키텍처](#시스템-아키텍처)

4. [기획 및 설계 산출물](#기획-및-설계-산출물)

5. [팀원 소개](#팀원-소개)

</p>

<p>

## 개발 환경

<h4>⛭ Management Tool</h4>
<img src="https://img.shields.io/badge/JIRA-0052CC?style=for-the-badge&logo=JIRA&logoColor=white"> <img src="https://img.shields.io/badge/gitlab-FC6D26?style=for-the-badge&logo=gitlab&logoColor=white"> <img src="https://img.shields.io/badge/mattermost-0058CC?style=for-the-badge&logo=mattermost&logoColor=white"> <img src="https://img.shields.io/badge/notion-000000?style=for-the-badge&logo=notion&logoColor=white"> <img src="https://img.shields.io/badge/figma-F24E1E?style=for-the-badge&logo=figma&logoColor=white"> <img src="https://img.shields.io/badge/postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white"> <img src="https://img.shields.io/badge/GIT-F05032?style=for-the-badge&logo=git&logoColor=white">

<h4>🖥️ IDE</h4>
<img src="https://img.shields.io/badge/INTELLIJ-000000?style=for-the-badge&logo=intellijidea&logoColor=white"/> <img src="https://img.shields.io/badge/VISUAL STUDIO CODE-007ACC?style=for-the-badge&logo=VISUAL STUDIO CODE&logoColor=white"/> <img src="https://img.shields.io/badge/PYCHARM-000000?style=for-the-badge&logo=pycharm&logoColor=white"/>

<h4>🚦 Infra</h4>
<img src="https://img.shields.io/badge/AMAZON EC2-232F3E?style=for-the-badge&logo=amazonec2&logoColor=white"/> <img src="https://img.shields.io/badge/AMAZON S3-569A31?style=for-the-badge&logo=amazons3&logoColor=white"/> <img src="https://img.shields.io/badge/NGINX-009639?style=for-the-badge&logo=nginx&logoColor=white"/> <img src="https://img.shields.io/badge/DOCKER-2496ED?style=for-the-badge&logo=docker&logoColor=white"/> <img src="https://img.shields.io/badge/DOCKER COMPOSE-2496ED?style=for-the-badge&logo=&logoColor=white"/> <img src="https://img.shields.io/badge/UBUNTU-E95420?style=for-the-badge&logo=ubuntu&logoColor=white"/> <img src="https://img.shields.io/badge/JENKINS-D24939?style=for-the-badge&logo=jenkins&logoColor=white"/> <img src="https://img.shields.io/badge/LET'S ENCRYPT-003A70?style=for-the-badge&logo=letsencrypt&logoColor=white"/>

<h4>📱Frontend</h4>
<img src="https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white"/> <img src="https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white"/> <img src="https://img.shields.io/badge/REACT-61DAFB?style=for-the-badge&logo=REACT&logoColor=white"/> <img src="https://img.shields.io/badge/TYPESCRIPT-3178C6?style=for-the-badge&logo=TYPESCRIPT&logoColor=white"/> <img src="https://img.shields.io/badge/TAILWIND CSS-06B6D4?style=for-the-badge&logo=TAILWINDCSS&logoColor=white"/>

<h4>💾 Backend</h4>
<img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white"> <img src="https://img.shields.io/badge/SPRING BOOT-6DB33F?style=for-the-badge&logo=springboot&logoColor=white"/> <img src="https://img.shields.io/badge/SPRING Data JPA-6DB33F?style=for-the-badge&logo=springdatajpa&logoColor=white"/> <img src="https://img.shields.io/badge/SPRING SECURITY-6DB33F?style=for-the-badge&logo=springsecurity&logoColor=white"/> <img src="https://img.shields.io/badge/OAUTH2-40AEF0?style=for-the-badge&logo=oauth2&logoColor=white"/> <img src="https://img.shields.io/badge/JSON WEB TOKENS-000000?style=for-the-badge&logo=JSON WEB TOKENS&logoColor=white"/> <img src="https://img.shields.io/badge/MYSQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white"/> <img src="https://img.shields.io/badge/REDIS-DC382D?style=for-the-badge&logo=redis&logoColor=white"/> <img src="https://img.shields.io/badge/PYTHON-3776AB?style=for-the-badge&logo=python&logoColor=white"/> <img src="https://img.shields.io/badge/FASTAPI-009688?style=for-the-badge&logo=FASTAPI&logoColor=white"/>
</p><br>

<p>

## 화면 구성 소개

### 1. 로그인
<img src="https://github.com/hel-gather/hel-gather-server/assets/75198221/02b9429e-220b-42c8-b5b4-b1c38b283b98"/>
<p>카카오 소셜 로그인 화면입니다. 저희 다음날 서비스를 이용하기 위해서는 간단한 로그인 절차를 진행하면 누구나 이용하실 수 있습니다.</p>

### 2. 캐릭터 소개
<img src="https://github.com/hel-gather/hel-gather-server/assets/75198221/13414893-94e3-4898-99d3-a77157f4dfdb"/>
<p>다음날 서비스의 매력적인 나무들을 소개합니다! 각 캐릭터는 여러분이 쓴 일기를 바탕으로 여러분에게 개성 넘치는 매력으로 음악을 추천해 드립니다. 이들의 유니크한 성격이 반영된 음악 선택으로 각기 다른 분위기의 노래를 경험하실 수 있습니다.</p>

### 3. 일기 쓰기
<img src="https://github.com/hel-gather/hel-gather-server/assets/75198221/e93a1f10-9da2-4715-b72f-7e58278006b5"/>
<p>일기를 쓰는 과정입니다! 날짜 옆에 있는 스피커는 배경음악 선택하기 위한 버튼으로 저희 서비스가 제공하는 여러 배경음악 또는 효과음을 설정하실 수 있습니다.
제목, 해시태그, 일기 그림, 글쓰기 공간을 활용하여 일기 내용을 등록하시면 쓴 일기 내용의 감정 분석을 바탕으로 저희 나무 캐릭터들이 각자의 노래를 준비해옵니다.</p>

### 4. 노래 선택
<img src="https://github.com/hel-gather/hel-gather-server/assets/75198221/72a88b71-1d99-4c8d-b389-4a76776f0bd5"/>
<p>네 개의 개성 있는 나무 중 하나를 선택하시면, 그 나무가 엄선한 노래 추천을 받아보실 수 있습니다. 
오늘의 일기에 맞는 음악이 바로 등록되니, 기록과 동시에 여러분의 일상에 음악을 더합니다. 
일기를 등록하면 달력에 자동으로 체크가 되어, 매일의 소중한 순간들을 놓치지 않게 도와드립니다!</p>

### 5. 일기 상세 보기
<img src="https://github.com/hel-gather/hel-gather-server/assets/75198221/0137d178-04d9-44ed-9b94-a3f20669f93c"/>
<p>해당 날짜를 클릭하면 그날 기록한 일기와 함께 추천받은 노래를 확인하실 수 있습니다. 
음표 아이콘을 통해 이 노래들을 개인 플레이리스트에 추가할 수 있고, 악보 아이콘으로 가사를 보며, 마음에 드는 가사 문구를 저장하는 기능도 이용하실 수 있습니다.</p>

### 6. 일기 감정 분석 결과
<img src="https://github.com/hel-gather/hel-gather-server/assets/75198221/4a9ba5bc-66b1-4ce5-9705-5079c3333adb"/>
<p>작성한 일기에서 나타나는 감정의 분포를 한눈에 볼 수 있습니다. 감정 분포도에는 다음과 같은 감정 데이터가 포함되어 있습니다.

1. 행복
2. 슬픔
3. 분노
4. 혐오
5. 놀람
6. 두려움
7. 중립</p>

### 7. 일기 모음
<img src="https://github.com/hel-gather/hel-gather-server/assets/75198221/4468a883-d21f-4718-9092-56b497e836e4"/>
<p>캘린더를 통해 지금까지 작성한 일기와 음악을 손쉽게 되돌아볼 수 있습니다!</p>

### 8. 월별 감정 분석 보기
<img src="https://github.com/hel-gather/hel-gather-server/assets/75198221/506aafdc-9c55-42ea-876e-25ab10927867"/>
<p>한 달 동안의 감정 분석을 돌아보며 더 나은 자신으로 성장하는 계기를 마련해 보세요!</p>

### 9. 나의 플레이리스트
<img src="https://github.com/hel-gather/hel-gather-server/assets/75198221/97b27457-e1b2-44a5-aca6-89065f722e12"/>
<p>그동안 일기를 쓰면서 추천 받았던 노래로 만들었던 여러분만의 플레이리스트로 자유롭게 노래를 감상하실 수 있습니다!</p>

<p>

## 시스템 아키텍처

### 개발 서버
<img src="https://github.com/ykim-yeji/daumnal/assets/68416691/390b48f1-18ed-46f4-b601-378d717604c4"/>

### 운영 서버
<img src="https://github.com/ykim-yeji/daumnal/assets/68416691/3c2a717e-eaad-447a-a59b-ab7fa1b9a68e"/>

</p>

<p>

## 기획 및 설계 산출물

### 요구사항 명세서
<img src="https://github.com/ykim-yeji/daumnal/assets/68416691/f8253804-12d8-4c26-a01d-1ae7abc1ebdf" width=60% height=60%>
<img src="https://github.com/ykim-yeji/daumnal/assets/68416691/3124c144-90e8-4b89-a96d-fed4d90fe05c" width=60% height=60%>
<img src="https://github.com/ykim-yeji/daumnal/assets/68416691/4cba75f2-d1d1-40a6-ac6e-f7d2a4692d05" width=60% height=60%>
<img src="https://github.com/ykim-yeji/daumnal/assets/68416691/fcee245b-57f9-4379-9823-f82fcde5ed2f" width=60% height=60%>
<img src="https://github.com/ykim-yeji/daumnal/assets/68416691/e1e47f98-81e6-43b8-ae88-d73866fc4bdf" width=60% height=60%>

### 기능명세서
#### 프론트엔드
<img src="https://github.com/ykim-yeji/daumnal/assets/68416691/59b772cb-ca10-4050-812c-287882f80f4b" width=60% height=60%>
<img src="https://github.com/ykim-yeji/daumnal/assets/68416691/7538cf62-6369-4ce0-9cec-50bb8b2f80a2" width=60% height=60%>
<img src="https://github.com/ykim-yeji/daumnal/assets/68416691/b5b59064-c98a-4e9f-9ffa-fb0d9c351f75" width=60% height=60%>
<img src="https://github.com/ykim-yeji/daumnal/assets/68416691/eed6e48c-54ec-433a-9d0f-c54d0d2a16da" width=60% height=60%>
<img src="https://github.com/ykim-yeji/daumnal/assets/68416691/d077987e-1801-442a-a67d-76772c0cb7a8" width=60% height=60%>
<img src="https://github.com/ykim-yeji/daumnal/assets/68416691/25d1bce2-f3cc-4687-aac9-a990eaa98042" width=60% height=60%>
<img src="https://github.com/ykim-yeji/daumnal/assets/68416691/cb31c537-3164-4030-907a-5e605ad8bea8" width=60% height=60%>
<img src="https://github.com/ykim-yeji/daumnal/assets/68416691/f66a13a9-ddae-47cb-b769-bc4a7c3bd06c" width=60% height=60%>
<img src="https://github.com/ykim-yeji/daumnal/assets/68416691/67192af2-87ec-4098-999f-eb725f94473f" width=60% height=60%>
<img src="https://github.com/ykim-yeji/daumnal/assets/68416691/57b6a4f7-3e91-44fe-90a5-62340ec7bef2" width=60% height=60%>
<img src="https://github.com/ykim-yeji/daumnal/assets/68416691/a58aa406-66a6-41b2-8dd4-98c1737e8b0a" width=60% height=60%>

#### 백엔드
<img src="https://github.com/ykim-yeji/daumnal/assets/68416691/3041fa58-1a4c-4de3-8ff0-e6a2fd9261ae" width=60% height=60%>
<img src="https://github.com/ykim-yeji/daumnal/assets/68416691/d3a185ac-7b77-48fa-94a8-ca91fa82db98" width=60% height=60%>
<img src="https://github.com/ykim-yeji/daumnal/assets/68416691/7c8b2894-09b2-4287-aea3-0902979a4965" width=60% height=60%>
<img src="https://github.com/ykim-yeji/daumnal/assets/68416691/1eb4612a-e7fa-4b61-b38d-49b8b6ac1f27" width=60% height=60%>

### 화면 설계서
<img src="https://github.com/ykim-yeji/daumnal/assets/68416691/b7e15678-b9ac-4bed-8702-7f615444ef7b" width=60% height=60%>

### ERD
<img src="https://github.com/ykim-yeji/daumnal/assets/68416691/d41e6589-137f-44c9-aed4-354a86be1814" width=60% height=60%>

</p>

<p>

## 팀원 소개
<img src="https://github.com/ykim-yeji/daumnal/assets/68416691/8cc5aec4-53eb-47d8-9352-ab0c59d6f9f8" width=50% height=50%>

</p>