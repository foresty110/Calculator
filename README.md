# 계산기 만들기 

### 프로젝트 개요 
이 프로젝트는 자바를 활용한 계산기 구현 과정을 단계별로 학습하는 것을 목표로 합니다.    
단계를 거치면서 단순한 문법 이해에서 객체지향 설계, 제네릭과 람다/스트림 활용까지 점진적으로 실력을 확장합니다.    

---

### 학습 목표 
- 1단계 목표: 클래스 없이 자바 기본 문법으로 계산기를 구현하며 변수, 연산, 조건문, 반복문 사용 능력 향상
- 2단계 목표: 클래스를 활용해 객체지향적으로 연산, 기록 저장/조회 기능 구현하며 캡슐화와 재사용 가능한 코드 설계 능력 습득
- 3단계 목표: Enum, 제네릭, 람다/스트림을 적용해 고급 계산기 구현하며 타입 안전성과 함수형 프로그래밍 이해

---

### 개발 환경
- Java 17
- IntelliJ IDEA

---

### 폴더 구조
```
📁 Calculator
└─ 📁 src
   └─ 📁 main
      └─ 📁 java
         └─ 📁 calculator
            ├─ 📄 App.java
            ├─ 📄 ArithmeticCalculator.java
            ├─ 📄 Calculator.java
            ├─ 📄 IntegerCalculator.java
            └─ 📄 OperatorType.java
```

---

### 실행 방법
- **실행 구성 설정**
  - 상단 메뉴에서 Run -> Edit Configurations...를 선택합니다.
  - (+) 버튼을 클릭하고 Application을 선택하여 새로운 실행 구성을 추가합니다.
  - Main class 필드에 com.example.calculator.App를 입력하거나, ... 버튼을 클릭하여 클래스를 선택합니다.
  - 설정이 완료되면 Apply를 클릭하고 OK를 클릭합니다.
- **프로젝트 실행**
  - 상단의 Run 버튼(녹색 화살표)을 클릭하거나, Shift + F10을 눌러 프로그램을 실행합니다.
- **프로그램 테스트**
  - 계산하기: 두 개의 숫자와 연산기호를 입력합니다.
  - 삭제하기: 계산이 끝난 후 remove 입력
  - 조회하기: 계산이 끝난 후 find 입력
  - 종료하기: 계산이 끝난 후 exit 입력   

---

### 결과 화면
<img width="398" height="225" alt="image" src="https://github.com/user-attachments/assets/902777b9-86e2-4e34-b091-491e6a5aa772" />

