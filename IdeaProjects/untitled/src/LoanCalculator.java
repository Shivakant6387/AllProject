import java.util.Scanner;

public class LoanCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the value ");
             int Amount =sc.nextInt();
                 int remainder=0;
             int n=sc.nextInt();
             for(int i=0;i<n;i++){
                 remainder=Amount/10;
                 Amount=Amount-remainder;

             }
        System.out.println(Amount);

    }
}
