# java-chicken-2019

## 기능 구현 목록
* (완료) 메인화면에서 원하는 기능을 선택하라고 묻기
    * (완료) 1, 2, 3 외의 입력이 들어올 경우 예외처리
* (완료) 3번일 경우, 프로그램을 종료한다.
* (완료) 1, 2번일 경우, POS기를 작동한다.
* (완료) 테이블 목록을 보여준 뒤, 테이블 번호를 입력받는다.
    * (완료) 입력받은 테이블 번호가 없다면 예외처리
* (완료) 테이블에 메뉴 리스트를 추가한다.
* (완료) 테이블에 메뉴를 추가할 수 있도록 한다.
* (완료) 테이블에 주문이 있는지 확인할 수 있는 메소드를 추가한다.

### 주문등록(1)
* (완료) 테이블에 등록할 메뉴를 선택한다.
    * (완료) 메뉴 목록에 없을 경우 예외처리
* (완료) 메뉴의 수량을 선택한다.
    * (완료) 입력된 수량이 99가 넘어갈 경우 예외처리
    * 이미 주문한 메뉴와 합쳤을 때, 수량이 99 넘어가면 예외처리
* (완료) 주문한 테이블에 주문 수량만큼 menu를 추가한다.
* (완료) 주문이 등록된 테이블에 \(Won) 표시를 추가한다.

### 결제하기(2)
* 주문이 없는 테이블 선택 시 예외처리
* 신용카드와 현금 중 어느 것으로 결제할지 묻는다.
    * 1, 2 외의 다른 입력이 들어올 경우 예외처리
* (완료) 테이블의 최종 결제할 금액을 보여준다.
* 테이블의 \(Won) 표시를 지운다.