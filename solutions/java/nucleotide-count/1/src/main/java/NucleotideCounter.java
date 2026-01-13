import java.util.*;

class NucleotideCounter {
    Map<Character, Integer> nucMap;

        NucleotideCounter(String sequence) throws IllegalArgumentException {
        nucMap = new HashMap<>();

        nucMap.put('A', 0);
        nucMap.put('C', 0);
        nucMap.put('G', 0);
        nucMap.put('T', 0);
        
        for(char nucleotide: sequence.toCharArray()) {
            if(nucMap.containsKey(nucleotide)) {
                int count = nucMap.get(nucleotide);
                nucMap.put(nucleotide, count + 1);
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    Map<Character, Integer> nucleotideCounts() {
        return nucMap;
    }

}