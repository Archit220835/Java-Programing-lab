/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// 
import java.util.Scanner;

public class TwoDimensionalLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int numCols = scanner.nextInt();

        int[][] a = new int[numRows][numCols];

        System.out.println("Enter elements for the two-dimensional array:");

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print("Enter element at position (" + i + ", " + j + "): ");
                a[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Two-dimensional array elements are:");

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.println(a[i][j]);
            }
        }
        
        
    }
}