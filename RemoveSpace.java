import java.util.Scanner;

public class RemoveSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();//used for collect sentence
        str  = str.toLowerCase(); 

        String str2="";
        for (int i=0;i< str.length();i++){
            if(str.charAt(i)==' ' && str.charAt(i+1)==' '){

            }
            else{
                str2=str2+str.charAt(i);

            }
            
        }
        System.out.println(str2);
    }
}
