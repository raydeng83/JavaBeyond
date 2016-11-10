package networking;

import java.net.URL;

/**
 * Created by z00382545 on 11/10/16.
 */
public class UrlParsingExample {
    public static void main(String[] args) throws Exception {

        URL aURL = new URL("https://www.amazon.com/s/ref=nb_sb_noss?url=search-alias%3Daps&field-keywords=java");

        System.out.println("protocol = " + aURL.getProtocol());
        System.out.println("authority = " + aURL.getAuthority());
        System.out.println("host = " + aURL.getHost());
        System.out.println("port = " + aURL.getPort());
        System.out.println("path = " + aURL.getPath());
        System.out.println("query = " + aURL.getQuery());
        System.out.println("filename = " + aURL.getFile());
        System.out.println("ref = " + aURL.getRef());
    }
}
