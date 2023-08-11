package Test.chickenStore.menu.various;

import Test.chickenStore.menu.Menu;

public class ChickenMenus {

    Menu spicych = new Menu("매운", 10000,"맵다");
    Menu fried = new Menu("후라이", 10000,"기본 후라이드");

    public Menu getSpicych() {
        return spicych;
    }

    public void setSpicych(Menu spicych) {
        this.spicych = spicych;
    }

    public Menu getFried() {
        return fried;
    }

    public void setFried(Menu fried) {
        this.fried = fried;
    }
}
