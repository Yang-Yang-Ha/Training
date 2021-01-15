package lambda;

/**
 * @author Stephen
 */
public interface HeroFilter {

    /**
     * 对传进来的参数进行过滤
     * @param hero 进行判断的对象
     * @return true 表示通过，false表示失败
     */

    boolean check(Hero hero);
}
