import java.util.Scanner;

public class String_Method {
    public static void main(String[] args){
        //String isEmpty method and this method return us boolean i.e true and false
       String s = "Hello";
       String another = "";
       boolean a= another.isEmpty();
        System.out.println(a);

// String equals method this method do comparision of two String

//        String s= "Hello";
//        String another= "Hello";
//
//        if (s.equals(another)){
//            System.out.println("yes, those string are equals");
//        }else{
//            System.out.println("They are not equals");
//        }

        //String trim method this method  trim the empty spaces
//        String s="    Hello    ";
//        String another = "vipin";
//        String a=s.trim();
//        System.out.println(a);

        //String length method this method return us int and count the how many alphabet are there
//        String s="Hello";
//       int a= s.length();
//        System.out.println(a);

        //String toUppercase method this method convert all the alphabet into uppercase
         String name = "vipin";
         String myName = name.toUpperCase();
        System.out.println(myName);



    }
}
