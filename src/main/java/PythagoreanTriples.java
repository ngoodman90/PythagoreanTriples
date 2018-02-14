import java.util.Scanner;

public class PythagoreanTriples
{
    public static void main( String[] args )
    {
        int upperBound;
        boolean onlyPrimitiveTriples;
        Scanner s = new Scanner(System.in);

        System.out.println( "Enter upper bound:" );
        upperBound = s.nextInt();

        System.out.println( "Enter if only prime triples should be displayed:" );
        onlyPrimitiveTriples = s.nextBoolean();

        TripletGenerator tripletGenerator = new TripletGenerator(onlyPrimitiveTriples);

        tripletGenerator.generateAllPythagoreanTriples(upperBound);
        System.out.println(tripletGenerator.toString());
    }
}
