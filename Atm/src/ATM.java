import java.util.*;

public class ATM {
	static void after_login(int amount, String text)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose below Operation to proced further");
		System.out.println("1. Transcation History\n2. Withdraw \n3. Deposite\n4. Transfer\n5. Quit ");
		System.out.print("Enter Number between 1 to 5 : ");
		LinkedList<String> lt = new LinkedList<String>();
        lt.add(text);		
		int option = sc.nextInt();
		
		switch(option)
		{
		case 1:
			System.out.print("Recent Transcation : ");
			System.out.println(lt);
			after_login(amount, " ");
		    break;
		    
		case 2:
			System.out.print("Enter Amount :");
			int x= sc.nextInt();
			int update_withdraw = 0;
			String s;
			if(x <= amount)
			{
				System.out.println("x-------------------------------x");
				System.out.println("Amount " + x + " Withdraw Successfull");
				update_withdraw = amount - x;
				System.out.println("Bank_Amount " +  update_withdraw);
				System.out.println("x-------------------------------x");
				s = x + " Withdraw";
				after_login(update_withdraw, s);
			}else {
				System.out.println("x-------------------------------x");
				System.out.println("Inavlid amount");
				System.out.println(" Current Amount in Bank " + amount );
				System.out.println("x-------------------------------x");
				s = "Transcation failed, Invalid amount";
				after_login(amount, s);
			}
			break;
			
		case 3:
			System.out.print("Enter Amount :");
			int y = sc.nextInt();
			String j;
			int new_status = 0;
			System.out.println("x-------------------------------x");
			System.out.println("Amount " + y + " Deposite Successfull");
			new_status = amount + y;
			System.out.println("Bank_Amount " +  new_status);
			System.out.println("x-------------------------------x");
			j = y + " Deposited";
			after_login(new_status, j);
			break;
			
		case 4:
			System.out.print("Enter Digital Bank Id: XXXX ");
			int id = sc.nextInt();
			System.out.print("Enter Amount : ");
			int z = sc.nextInt();
			String k;
			int update_withdraws = 0;
			if(z <= amount)
			{
				System.out.println("x-------------------------------x");
				System.out.println("Amount " + z + " Transfer Successfull");
				update_withdraws = amount - z;
				System.out.println("Bank_Amount " +  update_withdraws);
				System.out.println("x-------------------------------x");
				k= z + " Transfered";
				after_login(update_withdraws,k);
			}else {
				System.out.println("x-------------------------------x");
				System.out.println("Inavlid amount");
				System.out.println("Current Amount in Bank " + amount );
				System.out.println("x-------------------------------x");
				k= "Transcation failed, Invalid Transfer amount";
				after_login(amount, k);
			}
			break;
			
		case 5:
			System.out.println("x-------------------------------x");
			System.out.println("Log Out Successfull");
			System.out.println("x-------------------------------x");
			System.out.println("Login again, Enter Credentials");
			login();
			break;
		}
		sc.close();
	}
		static void login()
		{
			Scanner sc = new Scanner(System.in);
			int amount = 50000;
			String Name = "shivam";
			String Pass = "0909";
			
			/* login */
			System.out.print("User Name : ");
			String U_name = sc.next();
			System.out.print("Pin : ");
			String U_pin = sc.next();
			String blank=" ";
			
			if((U_name.equals(Name)) && (U_pin.equals(Pass)))
			{
				System.out.println("Login Successfull, Welcome " + Name);
				after_login(amount,blank);
			}
			
			sc.close();
		}
		public static void main(String args[])
		{
			login();
		}
}
