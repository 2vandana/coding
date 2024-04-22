import java.util.*;
public class countwords {
    public static int countnowords(String str){
        int words=1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                words++;
            }
        }return words;
    }
   public static void main(String args[]) {
    Scanner scan=new Scanner(System.in);
    String str=scan.nextLine();
    int totalwords=countnowords(str);

    System.out.print(totalwords);
   
   }
}
