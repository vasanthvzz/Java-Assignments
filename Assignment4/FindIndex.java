public class FindIndex{

    public static void main(String[] args) {
        int[] arr = {12,54,23,56,211,1,4,65,40};
        int n = 65;
        System.out.println(indexFind(arr, n));
    }

    static int indexFind(int[] arr , int target){
        for(int i = 0 ;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}