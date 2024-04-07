package pattern.singleton.demo3;

public class SingleTon {
    private SingleTon(){}

//    线程不安全
//    private static SingleTon instance;
//    public static SingleTon getInstance(){
//        if(instance==null)
//            instance = new SingleTon();
//        return instance;
//    }

    //线程安全
//    private static SingleTon instance;
//    public static synchronized SingleTon getInstance(){
//        if(instance==null)
//            instance = new SingleTon();
//        return instance;
//    }

    //双重检查
    private static volatile SingleTon instance;
    public static synchronized SingleTon getInstance(){
        if(instance==null){
            synchronized (SingleTon.class){
                instance = new SingleTon();
            }
        }
        return instance;
    }


}
