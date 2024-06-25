import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
//import static za.co.wethinkcode.ConsolidationOne.*;

public class DNAProteinTest {
    @Test
    void testDnaProteinWithValidProtein() {
        String dna = "ATGCGATACTGA";
        assertTrue(DNAProtein.dnaProtein(dna));
    }

    @Test
    void testDnaProteinWithInvalidProtein_LengthNotDivisibleByThree() {
        String dna = "ATGCGATAGA";
        assertFalse(DNAProtein.dnaProtein(dna));
    }

    @Test
    void testDnaProteinWithInvalidProtein_NoStartCodon() {
        String dna = "CGATACTGA";
        assertFalse(DNAProtein.dnaProtein(dna));
    }

    @Test
    void testDnaProteinWithInvalidProtein_NoStopCodon() {
        String dna = "ATGCGATACT";
        assertFalse(DNAProtein.dnaProtein(dna));
    }

    @Test
    void testDnaProteinWithInvalidProtein_ShorterThanMinimumLength() {
        String dna = "ATG";
        assertFalse(DNAProtein.dnaProtein(dna));
    }


}
