import java.util.*;
public class Searchelement {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int k=scan.nextInt();
        int arr[]={1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                System.out.print(i);
            }
        }
    
    }
}
