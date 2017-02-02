
package gitworkshop;

import java.util.Scanner;


public class GitWorkshop {

    
    public static void main(String[] args) {
        int a;
        int b;
        String operation;
        int answer;
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to My Calculator");
        System.out.println("Enter First Number");
        a = input.nextInt();
        System.out.println("Enter Second Number");
        b = input.nextInt();
        System.out.println("Enter operation");
        operation = input.next();
        if("+".equals(operation)){
            answer = a+b;
            System.out.println("The Answer is "+answer);

        }
    }
    
}
