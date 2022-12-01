import java.util.Scanner;

public class Pattern7 {
    public  static void display(int rows){
        for(int i=rows;i>=1;i--){
            for(int k=1;k<=(i*2)-1;k++){
                System.out.print("*");
            }
            System.out.println();
            for (int j=rows;j>=i;j--){

                System.out.print(" ");
            }
        }
    }
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of the rows needed of the print pattern");
        int rows=scanner.nextInt();
        System.out.println("Printing pattern");
        display(rows);
    }
}
