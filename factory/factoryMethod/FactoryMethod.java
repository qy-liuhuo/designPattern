package pattern.factory.factoryMethod;

public class FactoryMethod {
    public static void main(String[] args) {
        CoffeeFactory cofferFactory = new AmericanCoffeeFactory();
        cofferFactory.createCoffee();
    }
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

class LatteCoffee extends Coffee {
    String getName(){
        System.out.println("LatteCoffee");
        return "LatteCoffee";
    }
}

interface CoffeeFactory{
    Coffee createCoffee();
}
class AmericanCoffeeFactory implements CoffeeFactory{
    public Coffee createCoffee(){
        return new AmericanCoffee();
    }
}

class LatteCoffeeFactory implements CoffeeFactory{
    public Coffee createCoffee(){
        return new LatteCoffee();
    }
}
