import java.util.*;
public class Stringbufferdemo {
    public static void main(String args[]){
        StringBuffer str=new StringBuffer("abc");
        str.setCharAt(0,'d');
        System.out.println(str);
        str.append("def");
        System.out.println(str);
        String s="d";
        for(int i=0;i<5;i++){
            s=s+'z';
        }
        System.out.println(s);
    }
}
