import java.util.*;
public class understandingStringstorage {
    public static void main(String args[]){
        String str="abc";
        String str1="abc";
        String str2=new String("abc");
        String str3="abc";
        System.out.println(str);
        str="xyz";
        str1=str1+"def";
        System.out.println(str1);
    }
}
