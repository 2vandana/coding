import java.util.*;
public class medain {
    public static void main(String args[]){
        int arr[]={2,4,1,3,5};
        //int arr[]={23,1,2,89,90};
        int median=0;
        int n=arr.length;
        if(arr.length%2==0){
                  median=((n)/2+((n/2)+1))/2;
        }else{
            median=(n+1)/2;
        }
        
        System.out.println(median);
    }
}
