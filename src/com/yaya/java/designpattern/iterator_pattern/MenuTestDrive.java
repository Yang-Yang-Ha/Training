package iterator_pattern;

/**
 * launcher
 * Created by YangXiaoGuo on 2017/6/7.
 */
public class MenuTestDrive {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinnerMenu dinnerMenu = new DinnerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinnerMenu);
        waitress.printMenu();
    }

}
