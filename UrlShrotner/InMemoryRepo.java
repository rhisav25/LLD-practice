package UrlShrotner;

import java.util.concurrent.ConcurrentHashMap;

public class InMemoryRepo implements UrlRepo {
    private final ConcurrentHashMap<String, UrlMapping> store = new ConcurrentHashMap<>();

    @Override
    public void save(UrlMapping map){
        store.put(map.getShortCode(), map);
    }

    @Override
    public UrlMapping find(String ShortCode){
        return store.get(ShortCode);
    }
}
