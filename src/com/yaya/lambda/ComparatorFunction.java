package com.yaya.lambda;

/**
 * @author Stephen
 */
public class ComparatorFunction {

    public static int compare(Hero hero1,Hero hero2){
        return Float.compare(hero2.getHp(),hero1.getHp());
    }
}
