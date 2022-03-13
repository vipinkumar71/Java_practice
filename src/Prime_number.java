public class Prime_number {
    //find prime number from 2 to 1000
    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
                //means it is not prime
            }
        }
        return true;
        // it is prime
    }
    public static void main(String[] args){
     for(int i=2; i<1000; i++){
         if(isPrime(i)){
             System.out.println(i);
         }
     }
    }
}
