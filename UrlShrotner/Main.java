package UrlShrotner;

public class Main {
    public static void main(String[] args) {

        UrlRepo repo = new InMemoryRepo();
        ShorteningStrategy strat = new HashBasedStrategy();
        UrlShortnerService service = new UrlShortnerService(repo, strat);

        String longUrl = "https://example.com/profile/123";

        String code = service.shorten(longUrl);
        System.out.println("Short code: " + code);

        String resolved = service.resolve(code);
        System.out.println("Resolved URL: " + resolved);
    }
}

