package observer_pattern_self;


public class Client {

    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        ConcreteObserver concreteObserver = new ConcreteObserver();
        concreteSubject.addObserver(concreteObserver);
        concreteSubject.doSomething();
    }

}
