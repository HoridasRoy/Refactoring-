
public class Refactable {
	
	private MyCollection orders = new MyCollection();
	private String name = "Customer name";
	
	void printOwing()
	{
		Enumeration<E> e = orders.elements();
		double outstanding = 0.0;
		
		//print banner
		printBanner();
		
		// calculate outstanding
		while(e.hasMoreElements())
		{
			Order each = (Order) e.nextElement();
			outstanding += each.getAmount();
			
		}
		
		// print details 
		
		System.out.println("name: " + name);
		System.out.println("amount: " + outstanding);

	}

	public void printBanner() {
		System.out.println("*****************************");
		System.out.println("****** Customer Owes ********");
		System.out.println("*****************************");
	}

}
