# 1. 프로젝트 구성
### 스파르타내일배움캠프 스프링_4기 Java 첫 과제
### 프로젝트 명
키오스크 만들기

### 프로젝트 시작일
2024-11-21

### 프로젝트 종료일
2024-11-28 (14:00)

### 구성원
1. 이상구
* * *
### 프로젝트 소개
콘솔창을 이용해서 직접 숫자를 기입하여 사용할 수 있는 계산기를 만드는 프로젝트이다. 이번 프로젝트는 세 단계로 나뉘어져 있고 각 단계별 난이도가 존재한다. Lv 1은 연산 프로그램을 단일 클래스로 만드는 단계다. Lv 2는 연산 기능, 데이터 저장/삭제 기능을 새로운 클래스에 부여해서 따로 작동하게 한다. Lv 3는 부가기능을 부여한다. Lv 1/Lv2 는 초보자 Lv3는 고급자 단계다.
이번 프로젝트로 자바의 객체지향 원리와 그에 속한 클래스 분리 각 매서드들을 적용 및 작동시켜 자바 사용법을 훈련한다.

# 2. 요구사항
훈련생들은 공통적으로 인텔리제이 17버전으로 프로젝트를 수행한다.
### Lv 1
계산기를 만들어라.
계산기는 2개의 숫자를 받을 수 있고 사칙연산 될 문자를 받을 수 있다.
계산기는 exit을 입력할 때 까지 계속해서 값을 받고 연산 결과를 반환한다.
### Lv 2
계산된 결과 값들을 기록하는 컬렉션을 만든다.
컬렉션의 가장 먼저 저장된 데이터를 삭제하는 기능을 만든다.
### Lv 3
양의 정수만 받았지만 이제부터는 실수도 받을수 있게 수정한다.
결과가 저장되어 있는 컬렉션을 조회하는 기능을 만든다.
그때 특정 값 보다 큰 결과 값을 출력 할 수 있도록.

# 3. 적용 기술들


<div align=center> 
  <img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white"> 
  <img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white">
  <img src="https://img.shields.io/badge/git-F05032?style=for-the-badge&logo=git&logoColor=white">
  <br>
</div>

# 4.주요기능
### Lv1
정수 두개를 이용한 단순 연산을 할 수 있다. 첫 번째 정수를 선택하고 사칙연산 기호를 입력한 뒤 두 번째 정수를 선택하고 엔터를 누르면 결과값을 얻어낼 수 있다.

1. 각 입력값을 입력하는 곳에서 범위에 벗어난 값을 입력하면 다시 입력하게 한다. "첫번째 정수를 입력해주세요"에서 정수가 아닌 다른 값을 입력하면 다시 입력을 요구한다. "사칙연산 기호를 입력해주세요"에서 +, -, *, / 외의 값을 입력하면 다시 입력을 요구한다. 알맞는 값을 기입하기 전까지 무한 요구한다.

2. 나눗셈에서 분모에 0을 기입할 경우 에러가 발생하는 것을 예외처리하여 0 이외의 숫자를 입력할 것을 재요구한다.

3. 계산 결과를 보여주고 재진행여부를 물어본다. 이때 yes/no를 기입하여 계속 진행할 것인지 멈출 것인지 선택할 수 있다. yes/no외의 값을 입력하여도 종료된다. 프로그램 종료는 모두 결과값 도출 이후에 멈출 수 있도록 하였다. 계산 진행중에는 프로그램을 종료시킬 수 없다.


### Lv 2
Calculator 클래스를 하나 더 생성시켜 연산/ 저장/ 삭제 기능을 부여한다.
Lv 1에서 사용하던 App 클래스는 결과를 보여주는 역할을 하고 Calculator 클래스는 연산/저장/삭제 기능을 수행한다. 하지만 기능 수행은 App 클래스에서 진행한다.
1. 연산을 위한 값을 입력하는 것.
2. 저장된 데이터를 불러오는 것.
3. 저장된 데이터를 삭제하는 것.

# 5. 참고 및 출처
https://online.spartacodingclub.kr/enrolleds/672d9ad550d6f1468918b671/rounds/672d780162e0cb9cea7d178c/roadmap
스파르타 강의

https://teamsparta.notion.site/Java-3-1eb3937dd9114bfca9e00cefe8ee8cbb
스파르타 강의자료

https://www.inflearn.com/course/lecture?courseSlug=%EA%B9%80%EC%98%81%ED%95%9C%EC%9D%98-%EC%9E%90%EB%B0%94-%EC%9E%85%EB%AC%B8&unitId=194616&tab=curriculum&subtitleLanguage=ko
인프런 강의

https://chatgpt.com/

https://st-lab.tistory.com/161
리스트어레이 개인 블로그

https://velog.io/@luna7182/%EB%B0%B1%EC%97%94%EB%93%9C-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8-README-%EC%93%B0%EB%8A%94-%EB%B2%95
리드미 작성법 요령

https://cocoon1787.tistory.com/689
리드미 아이콘
