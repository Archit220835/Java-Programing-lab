import java.util.*;    
public class Example
 {
 	public static void main(String[] args) 
 	{
 	    Scanner sc=new Scanner(System.in);
 	    Scanner sc1=new Scanner(System.in);
 	    System.out.println("enter the name");
 	    String name=sc.nextLine();
 	    
 	    System.out.println("enter the year");
 	    int i=sc.nextInt();
 	    
 	    String year=String.valueOf(i);
 	    System.out.println("enter the enrollment number");
 	    
 	    String enrollment=sc1.nextLine();
 	     String e=enrollment.substring(1,4);
 	    
 	    String joinedString=(name.concat(year)).concat(enrollment);
 	     System.out.println("joined String:"+joinedString);
 	    
 	}
 }