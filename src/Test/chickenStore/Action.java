package Test.chickenStore;

import Test.chickenStore.menu.various.Chicken;

public class Action {

    public static boolean b = true; //Test 클래스의 payed()메소드 while문 stop

    /**
     * 결제하기
     * */
    public String payed(User user, Chicken chicken) {

        String msg = null;

        if (user.getMoney() - chicken.getPrice() < 0) {
            b = false;
            msg = "잔액이 부족합니다\n"+"현재 잔액 : %s".formatted(user.getMoney());
        } else {
            int changes = user.getMoney() - chicken.getPrice();

            user.setMoney(changes);

            user.setPoint(user.getPoint()+chicken.getPrice() * 0.02);

            msg = "\"%s\" 결제가 완료되었습니다.\n남은 금액 : %s".formatted(chicken.getName(), user.getMoney());
        }
        return msg;
    }

}
