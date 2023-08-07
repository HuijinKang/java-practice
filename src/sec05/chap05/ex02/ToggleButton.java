package sec05.chap05.ex02;

public class ToggleButton extends Button {
    private boolean on;

    public ToggleButton(String print, boolean on) {
        super(print); // 생성자의 경우 super를 먼저 호출해야함
        this.on = on;
    }

    @Override
    public void func () {
        super.func(); // 💡 부모에서 정의한 메소드 호출
        this.on = !this.on;
        System.out.println(
                "대문자입력: " + (this.on ? "ON" : "OFF")
        );
    }
}
