// Project completed by Deziallia Morris
// Date: Feburary 18, 2022
package com.dezji;

import java.util.Iterator;

public class MyLinkedListIterator<E> implements Iterator<E> {

	MyLinkedList<E> list = new MyLinkedList<>();
	
	Node<E> currentNode = list.head;
	
	
	@Override
	public boolean hasNext() {
		if (currentNode != null)
			return true;
		return false;
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public E next() {
		Node<E> current = currentNode;
		currentNode = currentNode.next;
		return (E) current;
	}

}

class Node<E> {
    E element;
    Node<E> next;
    
    public Node (E element) {
        this.element = element;
    }
}

