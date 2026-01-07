class PhoneNumber {
    String dirtyNum;
    private void exT(String errorMessage) {
        throw new IllegalArgumentException(errorMessage);
    }
    PhoneNumber(String numberString) {
       StringBuilder sb = new StringBuilder();
        for(char ch: numberString.toCharArray()) {
            if(ch == ' ') continue;
             if(ch == '(' || ch == ')' || ch == '-' || ch == '.' || ch == '+') {
                continue;
            }
            if(Character.isLetter(ch)) {
                exT("letters not permitted");
            }
              if(!Character.isLetterOrDigit(ch)) {
                exT("punctuations not permitted");
            }
            if(Character.isDigit(ch)) {
                sb.append(ch);
            }
        }
        String numOnly = sb.toString();
        System.out.println(numOnly);
        if ( numOnly.length() < 10) {
            exT("must not be fewer than 10 digits");
        }

        if(numOnly.length() > 11) {
            exT("must not be greater than 11 digits");
        }
        if(numOnly.length() == 11) {
            if(numOnly.charAt(0) != '1') {
                throw new IllegalArgumentException("11 digits must start with 1");
            } 
            dirtyNum =  numOnly.substring(1);
        }  else {
                  dirtyNum = numOnly;      
        }

        String areaCode = dirtyNum.substring(0, 3);
        String exchangeCode = dirtyNum.substring(3, 6);
        String finalCode = dirtyNum.substring(6, 10);
        if(areaCode.charAt(0) == '0') 
        {exT("area code cannot start with zero");}
         if(areaCode.charAt(0) == '1') 
        {exT("area code cannot start with one");}
         if(exchangeCode.charAt(0) == '0') 
        {exT("exchange code cannot start with zero");}
         if(exchangeCode.charAt(0) == '1') 
        {exT("exchange code cannot start with one");}
    }

    String getNumber() {
 
        
         return dirtyNum;
    }

}