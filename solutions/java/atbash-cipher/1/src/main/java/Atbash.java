class Atbash {
    String ENCODING_KEY = "zyxwvutsrqponmlkjihgfedcba";
    String DECODING_KEY = "abcdefghijklmnopqrstuvwxyz";
    String encode(String input) {
        StringBuilder sb = new StringBuilder();   
        int characterCount = 0;
        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if(Character.isDigit(c)) {
                sb.append(c);
                characterCount++;
                if(characterCount % 5 == 0) sb.append(" ");                    continue;
            }
            int index = Character.toLowerCase(input.charAt(i)) - 'a';
            if(index < 0 || index > 26) continue;
            sb.append(ENCODING_KEY.charAt(index));
            characterCount++;
            if(characterCount % 5 == 0) sb.append(" ");
        }
        return sb.toString().trim();
    }

    String decode(String input) {
       StringBuilder sb = new StringBuilder();   

        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int index = Character.toLowerCase(input.charAt(i)) - 'a';
            if((index < 0 || index > 26) && !Character.isDigit(c)) continue;
            if(Character.isDigit(c)) {
                sb.append(c);
                continue;
            }
            sb.append(DECODING_KEY.charAt(ENCODING_KEY.indexOf(c)));

        }

        return sb.toString();
    }

}
