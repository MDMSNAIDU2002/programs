package bank;
import java.util.*;
 
public class sbi{
	public static void main(String[] args) throws MyException {
        String user = "Mahanthi Durga Manikanata Swamynaidu";
        String password = "143naidu";
        int accno = 202202202;
        int balance = 15000,count=0;
        Scanner scan = new Scanner(System.in);
        if(count<3){
        System.out.println("Enter the user name:");
        String s = scan.nextLine();
        System.out.println("Enter the password:");
        String p = scan.nextLine();
       
        if (s.equals(user) && p.equals(password)) {
            boolean continueSession = true;
            while (continueSession) {
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");
                System.out.println("Please enter your choice:");
                int n = scan.nextInt();
                scan.nextLine();

                switch (n) {
                    case 1:
                        System.out.println("Enter your account number:");
                        int acnoInput = scan.nextInt();
                        scan.nextLine();

                        if (acnoInput == accno) {
                            System.out.println("The current balance is: " + balance);
                            System.out.println("Do you want to continue? (yes/no)");
                            String enq = scan.nextLine();
                            if (enq.equals("yes")) {
                                continueSession = true;
                            } else {
                                continueSession = false;
                            }
                        } else {
                            throw new MyException("Please check your account number.");
                        }
                        break;

                    case 2:
                        System.out.println("Enter the amount to deposit:");
                        int depositAmount = scan.nextInt();
                        scan.nextLine();
                        balance += depositAmount;
                        System.out.println("Amount deposited successfully.");
                        System.out.println("Your new balance is: " + balance);
                        System.out.println("Do you want to continue? (yes/no)");
                        String depositEnq = scan.nextLine();
                        if (depositEnq.equals("yes")) {
                            continueSession = true;
                        } else {
                            continueSession = false;
                        }
                        break;

                    case 3:
                        System.out.println("Enter the amount to withdraw:");
                        int withdrawAmount = scan.nextInt();
                        scan.nextLine();
                        if (withdrawAmount <= balance) {
                            balance -= withdrawAmount;
                            System.out.println("Amount withdrawn successfully.");
                            System.out.println("Your new balance is: " + balance);
                        } else {
                            System.out.println("Insufficient balance!");
                        }
                        System.out.println("Do you want to continue? (yes/no)");
                        String withdrawEnq = scan.nextLine();
                        if (withdrawEnq.equals("yes")) {
                            continueSession = true;
                        } else {
                            continueSession = false;
                        }
                        break;

                    case 4:
                        System.out.println("Exiting the system.");
                        continueSession = false;
                        break;

                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            }
        } else {
            count++;
            throw new MyException("Invalid username or password.");
            
        }
    }
    else{
        throw new MyException("you have entered 3 times the wrong username or password");
    }
    }
}

class MyException extends Exception {
    MyException(String s) {
        super(s);
    }
	     

}
