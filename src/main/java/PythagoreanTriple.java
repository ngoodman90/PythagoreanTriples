
import java.math.BigInteger;

public class PythagoreanTriple
{
    private int a;
    private int b;
    private int c;
    private boolean isPrimitive;

    PythagoreanTriple(int a, int b, int c)
    {
        if (a < b)
        {
            this.a = a;
            this.b = b;
        }
        else
        {
            this.a = b;
            this.b = a;
        }
        this.c = c;

        isPrimitive = isPrimitiveTriple();
    }

    public boolean isPrimitive()
    {
        return isPrimitive;
    }

    public int getC()
    {
        return c;
    }

    private boolean isPrimitiveTriple()
    {
        BigInteger bigA = new BigInteger(Integer.toString(a));
        BigInteger bigB = new BigInteger(Integer.toString(b));
        BigInteger bigC = new BigInteger(Integer.toString(c));

        return (bigA.gcd(bigB.gcd(bigC)).intValue() == 1);
    }



    @Override
    public String toString()
    {
        return "a: " + a + ", b: " + b + ", c: " + c + "\n";
    }
}