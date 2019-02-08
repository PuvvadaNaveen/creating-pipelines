package exceptionproj;

public class Test {
	
	public static void main(String[] args)  {
		try {
			
		
		saving saving = new saving();
		
		saving.accountno = 101;
		saving.getBalance();
		
		saving.withdraw(00);
		
		
		System.out.println(" End");
		}catch (Exception e) {
			e.getMessage();
	
		}
		System.out.println("Done");
	}
	
	
}
