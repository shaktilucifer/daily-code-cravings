class RotationalCipher {
    String alphabets = "abcdefghijklmnopqrstuvwxyz";
    String cipher = "";
    RotationalCipher(int shiftKey) {
        cipher =alphabets.substring(shiftKey, alphabets.length()) +         alphabets.substring(0, shiftKey);
            System.out.println(cipher);
    }

    String rotate(String data) {
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < data.length(); i++) {
            char letter = data.charAt(i);
            char caps = Character.isUpperCase(letter) ? 'A' : 'a';
            int positionOfCharacter = letter - caps;
            if(positionOfCharacter < 0 || positionOfCharacter > 26) {
                sb.append(letter);
                continue;
            }
            char encryptedChar = cipher.charAt(positionOfCharacter);
            char capitalizedEncryptedChar = caps == 'A' ? 
                Character.toUpperCase(encryptedChar) :
                Character.toLowerCase(encryptedChar);
                
            sb.append(capitalizedEncryptedChar);
        }
        return sb.toString();
    }

}
