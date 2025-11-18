package UrlShrotner;

import java.security.MessageDigest;


public class HashBasedStrategy implements ShorteningStrategy{    
    private static final int CODE_LENGTH = 8;

    @Override
    public String generate(String longUrl){
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] digest = md.digest(longUrl.getBytes());

            long value = 0;

            for(int i=0;i<8;i++){
                value = (value << 8) | (digest[i] & 0xFF);
            }

            String base62 = Base62.encode(value);
            return base62.substring(0,Math.min(CODE_LENGTH,base62.length()));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
