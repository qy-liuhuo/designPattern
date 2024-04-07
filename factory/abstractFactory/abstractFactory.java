package pattern.factory.abstractFactory;

public class abstractFactory {

}
abstract class Coffee {
    abstract String getCoffeeName();
}
class AmericanCoffee extends Coffee {
    String getCoffeeName(){
        System.out.println("AmericanCoffee");
        return "AmericanCoffee";
    }
}

class LatteCoffee extends Coffee {
    String getCoffeeName(){
        System.out.println("LatteCoffee");
        return "LatteCoffee";
    }
}
abstract class Dessert{
    abstract String getDessertName();
}

class AmericanDessert extends Dessert{
    @Override
    String getDessertName() {
        return "AmericanDessert";
    }
}

class LatteDessert extends Dessert{

    @Override
    String getDessertName() {
        return "LatteDessert";
    }
}

interface DessertFactory{
    Coffee createCoffee();
    Dessert createDessert();
}

class AmericanDessertFactory implements DessertFactory{

    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new AmericanDessert();
    }
}

class LatteDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
    @Override
    public Dessert createDessert() {
        return new LatteDessert();
    }
}
