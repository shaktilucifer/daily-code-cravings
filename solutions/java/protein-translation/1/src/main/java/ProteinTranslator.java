import java.util.List;
import java.util.*;

class ProteinTranslator {
    Map<String, String> codonAminoMap = new HashMap<>();

    ProteinTranslator() {
        codonAminoMap.put("AUG", "Methionine");
        codonAminoMap.put("UUU", "Phenylalanine");
        codonAminoMap.put("UUC", "Phenylalanine");
        codonAminoMap.put("UUA", "Leucine");
        codonAminoMap.put("UUG", "Leucine");
        codonAminoMap.put("UCU", "Serine");
        codonAminoMap.put("UCC", "Serine");
        codonAminoMap.put("UCA", "Serine");
        codonAminoMap.put("UCG", "Serine");
        codonAminoMap.put("UAU", "Tyrosine");
        codonAminoMap.put("UAC", "Tyrosine");
        codonAminoMap.put("UGU", "Cysteine");
        codonAminoMap.put("UGC", "Cysteine");
        codonAminoMap.put("UGG", "Tryptophan");
        codonAminoMap.put("UAA", "STOP");
        codonAminoMap.put("UAG", "STOP");
        codonAminoMap.put("UGA", "STOP");
    }

    
    List<String> translate(String rnaSequence) {
        StringBuilder sb  = new StringBuilder();
        List<String> listToRet = new LinkedList<>();
        for(int i = 0; i < rnaSequence.length(); i++) {
            sb.append(rnaSequence.charAt(i));
            if((i + 1)%3 == 0) {
                if(codonAminoMap.containsKey(sb.toString())) {
                    String amino = codonAminoMap.get(sb.toString());
                    if(amino.equals("STOP")) {
                            sb.setLength(0);
                        break;
                    }
                    listToRet.add(amino);
                } else {
                    throw new IllegalArgumentException("Invalid codon");
                }
                sb.setLength(0);
            }
        }
        if(sb.toString().length() != 0) {
            throw new IllegalArgumentException("Invalid codon");
        } 
        return listToRet;
    }
}
