import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int temp=number;
        int r=0,sum=0;
        while(number>0){
            r = number%10;
            sum = (sum*10) + r;
            number=number/10;

        }
        if(temp==sum){
            System.out.print(temp+" is a palindrome");
        }else{
            System.out.println(temp+" is not a palindrome");
        }
    }
    
}
