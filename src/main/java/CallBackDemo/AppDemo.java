package CallBackDemo;

public class AppDemo {
    public static void main(String[] args) {
        CallBackInterface callback1 = new CallBackImpl1();
        SomeClass a = new SomeClass();
        a.withCallBack(callback1);
    }
}
