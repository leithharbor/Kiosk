package com.example.kiosk;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    // 키오스크 클래스에서 관리할 리스트 이름
    private List<MenuItem> menuItems;
//생성자 영역
    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
    Scanner sc = new Scanner(System.in);
    // start 함수로 키오스크 클래스를 작동
    public void start() {
        // Main 에서 실행하던 do while 문 Kiosk 로 이전
        do {
            System.out.println("[ SHAKESHACK MENU ]");
            for (int i = 0; i < menuItems.size(); i++) {   // for 문 내용: menuItems 0보다 크고 menuItems size(의 개수) 보다 작을때까지 반복
                System.out.println((i+1) + ". " + menuItems.get(i)); // 출력 내용은 i=0 이니까 1을 더해서 숫자 1부터 출력되게하고 뒤에는 i번째 데이터를 불러옴
            }
            System.out.println("0. 종료");
            //숫자 입력 받기
            int choice = sc.nextInt();
            //입력된 숫자에 따른 처리
            if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");    // 0으로 프로그램 종료
                break;
            } else if (0 < choice && choice <= menuItems.size()) {  // 입력된 숫자가 0보다 크고 menuItems size(의 개수) 와 같거나 보다 작을때
                MenuItem selectedItem = menuItems.get(choice - 1);  // 이 부분은 챗지피티를 활용해서 해결함
                System.out.println("선택한 메뉴: " + selectedItem);    //1,2,3,4 중 하나를 입력하면 다음 질문으로 넘어감
            } else {
                System.out.println("잘못된 접근! 프로그램을 종료합니다.");   //지정된 숫자 외의 입력도 프로그램 종료
                break;
            }
            System.out.println("더 주문 하시겠습니까? (yes or no)"); //주문 과정 되풀이 질문
            sc.nextLine();                                        // nextInt 입력 버퍼
        } while (sc.next().equals("yes"));                        /*yes 입력시 메뉴판으로 가고 그 외 입력시 종료
                                                                    계산기 해설 예제에서 쓴 방법 */
    }

}
