package UrlShrotner;

public class Base62 {
     private static final String ALPHABET =
            "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final int BASE = 62;

    public static String encode(long value){
        value = Math.abs(value);
        if(value == 0)return "0";

        StringBuilder sb = new StringBuilder();

        while(value>0){
            int rem = (int) value % BASE;
            if(rem < 0) {
                rem += BASE;
            }
            sb.append(ALPHABET.charAt(rem));
            value = value / BASE;
        }
        return sb.reverse().toString();
    }
}
