import java.util.Scanner;

public class Pyramid {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(" ");
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
