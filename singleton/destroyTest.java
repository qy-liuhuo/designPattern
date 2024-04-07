package pattern.singleton;

import pattern.singleton.demo1.SingleTon;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class destroyTest {
    public static void main(String[] args){
        //序列化破坏单例
        try{
            SingleTon singleTon = SingleTon.getInstance();
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./test.txt"));
            oos.writeObject(singleTon);
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./test.txt"));
            SingleTon singleTon2 = (SingleTon) ois.readObject();
            System.out.println(singleTon2==singleTon);
        }
        catch (Exception e){
            System.out.println(e);
        }
        try{
            Class singleTonClass = SingleTon.class;
            Constructor constructor =  singleTonClass.getDeclaredConstructor();
            constructor.setAccessible(true);
            SingleTon singleTon1 = (SingleTon) constructor.newInstance();
            SingleTon singleTon2 = (SingleTon) constructor.newInstance();
            System.out.println(singleTon1 == singleTon2);
        }
        catch (NoSuchMethodException e){
            System.out.println(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }
}
