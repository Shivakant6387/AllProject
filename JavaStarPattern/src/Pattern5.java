import java.util.Scanner;

public class Pattern5 {
    public static void display(int row){
        for(int i=0;i<=row;i++){
            for(int j=row;j>i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<=(i*2);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the number  of the row needed to the print pattern");
        int row=scanner.nextInt();
        System.out.println("Printing pattern");
        display(row);
        scanner.close();
    }

}
