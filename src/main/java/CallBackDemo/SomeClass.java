package CallBackDemo;

public class SomeClass {

    public void withCallBack(CallBackInterface callBack) {
        System.out.println("call back function return: " + callBack.getResult());
    }
}
