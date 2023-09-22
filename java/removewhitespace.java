import java.util.*;
public class removewhitespace{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        String result = "";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c != ' '){
                result += c;
        }
    }
    System.out.print(result);
}
}