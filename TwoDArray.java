import java.util.Scanner;

public class twoDArray {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int [][]table = new int [3][3];
        int sum = 0;
        double average = 0;
        for (int r = 1; r < table.length; r++){
            System.out.println("Input value for row " + r);
            for (int c = 0; c < table [0].length; c++){
                table[r][c] = input.nextInt();
                sum = sum + table[r][c];
                average = sum/9;
            }
        }
        for (int r = 0; r < table.length; r++){
            for (int c = 0; c < table[0].length; c++){
                System.out.print(table[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average);
    }
}
