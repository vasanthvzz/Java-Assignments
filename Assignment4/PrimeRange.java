public class PrimeRange{


    public static void main(String[] args) {
        for(int i = 1 ;i<=30;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    static boolean isPrime(int n ){
        for(int i = 2; i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}