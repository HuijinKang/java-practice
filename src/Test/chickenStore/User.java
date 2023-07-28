package Test.chickenStore;

public class User {

    private static int money;
    private static double point;

    public User(int money, int point) {
        this.money = money;
        this.point = point;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }
}
