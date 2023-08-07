package sec05.chap04.ex01;

import sec05.chap04.ex02.Button;

public class Main {
    public static void main(String[] args) {

//////////////////////////ex01//////////////////////////

        SmartPhone phone = new SmartPhone();

        String pb = phone.powerButton;
        String ss = phone.sdCardSlot;
//        String cu = phone.cpu; // ⚠️ 불가 -private

////////////////////////////////////////////////////////

        Button button1 = new Button('1', 1);

//        Button.mode = "OCEAN"; // ⚠️ 불가
        Button.switchMode();

//        button1.space = 3; // ⚠️ 불가
        button1.setSpace(3);
        button1.setSpace(-1); // 걸러짐

//        char button1Print = button1.print; // ⚠️ 불가
        String button1Info = button1.getButtonInfo();
    }
}
