public class DNAProtein {
    public static void main(String[] args) {
        // Example usage and test cases
        System.out.println(dnaProtein("ATGCGATACTGA")); // true
        System.out.println(dnaProtein("ATGCGATAGA"));   // false
        System.out.println(dnaProtein("ATGCGTGA"));     // false
        System.out.println(dnaProtein("ATGCGATGA"));    // true
    }

    /**
     * Determines whether the given DNA sequence represents a valid protein.
     *
     * @param dna the DNA sequence to be checked.
     * @return true if the DNA sequence represents a valid protein, false otherwise.
     */
    static boolean dnaProtein(String dna) {
        // Check if the sequence starts with "ATG" and ends with "TGA"
        if (dna.startsWith("ATG") && dna.endsWith("TGA")) {
            // Get the sequence between the start codon and the stop codon
            String between = dna.substring(3, dna.length() - 3);
            // Check if the length of the intermediate sequence is divisible by 3
            if (between.length() % 3 == 0) {
                return true;
            }
        }
        // If any condition is not met, return false
        return false;
    }
}

