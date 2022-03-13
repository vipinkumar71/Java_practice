import java.util.Scanner;

public class Registration_Application {
    public static void main(String[] args){
        // Registration page Application
       Scanner sc=new Scanner(System.in);
        String name= "SS Academy";
        String password= "12345";
       int pass = 3;
     while(true){
         System.out.println("Please Enter your name");
         String nameInput = sc.nextLine();
         System.out.println("Please Enter your Password");
         String passwordInput = sc.nextLine();

         if (name.equals(nameInput) && password.equals(passwordInput)) {
             System.out.println("You Entered your name and password correctly");
             System.out.println("Welcome");
             break;
         }
         else if (!(name.equals(nameInput)) && password.equals(passwordInput)) {
             System.out.println("You entered your name false");
             pass -=1;
             System.out.println("Your chance == " + pass);
         }
         else if (name.equals(nameInput) && !(password.equals(passwordInput))) {
             System.out.println("Password is incorrect");
             pass -=1;
             System.out.println("Your chance == "+ pass);
         }
         else if(!name.equals(nameInput) && !password.equals(passwordInput)) {
             System.out.println("Password and name are both incorrect");
             pass -=1;
             System.out.println("Your chance == "+ pass);
           }
         if(pass==0){
             System.out.println("You use all your chances");
             break;
         }
        }
    }
}

