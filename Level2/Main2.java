package Level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        //리스트 선언 및 초기화
        List<MenuItem2> menuItems = new ArrayList<>();
        //add 함수를 통해 new MenuItem(이름, 가격, 설명) List 에 저장
        menuItems.add(new MenuItem2("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem2("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem2("CheeseBurger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem2("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
        // Scanner 선언
        Scanner sc = new Scanner(System.in);
        //반복문 do while 을 활용해 List 안에 있는 MenuItem 을 하나씩 순서대로 출력
        do {
            System.out.println("[ SHAKESHACK MENU ]");
            for (int i = 0; i < menuItems.size(); i++) {   // for 문 내용: menuItems 0보다 크고 menuItems size(의 개수) 보다 작을때까지 반복
                System.out.println((i + 1) + ". " + menuItems.get(i)); // 출력 내용은 i=0 이니까 1을 더해서 1부터 시작하게함
            }
            System.out.println("0. 종료");
            //숫자 입력 받기
            int choice = sc.nextInt();
            //입력된 숫자에 따른 처리
            if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");    // 0으로 프로그램 종료
                break;
            } else if (0 < choice && choice <= menuItems.size()) {  // 입력된 숫자가 0보다 크고 menuItems size(의 개수) 와 같거나 보다 작을때
                MenuItem2 selectedItem = menuItems.get(choice - 1);  // 이 부분은 챗지피티를 활용해서 해결함
                System.out.println("선택한 메뉴: " + selectedItem);    //1,2,3,4 중 하나를 입력하면 다음 질문으로 넘어감
            } else {
                System.out.println("잘못된 접근! 프로그램을 종료합니다.");   //지정된 숫자 외의 입력도 프로그램 종료
                break;
            }
            System.out.println("더 주문 하시겠습니까? (yes or no)"); //주문 과정 되풀이 질문
            sc.nextLine();                                        // nextInt 입력 버퍼
        } while (sc.next().equals("yes"));                        // yes 입력시 메뉴판으로 가고 그 외 입력시 종료
    }
}
