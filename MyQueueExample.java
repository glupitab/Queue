//Maria Govea
//03/20/18
//This program is an Example of how to implement a Queue in Java

import java.util.Queue; //import the queue class
import java.util.LinkedList; //import the LinkedList class

public class MyQueueExample { //class name

	public static void main (String [] arg) { //main method 
		
	Queue<String> famaly = new LinkedList<String>()	; //
	
	famaly.add("mom"); //add mom to the family queue
	famaly.add("dad"); //add dad to the family queue
	famaly.add("brother"); //add brother to the family queue
	famaly.add("sister"); //add sister to the family queue
	
	System.out.println(famaly); //shows the contests of the queue

	famaly.remove(); //remove an item from the queue 
	
	System.out.println(famaly); //shows the contests of the queue
	System.out.println(famaly.peek()); //shows the top contests of the queue
	
	System.out.println(famaly); //shows the contests of the queue
	}
	
}