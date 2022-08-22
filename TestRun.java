// Project completed by Deziallia Morris
package com.dezji;

import static java.lang.System.out;

public class TestRun {

	public static void main(String[] args) throws Exception {

		MyLinkedList<String> names = new MyLinkedList<String>();
		
		names.add("Rue");
		names.add("Nate");
		names.add("Cassie");
		names.add("Maddy");
		names.add("Cal");
		names.add("Jules");
		names.add("Gia");
		names.add("Fezco");
		
		
		out.print(names.toString());
		

	}

}
