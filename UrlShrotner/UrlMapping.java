package UrlShrotner;

public class UrlMapping {
    private final String ShortCode;
    private final String longUrl;

    public UrlMapping(String ShortCode, String longUrl){
        this.ShortCode = ShortCode;
        this.longUrl = longUrl;
    }

    public String getShortCode() { return ShortCode; }
    public String getLongUrl()   { return longUrl;   }
}
