package _19_string_and_regex.practice.crawl_song_list;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class CrawlSongExample {
    public static void main(String[] args) {
//        try {
//            URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");
//            // open the stream and put it into BufferedReader
//            Scanner scanner = new Scanner(new InputStream(url.openStream()) {
//                @Override
//                public int read() throws IOException {
//                    return 0;
//                }
//            });
//            scanner.useDelimiter("\\Z");
//            String content = scanner.next();
//            // close scanner
//            scanner.close();
//            // remove all new line
//            content = content.replaceAll("\\n+", "");
//            // regex
//            Pattern p = Pattern.compile("name_song\">(.*?)</a>");
//            Matcher m = p.matcher(content);
//            while (m.find()) {
//                System.out.println(m.group(1));
//            }
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
