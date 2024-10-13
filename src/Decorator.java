public class Decorator {


    abstract class BasePizza {
        public abstract int cost();
    }

    class Margherita extends BasePizza {
        @Override
        public int cost() {
            return 100;
        }
    }

    class Onion extends BasePizza {
        @Override
        public int cost() {
            return 120;
        }
    }

    abstract class Topping extends BasePizza {

    }

    class ExtraCheeze extends Topping {
        BasePizza basePizza;

        ExtraCheeze(BasePizza basePizza) {
            this.basePizza = basePizza;
        }

        @Override
        public int cost() {
            return basePizza.cost() + 20;
        }
    }

    class Mushroom extends Topping {
        BasePizza basePizza;

        Mushroom(BasePizza basePizza) {
            this.basePizza = basePizza;
        }

        @Override
        public int cost() {
            return basePizza.cost() + 15;
        }
    }
    public void decorate() {
        BasePizza pizza = new ExtraCheeze(new Mushroom(new ExtraCheeze(new Margherita())));
        System.out.println("Pizza Cost: " + pizza.cost());
    }
}