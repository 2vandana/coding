import java.util.*;
public class stringcompression {
    public static void main(String args[]){
     String str="abc";
     String str1="abc";
     String str3=new String("abc");
     if(str1.equals(str3)){  // comapring the content of the str 1 and str3
        System.out.println("both are equals");
     }
else{
    System.out.println("not equals");
}
}
}