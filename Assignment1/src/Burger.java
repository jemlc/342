
public class Burger {
	//Ingredients
	//Buns
	private static final String TOP_BUN = "Top Bun";
	
	private static final String BOT_BUN = "Bottom Bun";
	
	//Patties
	private static final String BEEF_PATTY = "Beef Patty";
	
	private static final String CHICKEN_PATTY = "Chicken Patty";
	
	private static final String VEGGIE_PATTY = "Veggie Patty";
	
	//Cheese
	private static final String CHEDDER = "Chedder";
	
	private static final String MOZZARELLA = "Mozzarella";
	
	private static final String PEPPERJACK = "Pepperjack";
	
	//Veggies
	private static final String LETTUCE = "Lettuce";
	
	private static final String TOMATO = "Tomato";
	
	private static final String ONIONS = "Onions";
	
	private static final String PICKLE = "Pickle";
	
	private static final String MUSHROOMS = "Mushrooms";
	
	//Sauces
	private static final String KETCHUP = "Ketchup";
	
	private static final String MUSTARD = "Mustard";
	
	private static final String MAYONNAISE = "Mayonnaise";
	
	private static final String BARON_SAUCE = "Baron Sauce";
	
	private MyStack myStack;
	
	Burger(boolean theWorks)	{
		if(theWorks)	{ //creates baron burger
			myStack.push(BOT_BUN);
			myStack.push(KETCHUP);
			myStack.push(MUSTARD);
			myStack.push(MUSHROOMS);
			myStack.push(BEEF_PATTY);
			myStack.push(CHEDDER);
			myStack.push(MOZZARELLA);
			myStack.push(PEPPERJACK);
			myStack.push(ONIONS);
			myStack.push(TOMATO);
			myStack.push(LETTUCE);
			myStack.push(BARON_SAUCE);
			myStack.push(MAYONNAISE);
			myStack.push(TOP_BUN);
			myStack.push(TOP_BUN);
			myStack.push(PICKLE);
		} else	{ //creates basic burger
			myStack.push(BOT_BUN);
			myStack.push(BEEF_PATTY);
			myStack.push(TOP_BUN);
		}
	}
	
	public void changePatties(String pattyType)	{
		
	}
	
	public void addPatty()	{
		
	}
	
	public void addCategory(String type) {
		
	}
	
	public void removeCategory(String type) {
		
	}
	
	public void addIngredient(String type)	{
		
	}
	
	public void removeIngredient(String type)	{
		
	}
	
	@Override
	public String toString()	{
		return "";
	}
	
}



