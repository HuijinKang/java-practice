package sec06.chap02.pkg1;

public class Child extends Parent {
    //  Parent와 같은 패키지
    //  int aa = a; // ⚠️ 불가 - private이기 때문(같은 클래스 안에서만 가능)
    int bb = b;
    int cc = c; // 💡 protected - 같은 패키지, 상속관계
    int dd = d;
}
