import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PunnetSquareTest {
    @Test
    void testPunnetSquare() {
        String genotype1 = "Aa";
        String genotype2 = "Bb";

        String[][] result = PunnetSquare.punnettSquare(genotype1, genotype2);

        String[][] expected = {
                {"AB", "Ab"},
                {"aB", "ab"}
        };

        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void testPunnetSquareWithSameGenotype() {
        String genotype1 = "AA";
        String genotype2 = "Aa";

        String[][] result = PunnetSquare.punnettSquare(genotype1, genotype2);

        String[][] expected = {
                {"AA", "Aa"},
                {"AA", "Aa"}
        };

        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void testPunnetSquareWithDifferentLetterCase() {
        String genotype1 = "Aa";
        String genotype2 = "bB";

        String[][] result = PunnetSquare.punnettSquare(genotype1, genotype2);

        String[][] expected = {
                {"Ab", "AB"},
                {"ab", "aB"}
        };

        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void testPunnetSquareWithDominantRecessive() {
        String genotype1 = "aa";
        String genotype2 = "bB";

        String[][] result = PunnetSquare.punnettSquare(genotype1, genotype2);

        String[][] expected = {
                {"ab", "aB"},
                {"ab", "aB"}
        };

        Assertions.assertArrayEquals(expected, result);
    }

}
