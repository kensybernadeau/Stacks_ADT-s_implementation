package classes;

import interfaces.Stack;

public class ArrayStack<E> implements Stack<E> {
    private static int CAPACITY =100;
    private E[] data;
    private int top;
    
    public ArrayStack() {
    	this(CAPACITY);
    	
    }
    public ArrayStack(int capacity) {
    	data = (E[]) new Object[capacity];
    	top=-1;
    	
    }
    
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return (top+1);
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (top==-1);
	}

	@Override
	public E top() {
		// TODO Auto-generated method stub
		if(isEmpty()) return null;
		return data[top];
	}

	@Override
	public void push(E e) {
		// TODO Auto-generated method stub
		data[++top]=e;
		
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		if(isEmpty()) return null;
		E etr = data[top];
		data[top--]=null;
		return etr;
	}
	//mi error en hacer el revers fue de que el bottom del stack esta en el indice 0 y no en el n
	// por ende int i =0 y se suve hasta size()-1
	  public void showReverse() { 
		    if (size() == 0)
			   System.out.println("Stack is empty."); 
			else {
				for(int i =0; i<size();i++) {
				System.out.println(data[i]);
				}
			}
			   
	    }

}
