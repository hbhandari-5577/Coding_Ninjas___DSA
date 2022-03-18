import java.util.*;
class Fraction
{
    int num,den;
    static int count=1;
    public Fraction(int num1,int num2)
    {
        num=num1;
        den=num2;
        simplify();
    }
    void simplify()
    {
        int i,smaller,gcd=1;
        smaller=Math.min(num,den);
        for(i=2;i<=smaller;i++)
        {
            if(num%i==0 && den%i==0)
            {
                gcd=i;
            }
        }
        num=num/gcd;
        den=den/gcd;
    }
    public void print()
    {
        System.out.println("Fraction "+count+" = "+num+"/"+den);
        count++;
    }
}
class Add
{
    int num,den;
    public Add(Fraction f1,Fraction f2)
    {
        num=f1.num*f2.den+f2.num*f1.den;
        den=f1.den*f2.den;
        simplify();
    }
    void simplify()
    {
        int i,smaller,gcd=1;
        smaller=Math.min(num,den);
        for(i=2;i<=smaller;i++)
        {
            if(num%i==0 && den%i==0)
            {
                gcd=i;
            }
        }
        num=num/gcd;
        den=den/gcd;
    }
    public void print()
    {
        System.out.println();
        System.out.print("Fraction 1 + Fraction 2 = "+num+"/"+den);
    }
}
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num1,num2,num3,num4;
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();
        num4=sc.nextInt();
        Fraction f1=new Fraction(num1,num2);
        f1.print();
        Fraction f2=new Fraction(num3,num4);
        f2.print();
        Add a=new Add(f1,f2);
        a.print();
    }
}