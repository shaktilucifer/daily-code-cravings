class IsbnVerifier {
    
    private boolean verifyAuthenticity(String tenDigitString) {
        int counter = 10;
        int sum = 0;
        for(Character ch : tenDigitString.toCharArray()) {
            if(counter == 1 && !Character.isDigit(ch)) {
                if(ch != 'X') return false;
                sum += 10;
                break;
            }
            if(!Character.isDigit(ch)) return false;
            sum = sum + (Character.getNumericValue(ch) * counter);
            counter--;
        }

        return sum % 11 == 0;
    }
    
    private boolean processStringWithoutDashes(String stringWithoutDashes) {
        if(stringWithoutDashes.length() != 10) return false;
        return verifyAuthenticity(stringWithoutDashes);
    }
    boolean isValid(String stringToVerify) {
        String[] splitStrings = stringToVerify.split("-");
        if(splitStrings.length == 1) {
            return processStringWithoutDashes(stringToVerify);
        }
        if(splitStrings.length != 4) return false;
        if(splitStrings[splitStrings.length - 1].length() != 1) return false;
        
        String stringWithoutDashes = String.join("", splitStrings);

        return processStringWithoutDashes(stringWithoutDashes);
    }

}
