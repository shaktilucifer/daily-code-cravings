class RaindropConverter {

    String convert(int number) {
         StringBuilder sb = new StringBuilder();

        if(number % 3 == 0) {
            sb.append("Pling");
        }
        if(number % 5 == 0) {
            sb.append("Plang");
        }
        if(number % 7 == 0) {
            sb.append("Plong");
        }

        String ret = sb.toString();

        return ret.length() == 0 ? number+"" : ret;
        
    }

}
