package iterator_pattern;

public class DinnerMenu {
	
	static final int MAX_ITEMS=6;
	int numberOfItems=0;
	private MenuItem[] menuItems;
	
	public DinnerMenu(){
		menuItems=new MenuItem[MAX_ITEMS];
		addItem("Vegetarain", 
				"Bacon with lettuce & tomato on whole wheat", true, 2.99);
		addItem("BLT",
				"Bacon with letuce & tomato on whole wheat",false,2.99);
		addItem("Soup of the day", 
				"Soup of the day, with a side of potato salan", false, 3.29);
		addItem("Hot Dog",
				"A hot dog, with saurkraut, relish ,onions,topped with cheese", false, 3.05);
	}
	
	public void addItem(String name,String description,
			boolean vegetarian,double price){
		MenuItem menuItem=new MenuItem(name, description, vegetarian, price);
		if(numberOfItems>=MAX_ITEMS){
			System.err.println("Sorry,menu is full!Can't add item to menu");
		}else{
			menuItems[numberOfItems] = menuItem;
			numberOfItems ++;
		}
	}
	
	public Iterator<MenuItem> createIterator(){
		return new DinnerMenuIterator(menuItems);
	}
}
