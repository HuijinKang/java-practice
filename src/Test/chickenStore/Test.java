package Test.chickenStore;

import Test.chickenStore.menu.various.Chicken;
import Test.chickenStore.menu.various.ChickenMenus;

import java.util.Scanner;

public class Test {

    int userMoney;//유저 머니

    ChickenMenus chickenMenus = new ChickenMenus();
    Chicken friedChicken = new Chicken("후라이드 치킨",16000, "후라이드맛");
    Chicken spicyChicken = new Chicken("매운 치킨",19000, "매운맛");
    User user = new User(1000000, 0);
    Action action = new Action();

    Chicken[] menus = {new Chicken("테스트1", 1000, "맛"), new Chicken("매운 치킨",19000, "매운맛")};

    public void payed() {

        Scanner sc = new Scanner(System.in);

        int userMoney = sc.nextInt();

        user.setMoney(userMoney);

//        for (int i=0; i < 20; i++) {
//                System.out.println("\n" + action.payed(user, friedChicken));
//                System.out.println("\n" + action.payed(user, spicyChicken));
//        }
        while (Action.b) {

            System.out.println("\n" + action.payed(user, (Chicken) chickenMenus.getFried()));
            System.out.println("\n" + action.payed(user, spicyChicken));;

        }
        System.out.println(menus);
        System.out.println("\n총 적립금 : %s 포인트".formatted((int)user.getPoint()));
    }
}

