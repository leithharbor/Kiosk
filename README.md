# 1. 프로젝트 구성
### 스파르타내일배움캠프 스프링_4기 Java 두번째 과제
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
패스트푸드 매장 키오스크 기능을 콘솔창에 구현하는 프로젝트다. 이번 프로젝트는 총 7단계로 나뉘어져 있고 각 단계별 난이도가 존재한다. Lv 1은 키오스크 기능을 단일 클래스로 만드는 단계다. Lv 2는 데이터를 구조적으로 관리하는 클래스를 만든다. Lv 3는 main이 담당하던 순서제어 기능을 새로운 클래스를 만들어 분리시킨다. Lv 4는 Lv 3의 클래스 기능을 분담받는다. Lv 5는 Lv 4클래스에 접근하지 못하도록 캡슐화를 시킨다. 나머지 상위 레벨은 장바구니 기능을 구현한다. Lv 1 ~ Lv 5는 필수 Lv 6,7은 도전 단계다.
이번 프로젝트로 자바의 객체지향 원리와 그에 속한 클래스 분리 각 매서드들을 적용 및 작동시켜 자바 사용법을 훈련한다.

# 2. 요구사항
훈련생들은 공통적으로 인텔리제이 17버전으로 프로젝트를 수행한다.
### Lv 1
햄버거 메뉴를 출력한다.
Scanner를 사용해 입력된 번호에 따른 결과값을 출력한다.
### Lv 2
MenuItem 클래스 생성한다
main 함수에서 MenuItem 클래스를 활용하여 햄버거 메뉴를 출력한다.
List를 선언하여 여러 MenuItem을 추가한다.
### Lv 3
Kiosk 클래스를 생성한다.
main 함수에서 관리하던 입력과 반복문 로직은 이제 start 함수를 만들어 관리한다.

# 3. 적용 기술들


<div align=center> 
  <img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white"> 
  <img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white">
  <img src="https://img.shields.io/badge/git-F05032?style=for-the-badge&logo=git&logoColor=white">
  <br>
</div>

# 4.주요기능
### Lv1
전체 햄버거 메뉴를 출력한 뒤 원하는 메뉴를 선택하면 해당 메뉴만 재출력하게 된다. 선택 후에는 재주문 여부를 물어본 뒤 재실행된다. 설정 이외의 값을 입력하면 잘못된 입력임을 안내하고 종료된다. 0을 누르면 프로그램이 종료된다.

1. 메뉴판) 4가지의 햄버거 메뉴를 보여준다. 각 메뉴는 숫자 1,2,3,4를 입력하여 선택할 수 있다.

2. 결과를 보여주고 재주문 여부를 물어본다. 이때 yes를 입력하여 재주문할 수 있다. yes 외의 값을 입력할 경우 프로그램은 종료된다. 프로그램 종료는 메뉴판에서 그리고 결과값 도출 이후에 할 수 있다.

### Lv 2
속생기) 각 메뉴를 관리하기 위한 속성(필드)을 선언한다. 생성자로 초기값을 설정한다. 기능(메서드)으로 값을 반환한다.

1. List로 menuItems 저장 및 관리
2. private로 Lv 2 클래스에서만 제어할 수 있도록 한다.
3. toString을 사용해 주소값이 아닌 문자열 그대로 출력한다.
4. Override로 재정의를 오류를 자동으로 보정한다.

### Lv 3
속생기) menuItems 리스트를 관리한다. 생성자로 초기값 세팅. 로직을 실행할 수 있는 기능을 추가.

1. 리스트 관리를 Kiosk 클래스를 새로 만들어 한다.
2. start 함수를 사용해 출력 기능을 Main에서 수행할 수 있게 한다.

# 5. 참고 및 출처
https://online.spartacodingclub.kr/enrolleds/672d9ad550d6f1468918b671/rounds/672d780162e0cb9cea7d178c/roadmap
스파르타 강의

https://teamsparta.notion.site/Java-3-1eb3937dd9114bfca9e00cefe8ee8cbb
스파르타 강의자료

https://www.inflearn.com/course/lecture?courseSlug=%EA%B9%80%EC%98%81%ED%95%9C%EC%9D%98-%EC%9E%90%EB%B0%94-%EC%9E%85%EB%AC%B8&unitId=194616&tab=curriculum&subtitleLanguage=ko
인프런 강의

https://chatgpt.com/

https://developer-yeony.tistory.com/84
향상된 for문 개인 블로그

https://ngwdeveloper.tistory.com/19
키오스크 과제 개인 블로그

https://velog.io/@luna7182/%EB%B0%B1%EC%97%94%EB%93%9C-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8-README-%EC%93%B0%EB%8A%94-%EB%B2%95
리드미 작성법 요령

https://cocoon1787.tistory.com/689
리드미 아이콘
