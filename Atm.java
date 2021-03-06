package Javaproject1;

import java.util.Scanner;

public class Atm {
   private static Scanner in;
   private static float balance=0;//initial balance to 0 for everyone
   public static int anotherTransaction;
	public static void main(String[] args) {
	in = new Scanner(System.in);
   //call our transaction method here
	transaction();
	}
public static void transaction() {
	//here is where most of work is
	int choice;
	System.out.println("Please select an option");
	System.out.println("1, Withdraw");
	System.out.println("2, Deposite");
	System.out.println("3, Balance");
	choice = in.nextInt();	
	
		switch(choice) {
		case 1:
			float amount;
			System.out.println("Please enter amount to withdraw:");
			amount = in.nextFloat();
			if(amount > balance || amount==0) {
				System.out.println("you have insufficient funds\n");
			anotherTransaction();//ask if they want another transaction
			}else {
				// they have some cash
				// update balance
				balance=balance-amount;
				System.out.println("you have withdraw " + amount + " and your  new balance is " + balance );
				anotherTransaction();
			}
			break;
		case 2:
			//option no 2 is depositing
			float deposit;
			System.out.println("Please enter amount to deposit: ");
			deposit = in.nextFloat();
			System.out.println("you have deposited "+ deposit);
			//update balance
			balance +=deposit;
			System.out.println("your new  balance is :" + balance);
			anotherTransaction();
			
			break;
		case 3:
			System.out.println("your balance is " + balance + "\n");
			anotherTransaction();
			
			break;
		default:
				System.out.println("Invalid option:\n\n");
			break;
			
		
	}
}
public static void anotherTransaction() {
	System.out.println("Do you want another transction?\n\nPress 1 for another transaction\n2 To Exit");
	anotherTransaction = in.nextInt();
	if(anotherTransaction==1) {
		transaction();//call transaction method
	}
	else if(anotherTransaction==2) {
		System.out.println("Thanks for choosing,Good Bye!");
	}else {
		System.out.println("Invalid choice\n\n");
		anotherTransaction();
	}
}
}
