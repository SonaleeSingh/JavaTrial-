import java.util.Scanner;

public class CountTotalNumberOfWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();//used for collect sentence
        int spc_cnt=0;
     
        for(int i= 0; i<str.length();i++){
            if(str.charAt(i)==' '){
                spc_cnt++;
            }
        }
    int word_cnt=spc_cnt+1
;
System.out.println("word count="+word_cnt);    }
}
