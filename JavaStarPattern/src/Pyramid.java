import java.util.Scanner;


public class Pyramid {
    public static void display(int n){
        for(int i=1;i<=n;i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2)-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int k=1;k<=(i*2)-1;k++){
                System.out.print("*");
            }
            System.out.println();
            for (int j=n;j>=i;j--){

                System.out.print(" ");

            }

        }
    }
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of the n needed to print the  pattern ");
        int n=scanner.nextInt();
        System.out.println("show pattern");
        display(n);
    }
}
