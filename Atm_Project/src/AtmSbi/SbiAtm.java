package AtmSbi;
import java.util.Scanner;
public class SbiAtm {
     public static void main(String[] args) {
    	 int balance=10000;
    	 int withdraw;
    	 int deposit;
     Scanner sc=new Scanner(System.in);
     
     while(true) {
    	 System.out.println("SBI ATM");
    	 System.out.println("Choose 1 for withdraw");
    	 System.out.println("Choose 2 for Deposit");
    	 System.out.println("Choose 3 for Cheack Balance");
    	 System.out.println("Choose 4 for Exit");
    	 System.out.println("Choose the operation you want to perform");
        
    	 //get choice from user
    	 int choice=sc.nextInt();
    	 switch(choice) {
    	 case 1:
    		 System.out.println("Enter money to be withdrawn");
    		 withdraw=sc.nextInt();
            //check whether the balance is greater than or equal to the withdrawal amount  
    		 if(balance>=withdraw) {
                
                //remove the withdrawl amount from the total balance
    			 balance=balance-withdraw;
    			 System.out.println("Please collect your cash");
    		 }
    		 else {
                
               //show custom error message 
    			 System.out.println("Insufficient Fund..");
    		 }
    		 System.out.println("");
    		 break;
    	 case 2:
    		 System.out.println("Enter money to be Deposite");
           //get deposite amount from te user 
    		 deposit=sc.nextInt();
           //add the deposit amount to the total balanace   
    		 balance=balance+deposit;
    		 System.out.println("Your money has been succesfully deposit");
    		 System.out.println("");
    		 break;
    	 case 3:
    		  //displaying the total balance of the user  
    	        System.out.println("Balance : "+balance);  
    	        System.out.println("");  
    	        break;  
    	   
    	  case 4:  
    	        //exit from the menu  
    	        System.exit(0);   
    	 }
     }
     
}
     
}
