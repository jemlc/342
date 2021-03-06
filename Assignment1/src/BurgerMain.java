import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * BurgerMain Class
 * @author Jeremy Manandic
 */
public class BurgerMain {
	
	/**
	 * Static counter.
	 */
	private static int counter = -1;
	/**
	 * Main method
	 * @param theArgs - the arguments
	 * @throws FileNotFoundException - throws if file cannot be found
	 */
	public static void main(String[] theArgs) throws FileNotFoundException	{
		new BurgerMain().testMyStack();
		new BurgerMain().testBurger();

	}
	
	/**
	 * Parse through the line of the order
	 * @param line - the burger being ordered
	 */
	public void parseLine(String line)	{
		Burger burger = new Burger(line.contains("Baron"));
	
		if(line.contains("with"))	{
			int withIndex = line.indexOf("with");
			int butIndex = line.indexOf("but");
			String omitOrAdd = line.substring(withIndex, butIndex);
			String butLine = line.substring(butIndex, line.length());
			String[] with = omitOrAdd.split(" ");
			String[] but = butLine.split(" ");
			if(omitOrAdd.contains("no"))	{
				for(int i = 0; i < with.length; i++)	{
					if(with[i].equals("Cheese") || with[i].equals("Veggies") 
							|| with[i].equals("Sauce"))	{
						burger.removeCategory(with[i]);
					} else if(!(with[i].equals("with") || with[i].equals("or") ))	{
						burger.removeIngredient(with[i]);
					}
				}
				if(line.contains("but"))	{
					for(int k = 0; k < but.length; k++)	{
						if(!but[k].equals("but")) {
							burger.addIngredient(but[k]);
						}
					}
				}
			} else	{
				for(int i = 0; i < with.length; i++)	{
					if(with[i].equals("Cheese") || with[i].equals("Veggies") 
							|| with[i].equals("Sauce"))	{
						burger.addCategory(with[i]);
					} else if(!(with[i].equals("with") || with[i].equals("or") ))	{
						burger.addIngredient(with[i]);
					}
				}
				if(line.contains("but"))	{
					for(int k = 0; k < but.length; k++)	{
						if(!but[k].equals("but")) {
							burger.removeIngredient(but[k]);
						}
					}
				}
			}
			
		}
		if(line.contains("Double"))	{
			burger.addPatty();
		} else if(line.contains("Triple"))	{
			burger.addPatty();
			burger.addPatty();
		}
		if(line.contains("Chicken"))	{
			burger.changePatties("Chicken");
		} else if(line.contains("Veggie "))	{
			burger.changePatties("Veggie");
		}
		
		
		System.out.println("Processing Order " + counter + ": " + line);
		System.out.println("[" + burger.toString() + "]");
		System.out.println();
	}
	
	/**
	 * This method tests the stack.
	 */
	public void testMyStack()	{
		System.out.println("*******Testing Stack*********");
		MyStack<String> stack = new MyStack<String>();
		stack.push("test item");
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());
		System.out.println(stack.size() == 0);
		System.out.println(stack.pop() == null);
		System.out.println(stack.peek() == null);
		stack.push("1");
		stack.push("2");
		stack.push("3");
		System.out.println(stack.toString());
		System.out.println(stack.isEmpty() == false);
		System.out.println(stack.peek() == "3");
		System.out.println(stack.size() == 3);
		System.out.println();
	}
	
	/**
	 * This method tests the burger.
	 * @throws FileNotFoundException - throws when file is not found.
	 */
	public void testBurger() throws FileNotFoundException	{
		System.out.println("********Testing Burger***********");
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("test.txt").getFile());
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine()) {
			counter++;
			parseLine(sc.nextLine());
		}
		sc.close();
	}
	
	
}
