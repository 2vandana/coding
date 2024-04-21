// import java.util.*;
// public class smallestelement{
//     public static void smallestarray(int arr[]){
//         int min=arr[0] ;// smallest elemnt aasume
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]<min){
//              min=arr[i];
//             }
//         }
//         System.out.println(min);
//     }
//     public static void main(String args[]){
//         int arr[]={2,4,1,8,0};
//         smallestarray(arr);
//     }
// }
// import java.util.*;
// public class smallestelement{
// public static void main(String args[]){
//     Scanner scan=new Scanner(System.in);
//     int n=scan.nextInt();
//     int arr[]=new int [n];
//     //taking input and print
//     for(int i=0;i<arr.length;i++){
//         arr[i]=scan.nextInt();
//     }
//     for(int i=0;i<arr.length;i++){
//         System.out.print(arr[i]+" ");
//     }
// }
// }


import java.util.*;
public class smallestelemnt{
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static int[] arr(int n){
Scanner scan=new Scanner(System.in);
 
     int arr[]=new int [n];
     //taking input and print
     for(int i=0;i<arr.length;i++){
         arr[i]=scan.nextInt();     }
   
      return arr;  
    }
public static void main(String args[]){
 Scanner scan=new Scanner(System.in);
 int n=scan.nextInt();
        print(arr(n));
    }
}