package Test.chickenStore.menu;

public class Menu {

    private String name;

    private int price;

    private String taste;

    public Menu() {

    }

    public Menu(String name, int price, String taste) {
        this.name = name;
        this.price = price;
        this.taste = taste;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
//    public Menu friedChicken(){
//        Menu menu = new Menu("후라이드치킨",18000);
//        menu.setName("후라이드치킨");
//        price = 18000;
//        return menu;
//    }

    public String testChicken(){
        return "%s의 가격은 %d입니다".formatted(name,price);
    }

}
