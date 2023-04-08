package iterator_pattern;

public class Waitress {

    private PancakeHouseMenu pancakeHouseMenu;
    private DinnerMenu dinnerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinnerMenu dinnerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinnerMenuIterator = dinnerMenu.createIterator();
        System.out.println("Menu\n ---- \n Breakfast");
        printMenu(pancakeHouseMenuIterator);
        System.out.println("\n Lunch");
        printMenu(dinnerMenuIterator);

    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.println(menuItem.getName()
                    + "\n" + menuItem.getDescription()
                    + "\n" + menuItem.getPrice()
                    + "\n" + menuItem.getVegetatarian());
        }
    }

}
