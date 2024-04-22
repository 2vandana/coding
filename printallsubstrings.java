import java.util.*;
public class printallsubstrings {
    public static void main(String args[]){
        String str="pqrs";
        for(int i=0;i<str.length();i++){
            for(int j=0;j<str.length();j++){
                if(i<=j){
                System.out.print(str.substring(i,j+1)+" ");
            }}
            System.out.println();
        }

    }
}
