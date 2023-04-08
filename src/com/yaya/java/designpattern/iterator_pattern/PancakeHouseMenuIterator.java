package iterator_pattern;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator<MenuItem> {

	private ArrayList<MenuItem> items;
	int position=0;
	
	public PancakeHouseMenuIterator(ArrayList<MenuItem> items){
		this.items=items;
	}
	
	@Override
	public boolean hasNext() {
		return !(position >= items.size() || items.get(position) == null);
	}

	@Override
	public MenuItem next() {
		MenuItem menuItem=items.get(position);
		position++;
		return menuItem;
	}
}
