import ObserverPattern.Store;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Store store = new Store();
        store.observe();

        Decorator decorator = new Decorator();
        decorator.decorate();
    }
}