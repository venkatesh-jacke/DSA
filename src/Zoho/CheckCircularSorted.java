package Zoho;

public class CheckCircularSorted {

    public static void main(String[] args) {
        int[] arr={ 7 };
        System.out.println(checkCircularSorted(arr));
    }
    static boolean checkCircularSorted(int[] a) {
        int c=0;
        for(int i=1;i<a.length;i++){
            if(a[i-1]>a[i]) c++;
        }
        if(c==1){
            return a[0]>a[a.length-1];
        }
        return false;
    }
}
