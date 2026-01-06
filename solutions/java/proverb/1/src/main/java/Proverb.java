class Proverb {
    private String[] words;
    Proverb(String[] words) {
      this.words = words;  
    }

    String recite() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < words.length; i++) {
            if(i == words.length - 1) {
                sb.append(String.format("And all for the want of a %s.", words[0]));
                break;
            } else {
                sb.append(String.format("For want of a %s the %s was lost.\n",  words[i], words[i+1]));
            }
        }
        return sb.toString();
    }

}
