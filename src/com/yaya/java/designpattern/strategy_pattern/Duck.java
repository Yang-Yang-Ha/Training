package strategy_pattern;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuauk() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float,even decoys");
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }


}
