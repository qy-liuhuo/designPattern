package pattern.singleton.demo2;

public class SingleTon {
    private SingleTon(){}
    private static final SingleTon instance;
    static {
        instance = new SingleTon();
    }
    public static SingleTon getInstance(){
        return instance;
    }
}
