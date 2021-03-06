
/**
 * myStack class
 * @author Jeremy Manandic
 *
 * @param <T>
 */
public class MyStack<T> {
	
	/**
	 * Node which is the top of the stack.
	 */
	private Node<T> myTop;
	
	/**
	 * empty constructor
	 */
	MyStack()	{
	}
	
	/**
	 * This method determines if the stack is empty.
	 * @return true if the stack is empty, false otherwise.
	 */
	public boolean isEmpty()	{
		return myTop == null;
	}
	
	/**
	 * This method pushes the current top and puts the new
	 * one on top.
	 * @param item - the item being added.
	 */
	public void push(T item)	{
		if(myTop == null)	{
			Node<T> createdNode = new Node<T>(item);
			myTop = createdNode;
		} else {
			Node<T> aNode = new Node<T>(item);
			aNode.next = myTop;
			myTop = aNode;
		}
	}
	
	/**
	 * This method pops the top off and returns the type of item.
	 * @return - the type of item.
	 */
	public T pop()	{
		T item;
		if(myTop == null)	{
			item = null;
		} else	{
			item = myTop.myItem;
			myTop = myTop.next;
		}
		return item;
	}
	
	/**
	 * This method looks at the top of the stack.
	 * @return the top of the stack.
	 */
	public T peek()	{
		T item;
		if(myTop == null)	{
			item = null;
		} else	{
			item = myTop.myItem;
		}
		return item;
	}
	
	/**
	 * This method returns the size of the stack.
	 * @return the size of the stack.
	 */
	public int size()	{
		int nodeCounter = 0;
		Node<T> currentNode = myTop;
		while(currentNode != null)	{
			nodeCounter++;
			currentNode = currentNode.next;
		}
		return nodeCounter;
	}
	
	@Override
	public String toString()	{
		StringBuilder sb = new StringBuilder();
		Node<T> currentNode = myTop;
		while(currentNode != null)	{
			if(sb.length() > 0)	{
				sb.append(", ");
			}
			sb.append(currentNode.myItem);
			currentNode = currentNode.next;
		}
		return sb.toString();
		
	}
	
	private static class Node<T>	{
		private T myItem;
		private Node<T> next;
		private Node(T theItem) {
			myItem = theItem;
		}
	}

}

