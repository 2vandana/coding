import java.util.*;
public class secondsmallest {
    public static void main(String args[]){
        int arr[]={23,12,90,2};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    } 
    System.out.println();
   // System.out.println(arr[1]);
   System.out.println(arr[arr.length-2]);
}
}