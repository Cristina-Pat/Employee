package console_input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Employee {
	String age;
	String name;
	
	public Employee() {
		this.age = "0";
		this.name = "Unknown";
	}
	
	public void consoleOut() {
		System.out.println(this.name + " - " + this.age);
	}
	
	public void readConsoleIn() throws IOException {
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
	     	
	    System.out.println("Please insert the employee's name:");
	 
	    //Reading data using readLine
	    this.name = reader.readLine();
	    
	    System.out.println("Please insert the employee's age:");
		 
	    //Reading data using readLine
	    this.age = reader.readLine();

	}
	
}





public class Test {
    public static void main(String[] args)
        throws IOException
    {
    	Employee employee = new Employee();
    	employee.consoleOut();
    	employee.readConsoleIn();
    	employee.consoleOut();
    	
     	//BufferedReader reader = new BufferedReader(
            //new InputStreamReader(System.in));
     	
     	//System.out.println("Please insert a string:");
 
        // Reading data using readLine
        //String name = reader.readLine();
        
        // System.out.println("Please insert a string:");
        
        // Printing the read line
        //System.out.println(name);
    }
}
