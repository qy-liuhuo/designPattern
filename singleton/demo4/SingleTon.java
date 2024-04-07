package pattern.singleton.demo4;

//静态内部类实现懒汉式单例模式，由jvm保证线程安全性
public class SingleTon {
    private SingleTon(){};
    private static class SingleTonHolder{
        private static final SingleTon singleTon = new SingleTon();
    }
    public static SingleTon getInstance(){
        return SingleTonHolder.singleTon;
    }
}
