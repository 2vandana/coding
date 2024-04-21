import java.util.*;
public class removeduplicate {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
       
        int i;
        for(i=0;i<arr.length-1;i++){
            arr[0]=6;
          int temp=arr[i];
          
            arr[i+2]=temp;
        }
        for(int j=0;j<arr.length;j++){
       System.out.print(arr[j]+" ");

    }
}
}