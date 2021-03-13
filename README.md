# study_abstract_factory
디자인패턴 - 추상팩토리 공부

## 코드 설명
자판기로 추상팩토리를 구현한 프로젝트이다.
1. abstractFactory
- 자판기에서 음료수를 뽑는 main메소드가 정의되어 있다.
- 탄산음료 자판기인 CarbonateVm 객체가 있다.
- main에서 해당코드를 실행하면 주문한 음료의 이름이 출력된다

2. Drink
- 음료와 관련된 class와 abstract class가 정의되어있다.
- Drink : 음료수에 대한 변수와 메소드가 담긴 추상클래스이다
  - name : 음료수명, 문자열
  - cyrub : 음료수에 들어가는 시럽, Cyrub클래스
  - carbonate : 음료수에 들어가는 탄산, Carbonate클래스
  - bottle : 음료수가 담긴 병, Bottle클래스
  - assemble() : 재료들을 혼합하는 메소드
  - get/setName() : 음료의 이름을 가져오고, 지정하는 메소드
  
- Cola, Cydar : 추상클래스 Drink를 확장한 클래스
  - colaFactory, cydarFactory : 각 음료수의 재료를 만드는 공장, ColaFactory, CydarFactory클래스
  - assemble() : 공장에서 가져온 재료들을 혼합하는 메소드
    - 각 공장에서 시럽, 탄산, 병을 가져와서 저장
    
- ColaFactory, CydarFactory : 음료수의 재료를 만드는 공장
  - 각 음료수마다 들어가는 재료가 다르다
    - 콜라는 콜라시럽, 강한탄산, 플라스틱병, 사이다는 사이다시럽, 중간정도의 탄산, 유리병으로 구성
  
3. Meterial
- 재료와 관련된 class와 interface가 정의되어있다.
- Bottle : 음료를 담을 병에 대한 인터페이스이다. 문자열을 반환하는 getCategory()메소드가 지정되어있다.
  - GlassBottle, PlasticBottle : Bottle인터페이스를 구현한 클래스
    - GlassBottle에서 getCategory는 "유리병"을 리턴
    - PlasticBottle에서는 "페트병"을 리턴
- Carbonate : 음료에 들어갈 탄산에 대한 인터페이스이다. 문자열을 반환하는 getPower()메소드가 지정되어있다.
  - StrengthCarbonate : 강한탄산, getPower실행시 "강"리턴
  - MiddleCarbonate : 중간탄산, "중"리턴
  - WeakCarbonate : 약한탄산, "약"리턴
- Cyrub : 음료에 들어갈 시럽에 대한 인터페이스이다. 문자열을 반환하는 getName()메소드가 지정되어있다.
  - ColaCyrub : 콜라시럽, getName실행시 "콜라 시럽" 리턴
  - CydarCyrub : 사이다시럽, "사이다 시럽" 리턴
  
4. VendingMachine
- 자판기와 관련된 class와 abstract class가 정의되어있다.
- VendingMachine : 자판기에 대한 추상클래스이다. 
  - orderDrink : 음료수를 주문하는 메소드이다. 음료수명 문자열을 매개변수로 받아 Drink를 리턴한다.
    - 로직설명 : 음료명 변수를 받아 orderDrink실행, 음료명을 매개변수로 하는 makeDrink의 리턴값이 Drink객체에 저장되어 리턴
  - makeDrink : 음료를 만드는 추상메소드이다.
- CarbonateVM : Vending Machine을 확장한 탄산음료 자판기이다.
  - makeDrink : 음료명을 매개변수로 받아서 콜라면 콜라객체, 사이다면 사이다객체를 Drink객체에 담아 리턴한다.
  
## 보완점
