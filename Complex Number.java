import java.util.*;
class CN
{
  public static void main(String[] args)
  {
		Scanner s = new Scanner(System.in);

		int real1 = s.nextInt();
		int imaginary1 = s.nextInt();

		int real2 = s.nextInt();
		int imaginary2 = s.nextInt();

		ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
		ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

		int choice = s.nextInt();
		 
		if(choice == 1)
        {
			c1.plus(c2);
			c1.print();
		}
		else if(choice == 2)
        {
			c1.multiply(c2);
			c1.print();
		}
		else
        {
			return;
		}
	}
}
public class ComplexNumbers
{
	int r,i,x=0;
    public ComplexNumbers(int real,int imag)
    {
        r=real;
        i=imag;
    }
    public void plus(ComplexNumbers c2)
    {
        x=r+c2.r;
        i=i+c2.i;
    }
    public void multiply(ComplexNumbers c2)
    {
        x=r*c2.r-i*c2.i;
        i=(r*c2.i)+(i*c2.r);
    }
    public void print()
    {
        System.out.print(x+" + i"+i);
    }
}