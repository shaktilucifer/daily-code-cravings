
class Cipher {
    private final String key;

    private String randomGenerateKey() {
        return "asdasdasdasdasdasdasdasdasdasdas";
    }

    public Cipher() {
        key = randomGenerateKey();
    }

    public Cipher(String key) {
        this.key = key;
    }

    public String getKey() {
        return this.key;
    }


    public String encode(String plainText) {
        StringBuilder stringBuffer = new StringBuilder();
        for (int i = 0; i < plainText.length(); i++) {
            char keyChar = this.key.charAt(i % key.length());
            int keyRot = keyChar - 'a';
            String encryptedString = new RotationalCipher(keyRot).rotate(String.valueOf(plainText.charAt(i)));
            stringBuffer.append(encryptedString);
        }
        return stringBuffer.toString();
    }

    public String decode(String cipherText) {
        StringBuilder stringBuffer = new StringBuilder();
        for (int i = 0; i < cipherText.length(); i++) {
            char keyChar = this.key.charAt(i % key.length());
            int keyRot = keyChar - 'a';
            String encryptedString = new RotationalCipher(keyRot).decodeRotate(String.valueOf(cipherText.charAt(i)));
            stringBuffer.append(encryptedString);
        }
        return stringBuffer.toString();
    }
}

class RotationalCipher {
    String alphabets = "abcdefghijklmnopqrstuvwxyz";
    String cipher = "";

    RotationalCipher(int shiftKey) {
        cipher = alphabets.substring(shiftKey, alphabets.length()) + alphabets.substring(0, shiftKey);
    }

    String rotate(String data) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < data.length(); i++) {
            char letter = data.charAt(i);
            char caps = Character.isUpperCase(letter) ? 'A' : 'a';
            int positionOfCharacter = letter - caps;
            if (positionOfCharacter < 0 || positionOfCharacter > 26) {
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

    String decodeRotate(String encrypted) {
        for (char ch : encrypted.toCharArray()) {
            for (int i = 0; i < cipher.length(); i++) {
                if (cipher.charAt(i) == ch) {
                    return String.valueOf(alphabets.charAt(i));
                }
            }
        }

        return "-";
    }
}
