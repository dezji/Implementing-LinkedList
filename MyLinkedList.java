// Project completed by Deziallia Morris
// Date: Feburary 18, 2022
package com.dezji;

import java.util.Iterator;

@SuppressWarnings("rawtypes")
class MyLinkedList<E> implements Iterable {
    
    Node<E> head = null;
    Node<E> tail = null;
    int size = 0;
    
	@Override
	public Iterator iterator() {
		MyLinkedListIterator<E> result = new MyLinkedListIterator<>();	
		return result;
	}

	public void insert(int index, E object) throws Exception {

		if (index < 0 || index > size)
	        throw new Exception ("Invalid index");
	    
	    Node<E> newNode = new Node<>(object);
	    
	    Node<E> current = head;
	    int counter = 0;
	    Node<E> previous = null;
	    
	    while (counter < index) {
	        previous = current;
	        current = current.next;
	        counter++;
	    }
	    
	    if (previous != null)
	        previous.next = newNode;
	    newNode.next = current;
	    
	    size++;
	    
	    if (index == 0)
	        head = newNode;
	    if (index == size - 1)
	        tail = newNode;
		
	}

	public void add(E object) {
		
		// create a new node to hold the new data value
	    Node<E> newNode = new Node<E>(object);
	    
	    // increment list size
	     size++;
	    
	    // insert the new node at the end of the linked list
	    if (head == null)
	        head = newNode;
	    else
	        tail.next = newNode;
	    tail = newNode;
		
	}

	public E get(int index) throws Exception {
		if (index < 0 || index > size - 1)
	        throw new Exception ("Invalid index");
	    
	    Node<E> current = head;
	    int counter = 0;
	    while (counter < index) {
	        current = current.next;
	        counter ++;
	    }
	    return current.element;
	}

	public int indexOf(E object) {
		
		Node<E> current = head;
	    int index = 0;
	    while (current != null) {
	        if (object.equals(current.element))
	            return index;
	        current = current.next;
	        index++;
	    }
	    return -1;
	}

	public int lastIndexOf(E object) {
		
		int result = -1;
	    Node<E> current = head;
	    int index = 0;
	    while (current != null) {
	        if (object.equals(current.element))
	            result = index;
	        current = current.next;
	        index++;
	    }
	    return result;
	}

	public E remove(int index) throws Exception {
		
		if (index < 0 || index > size -1)
	        throw new Exception ("Invalid index");
	    
	    Node<E> current = head;
	    int counter = 0;
	    Node<E> previous = null;
	    while (counter < index) {
	        previous = current;
	        current = current.next;
	        counter++;
	    }
	    
	    if (previous != null)
	        previous.next = current.next;
	    E result = current.element;
	    
	    size--;
	    
	    if (index == 0)
	        head = current.next;
	    if (index == size -1)
	        tail = previous;
	    
	    return result;
	}

	public E set(int index, E object) throws Exception {
		
		if (index < 0 || index > size -1)
	        throw new Exception ("Invalid index");
	    
	    Node<E> current = head;
	    int counter = 0;
	    while (counter < index) {
	        current = current.next;
	        counter++;
	    }
	    E result = current.element;
	    current.element = object;
	    return result;
	}

	public int size() {
		return size;
	}
	
	@Override
	public String toString() {
	    String result = "[";
	    Node<E> current = head;
	    
	    while (current != null) {
	        
	        // add this node's data to the resulting string
	        result += current.element;
	        if (current.next != null)
	            result += ", ";
	        
	        // advance to the next node
	        current = current.next;
	    }
	    return result + "]";
	}

}
