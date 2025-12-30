package UrlShrotner;

public interface UrlRepo {
    void save(UrlMapping map);
    UrlMapping find(String ShortCode); 
}