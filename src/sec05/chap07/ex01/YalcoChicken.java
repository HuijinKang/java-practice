package sec05.chap07.ex01;

public class YalcoChicken {
    protected static final String CREED = "우리의 튀김옷은 얄팍하다.";

    private final int no;
    public String name;

    //  ⭐️ 필수 - no가 final이고 초기화되지 않았으므로
    public YalcoChicken(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public void changeFinalFields () {
        // ⚠️ 불가
//        this.no++; // - final이기 때문에 수정 불가
    }

    public final void fryChicken () {
        System.out.println("염지, 반죽입히기, 튀김");
    }
}
