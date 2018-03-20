//Maria Govea
//03/20/18
//This program is an Example of how to implement a Stack in Java


import java.util.Stack; //import the stack class 

public class stackMaria { //class name
	public static void main (String [] arg ) {  //main method
		
	
	Stack<String> names= new Stack<String>(); //Create a new Stack called "names" 
	
	names.push("Sam"); //add the fist name to the top of the stack 
	names.push("Jim"); //add the second name to the top of the stack 
	names.push("Jill"); //add the third name to the top of the stack 
	names.push("Mary"); //add the fourth name to the top of the stack 
	
	System.out.println (names.peek()); // This will print what is currently on the top of the stacks 
	
	System.out.println (names); //print the stack 
	
	names.pop()	; //remove the last item from the stack
	
	System.out.println(names); //print the stack 
	
	System.out.println(names.search("Sam")); //search for Sam in the stack 
	
	}
	
}
