public class PunnetSquare {
    public static void main(String[] args) {
        // Example usage and test cases
        String[][] result = punnettSquare("Tt", "Tt");
        for (String[] row : result) {
            for (String genotype : row) {
                System.out.print(genotype + " ");
            }
            System.out.println();
        }
    }

    /**
     * Generates a Punnett square for two given genotypes.
     *
     * @param genotype1 the first genotype
     * @param genotype2 the second genotype
     * @return a 2D array representing the Punnett square.
     */
    static String[][] punnettSquare(String genotype1, String genotype2) {
        // Validate input genotypes
        if (genotype1.length() != 2 || genotype2.length() != 2) {
            throw new IllegalArgumentException("Both genotypes must consist of exactly two alleles.");
        }

        // Create a 2x2 matrix to hold the Punnett square
        String[][] square = new String[2][2];

        // Populate the matrix with the combinations of alleles
        square[0][0] = "" + genotype1.charAt(0) + genotype2.charAt(0);
        square[0][1] = "" + genotype1.charAt(0) + genotype2.charAt(1);
        square[1][0] = "" + genotype1.charAt(1) + genotype2.charAt(0);
        square[1][1] = "" + genotype1.charAt(1) + genotype2.charAt(1);

        return square;
    }
}
