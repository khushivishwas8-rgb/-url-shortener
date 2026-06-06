package com.urlshortener;
import java.util.HashMap;
import java.util.Map;

public class URLStore {
    private final Map<String, String> store = new HashMap<>();
    public void save (String slug, String url){
        store.put(slug,url);

    }
    public String get(String slug){
        return store.get(slug);
    }
public boolean contains(String slug){
        return store.containsKey(slug);
    }

public int size(){
        return store.size();
    }
public void listAll(){
        for( Map.Entry<String,String> entry : store.entrySet())  {
            System.out.println(entry.getKey() + " "+ entry.getValue());

        }
}
}
