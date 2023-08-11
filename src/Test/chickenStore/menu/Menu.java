package Test.chickenStore.menu;

public class Menu {

    private String name;

    private int price;

    private String explanation;

    public Menu() {

    }

    public Menu(String name, int price, String explanation) {
        this.name = name;
        this.price = price;
        this.explanation = explanation;
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

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String taste) {
        this.explanation = explanation;
    }

    public String testChicken(){
        return "%s의 가격은 %d입니다".formatted(name,price);
    }

}
