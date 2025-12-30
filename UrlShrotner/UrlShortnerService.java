package UrlShrotner;

public class UrlShortnerService {
    private final UrlRepo repo;
    private final ShorteningStrategy strategy;

    public UrlShortnerService(UrlRepo repo, ShorteningStrategy strategy){
        this.repo = repo;
        this.strategy = strategy;
    }

    public String shorten(String longUrl){
        String code = strategy.generate(longUrl);
        while(repo.find(code)!=null){
            code = strategy.generate(longUrl + System.nanoTime());
        }
        UrlMapping map = new UrlMapping(code, longUrl);
        repo.save(map);
        return code;
    }

    public String resolve(String code) {
        UrlMapping map = repo.find(code);
        return (map == null) ? null : map.getLongUrl();
    }
}
