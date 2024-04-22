import java.util.*;
public class countvowels {

    public static void solve(String str,int length){
        int vowels=0; int constaunts=0; int whitespaces=0;
        str=str.toLowerCase();
        for(int i=0;i<length;i++){
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch== 'i' || ch == 'o' || ch == 'u')
            vowels++;
            else if(ch>='a' && ch<='z'){
                constaunts++;
            }else if(ch==' '){
                  whitespaces++;
            }}
            System.out.println("vowels"+ vowels);
            System.out.println("constanut"+constaunts);
            System.out.println("whitespaces"+whitespaces);
        }
    
    public static void main(String args[]){
       String str="Take u forward is Awesome";
       int length=str.length();
       solve(str,length);
    }

}
