package com.urlshortener;
import java .util.Random;

public class URLShortener {

    // 1. Composition: URLShortener HAS-A URLStore instance variable
    private final URLStore store = new URLStore();

    // 2. Character pool for generating random slugs
    private static final String CHARACTERS =
            "abcdefghijklmnopqrstuvwxyz" +
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
            "0123456789";
    private final Random random = new Random();

    // 3. Method to shorten a URL
    public String shorten(String url){
        String slug;
        // The collision guard : generate util we get a totally unique slug

        do {
            slug = generateSlug();
        } while (store.contains(slug));

        //save it into our memory (the store)
        store.save(slug,url);
        return slug;
    }

    //4. Method to expand a slug back to the original URL
    public String expand(String slug) {
        return store.get(slug); //return  null if slug doesn't exits
    }

    // 5.pass through method to list everything inside the store
        public void listall(){
            store.listAll();
        }
    // 6. Helper method to build a random 6-Character String
    private String generateSlug(){
        StringBuilder sb  = new StringBuilder();
            for(int i = 0; i<6; i++){
                int index = random.nextInt (CHARACTERS.length()); //pick a random index 0-61
                sb.append(CHARACTERS.charAt(index));

            }
        return sb.toString();
    }
}
