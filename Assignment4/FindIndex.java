public class FindIndex{

    public static void main(String[] args) {
        int[] arr = {12,54,65,23,56,211,1,4,65,40};
        int n = 12;
        System.out.println(indexFind(arr, n));
    }

    static int indexFind(int[] arr , int target){
        boolean visited = false;
        for(int i = 0 ;i<arr.length;i++){
            if(arr[i] == target){
                if(visited){
                    return i;
                }else{
                    visited = true;
                }

            } 
            }
        return -1;
    }
}