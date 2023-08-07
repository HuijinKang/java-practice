package sec05.chap07.ex01;

public final class YalcoChickenDT extends YalcoChicken {
    public YalcoChickenDT(int no, String name) {
        super(no, name);
    }

    //  ⚠️ 불가 - final이 붙은 메소드는 자식 클래스에서 변경 불가
//    public void fryChicken () {
//        System.out.println("염지, 반죽입히기, 미원, 튀김");
//    }

    // 생성자 추가할 것
}
