
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
	
	private MyStack<String> myStack;
	
	private boolean myWorks;
	
	Burger(boolean theWorks)	{
		myWorks = theWorks;
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
	
	public void changePatties(String thePatty)	{
		MyStack<String> tempStack = new MyStack<String>();
		MyStack<String> endStack = new MyStack<String>();
		String item;
		while(!myStack.isEmpty())	{
			item = myStack.pop();
			if(item.equals(BEEF_PATTY) || item.equals(VEGGIE_PATTY) 
					|| item.equals(CHICKEN_PATTY)) {
				tempStack.push(thePatty);	
			} else {
				tempStack.push(item);
			}
		}
		while(!tempStack.isEmpty())	{
			endStack.push(tempStack.pop());
		}
		myStack = endStack;
	}
	
	public void addPatty()	{
		if(myWorks)	{
			
		}
	}
	
	public void addCategory(String theItem) {
		
	}
	
	public void removeCategory(String theItem) {
		
	}
	
	public void addIngredient(String theitem)	{
		
	}
	
	public void removeIngredient(String theItem)	{
		
	}
	
	@Override
	public String toString()	{
		return myStack.toString();
	}
	
}



