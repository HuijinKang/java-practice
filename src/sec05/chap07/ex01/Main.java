package sec05.chap07.ex01;

public class Main {
    public static void main(String[] args) {

        String ycCreed = YalcoChicken.CREED;
//        YalcoChicken.CREED = "우리의 튀김옷은 바삭하다"; // ⚠️ 불가 - final 수식이 된 필드는 수정하는 것이 불가능

        final YalcoChicken store1 = new YalcoChicken(3, "판교");

        //  ⚠️ 불가
//        store1 = new YalcoChicken(17, "강남"); // final이기 때문에 다른 값을 넣는 것은 불가능
        //  💡 요소 변경은 가능
        store1.name = "선릉";

    }
}
