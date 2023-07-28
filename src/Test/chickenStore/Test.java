package Test.chickenStore;

import Test.chickenStore.menu.various.Chicken;

public class Test {

    int userMoney;//유저 머니

    Chicken friedChicken = new Chicken("후라이드 치킨",16000);
    Chicken spicyChicken = new Chicken("매운 치킨",19000);
    User user = new User(1000000, 0);
    Action action = new Action();

    public void payed() {

        int userGetMoney = user.getMoney();
//        for (int i=0; i < 20; i++) {
//                System.out.println("\n" + action.payed(user, friedChicken));
//                System.out.println("\n" + action.payed(user, spicyChicken));
//        }
        while (Action.b) {

            System.out.println("\n" + action.payed(user, friedChicken));
            System.out.println("\n" + action.payed(user, spicyChicken));;

        }
        System.out.println("\n총 적립금 : %s 포인트".formatted((int)user.getPoint()));
    }
}

