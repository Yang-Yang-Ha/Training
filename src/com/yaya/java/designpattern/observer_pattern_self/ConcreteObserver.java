package observer_pattern_self;

public class ConcreteObserver implements Observer {
    @Override
    public void update() {
        System.out.println("我也变");
    }
}
