/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

class calci
{
		    private int i ;
		    private int j;
		    calci(int x,int y ){
		    i=x;
		    j=y;}
		    public void add()
		    {System.out.println (i+j);}
		    public void sub()
		    {System.out.println (i-j);}
		    public void mul()
		    {System.out.println (i*j);}
		    public void div()
		    {System.out.println (i/j);}
}
		   public class A
		   {
		    public static void main(String[] args)
		    {
		    calci c=new calci (3,4);
		    c.add();
		    c.sub();
		    c.mul();
		    c.div();}   
		    
		    
		    
		    
	}
