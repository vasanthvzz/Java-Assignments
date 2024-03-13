package ProblemSolving;

public class allOffByOne {
    public static void main(String[] args) {
        int[] arr1 = {4,15,40,99};
        int[] arr2 = {5,16,41,100};
        System.out.println(recur(arr1, arr2));
    }

    public static boolean recur(int[] arr1,int[] arr2){
        if(arr1.length == 0 && arr2.length == 0){
            return true;
        }
        if((arr1.length == 0 || arr2.length == 0)){
            return false;
        }
        if(arr1[0]+1 == arr2[0]){
            return recur(trimArray(arr1), trimArray(arr2));
        }else{
            return false;
        }
    }
    public static int[] trimArray(int[] arr){
        if(arr.length==1){
            return new int[0];
        }
        int[] result = new int[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            result[i] = arr[i+1];
        }
        return result;
    }
}
