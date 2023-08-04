package sec05.chap02.ex03;

public class ChickenMenu {

    String name;
    int price;
    String cook = "fry";

    // 요리 방식이 "fry"로 기본값이 지정됨 // 요리방식을 따로 지정해주지 않을 경우에 사용
    ChickenMenu (String name, int price) {
        this.name = name;
        this.price = price;
    }

    ChickenMenu (String name, int price, String cook) {
        this.name = name;
        this.price = price;
        this.cook = cook;
    }

}