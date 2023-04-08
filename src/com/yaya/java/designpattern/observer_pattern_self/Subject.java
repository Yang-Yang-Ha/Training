package observer_pattern_self;

import java.util.Vector;

abstract class Subject {
    private Vector<Observer> vector=new Vector<>();

    public void addObserver(Observer obs){
        vector.add(obs);
    }
    public void delObserver(Observer obs){
        vector.remove(obs);
    }
    protected void notifyObserver(){
        for(Observer o: vector){
            o.update();
        }
    }
    public abstract void doSomething();
}

/*
此处的集合使用vector是因为vector是线程安全的，但这样会影响效率
LinkedList用于增删改查操作比较多的集合。
 */
