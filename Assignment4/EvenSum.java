public class EvenSum{

    public static void main(String[] args) {
        int[] arr = {12,54,23,56,211,1,4,65,40};

        System.out.println(evenSum(arr));
    }

    static int evenSum(int[] arr){
        int sum = 0;
        for(int i = 0 ;i<arr.length;i++){
            sum+= arr[i]%2==0 ? arr[i] : 0;
            }
        
        return sum;
    }

}
