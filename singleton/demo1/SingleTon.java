package pattern.singleton.demo1;

import java.io.Serial;
import java.io.Serializable;

public class SingleTon implements Serializable {
    private SingleTon() {
    }
    private static final SingleTon instance = new SingleTon();

    public static SingleTon getInstance() {
        return instance;
    }

}

