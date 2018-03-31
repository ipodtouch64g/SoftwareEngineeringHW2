
public class main extends Object {
	/* Main program for constructing UI
	 * NoSuchIDExceptions: handle wrong input ID
	 * NoSuchCommandExceptions: handle wrong input command
	 */ 
	public static void main(String[] args) {
		try {
			UI aUI = new UI();
		}
		catch(NoSuchIDExceptions e1){	
			System.out.println("No such ID\n");    
		}
		catch(NoSuchCommandExceptions e2) { 
			System.out.println("No such command\n");  
		}

	}

}


