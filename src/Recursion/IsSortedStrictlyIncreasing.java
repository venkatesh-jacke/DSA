package Recursion;

public class IsSortedStrictlyIncreasing{
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,4};
        System.out.println(isSortedStrictlyIncreasing(arr,0));

    }
    static boolean isSortedStrictlyIncreasing(int[] arr,int ind){

        if(ind==arr.length-1) return true;
        if(arr[ind]<arr[ind+1]){
            return isSortedStrictlyIncreasing(arr, ind+1);
        }else{
            return false;
        }

    }
}
