package pattern.prototype;

public class demo1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype r1 = new Realizetype();
        Realizetype r2 = r1.clone();
        System.out.println(r1==r2);
    }
}

class Realizetype implements Cloneable{
    public Realizetype(){
        System.out.println("创建原型对象");
    }

    @Override
    protected Realizetype clone() throws CloneNotSupportedException {
        System.out.println("原型对象复制成功");
        return (Realizetype)super.clone();
    }
}