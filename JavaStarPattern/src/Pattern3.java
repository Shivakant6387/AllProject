import java.util.Scanner;

public class Pattern3 {
    public  static void display(int rows){
    for(int i=1;i<=rows;i++){
        for(int j=rows;j>=i;j--){
            System.out.print("*");
        }
        for(int k=1;k<i;k++){
            System.out.print("");
        }
        System.out.println();
    }
    }
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of rows needed to print the pattern");
        int rows=scanner.nextInt();
        System.out.println("Printing the pattern ");
        display(rows);

    }
}
