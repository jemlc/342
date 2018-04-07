/*
 * MyStack class
 * Author: Jeremy Manandic
 * Citations:
 */
public class MyStack<T> {
	
	private Node<T> myTop;
	
	MyStack()	{
	}
	
	public boolean isEmpty()	{
		return myTop == null;
	}
	
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
	
	public T peek()	{
		return myTop.myItem;
	}
	
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

