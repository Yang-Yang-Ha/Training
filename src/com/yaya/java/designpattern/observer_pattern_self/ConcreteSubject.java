package observer_pattern_self;

public class ConcreteSubject extends Subject {
    @Override
    public void doSomething() {
        System.out.println("我变了");
        notifyObserver();
    }
}
