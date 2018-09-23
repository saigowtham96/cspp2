/**
 * class for "item".
 */
class Item {
	/**
	 * name of the item.
	 */
	String nameOfItem;
	/**
	 * quantity of the item.
	 */
	int quantityOfItem;
	/**
	 * cost of one unit of item.
	 */
	float unitprice;
	/**
	 * constructor for "item" class.
	 * @param      name       name of the item.
	 * @param      quantity   quantity of the item.
	 * @param      unitprice  unit price of the item.
	 */
	Item(final String name, final String quantity, final String unitprice) {
		this.nameOfItem = name;
		this.quantityOfItem = Integer.parseInt(quantity);
		this.unitprice = Float.parseFloat(unitprice);
	}
	/**
	 * constructor for class "item".
	 * @param      name      name of the item.
	 * @param      quantity  quantity of the item.
	 */
	Item(String name, String quantity) {
		this.nameOfItem = name;
		this.quantityOfItem = Integer.parseInt(quantity);
	}
	/**
	 * Gets the name of item.
	 * @return returns the name of item.
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(nameOfItem + " ");
		sb.append(quantityOfItem + " ");
		sb.append(unitprice);
		return sb.toString();
	}
	
}