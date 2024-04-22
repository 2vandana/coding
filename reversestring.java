import java.util.*;
public class reversestring {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String str="abcd";
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}
