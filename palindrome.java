import java.util.*;
public class palindrome {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String str="madam";
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
           
             reverse=str.charAt(i)+reverse;
        }     
        
        if(str.equals(reverse)){
        System.out.println("yes palindrome");
    }else{
        System.out.println("no plaindrome");
    }
}
}