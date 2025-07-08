package basic_problems;

import java.util.*;

public class UrlShortener {
    private static final String BASE62 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final int SHORT_URL_LENGTH = 6;

    private Map<String, String> longToShort = new HashMap<>();
    private Map<String, String> shortToLong = new HashMap<>();
    private Random random = new Random();

    public String shorten(String longUrl) {
        if (longToShort.containsKey(longUrl)) return longToShort.get(longUrl);
        String shortUrl = generateShortUrl();
        while (shortToLong.containsKey(shortUrl)) shortUrl = generateShortUrl();
        shortToLong.put(shortUrl, longUrl);
        longToShort.put(longUrl, shortUrl);
        return shortUrl;
    }

    public String restore(String shortUrl) {
        return shortToLong.getOrDefault(shortUrl, null);
    }

    private String generateShortUrl() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < SHORT_URL_LENGTH; i++) {
            int idx = random.nextInt(BASE62.length());
            sb.append(BASE62.charAt(idx));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        UrlShortener us = new UrlShortener();
        String original = "https://www.sejong.ac.kr/en";
        String shortUrl = us.shorten(original);
        String restored = us.restore(shortUrl);
        System.out.println("Original: " + original);
        System.out.println("Shortened: " + shortUrl);
        System.out.println("Restored: " + restored);
    }
}