package pattern.factory.simpleFactory;

public class SimpleFactory{

}

abstract class Coffee {
    abstract String getName();
}

class AmericanCoffee extends Coffee {
    String getName(){
        System.out.println("AmericanCoffee");
        return "AmericanCoffee";
    }
}

class LatteCoffee extends Coffee{
    String getName(){
        System.out.println("LatteCoffee");
        return "LatteCoffee";
    }
}

class SimpleCoffeeFactory{
    public Coffee createCoffee(String type){
        Coffee coffee = null;
        if(type.equals("american")) coffee = new AmericanCoffee();
        else if(type.equals("latte")) coffee = new LatteCoffee();
        return coffee;
    }
}
