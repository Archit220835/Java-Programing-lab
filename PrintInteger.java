/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java .util.Scanner;
public class PrintInteger
{
	public static void main(String[] args) {
	    Scanner reader = new Scanner ( System.in);
	    System.out.println("Required packages have been imported");
	    System.out.print ("A reader object has been defined");
	    System.out.print (" Enter an integer:");
	    int number = reader.nextInt ();
    System.out.print (" the next Int  method is used to read the integer value ");
		System.out.println("The intrger is:" + number);
	}
}