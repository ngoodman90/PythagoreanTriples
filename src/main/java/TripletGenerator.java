
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TripletGenerator
{
    boolean onlyPrimitiveTriples;
    private ArrayList<PythagoreanTriple> pythagoreanTriples;

    TripletGenerator(boolean onlyPrimitiveTriples)
    {
        this.onlyPrimitiveTriples = onlyPrimitiveTriples;
        pythagoreanTriples = new ArrayList<>();
    }

    public void generateAllPythagoreanTriples(int upperBound)
    {
        int a;
        int b;
        int c;

        for (int i = 1; i < upperBound; i++)
        {
            for (int j = i + 1; (c = (int)(Math.pow(j, 2) + Math.pow(i, 2))) < upperBound; j++)
            {
                a = (int)(Math.pow(j, 2) - Math.pow(i, 2));
                b = 2 * i * j;
                PythagoreanTriple pythagoreanTriple = new PythagoreanTriple(a, b, c);

                if (!onlyPrimitiveTriples || pythagoreanTriple.isPrimitive())
                {
                    pythagoreanTriples.add(pythagoreanTriple);
                }
            }
        }
        Collections.sort(pythagoreanTriples, Comparator.comparingInt(p -> p.getC()));
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("Number of generated triples: " + pythagoreanTriples.size() + "\n");
        for (PythagoreanTriple pt : pythagoreanTriples)
        {
            sb.append(pt.toString());
        }
        return sb.toString();
    }
}
