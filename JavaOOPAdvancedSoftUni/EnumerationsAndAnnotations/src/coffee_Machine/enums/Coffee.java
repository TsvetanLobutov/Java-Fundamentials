package coffee_Machine.enums;


public class Coffee {
    private CoffeSize size;
    private CoffeeType type;

    public Coffee(CoffeSize size, CoffeeType type) {
        this.size = size;
        this.type = type;
    }

    public int getPrice(){
        return this.size.getPrice();
    }

    @Override
    public String toString() {
        return this.size.toString() + " " + this.type.toString();
    }
}
