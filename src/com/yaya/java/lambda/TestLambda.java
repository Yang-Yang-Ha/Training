package lambda;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Stephen
 */
public class TestLambda {

    public static void main(String[] args) {
        ArrayList<Hero> heroes = new ArrayList<>();
        int heroNumber = 10;

        for (int i = 0; i < heroNumber; i++) {
            Random random = new Random();
            heroes.add(new Hero("Hero" + i, 500*random.nextFloat(), random.nextInt(100)));
        }
        System.out.println("Before initialization");
        printHeroes(heroes);
        System.out.println("After filter with hp>100 && damage<50");
        filter(heroes,hero -> hero.getHp()>100&&hero.getDamage()<50);
        System.out.println("After sort by HP");
        sortByStaticFunction(heroes);
        printHeroes(heroes);
    }


    private static void printHeroes(ArrayList<Hero> heroes) {
        System.out.println("Heroes' sort:");
        for (Hero hero:heroes){
            System.out.println(hero);
        }
    }

    private static void filter(ArrayList<Hero> heroes,HeroFilter heroFilter) {
        for (Hero hero:heroes){
            if (heroFilter.check(hero)){
                System.out.println(hero);
            }
        }
    }

    private static void sortByObjectFunction(ArrayList<Hero> heroes){
        heroes.sort(Hero::compare);
    }

    private static void sortByStaticFunction(ArrayList<Hero> heroes){
        heroes.sort(ComparatorFunction::compare);
    }

}
