import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        // Palindrome is a num that is == to its reverse.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = sc.nextInt();
        int rem = 0;
        int res = 0;
        int temp = num;
        // find reverse:
        while(num>0){
            rem = num%10; // 3
            // 1234 4321 ...0+4, 40+3, 430+2, 4320+1
            res = res*10+rem; //40; x=40
            num = num/10; //123           
        }
        System.out.println("Reverse is : " + res);

        if(temp==res){
            System.out.println(temp + " is a Palindrome.");
        }
        else {
            System.out.println(temp + " is not a Palindrome.");
        }

        sc.close();
    }
}
