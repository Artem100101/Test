import org.jsoup.Jsoup;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static final String SEPARATORS_REGEX = "[\r\n\t,.!?;:()\\s\"\\[\\]]";
    public static void main(String[] args) {
        if (args.length != 1) {
            throw new IllegalArgumentException("Должен быть 1 аргумент");
        }
        String url = args[0];
        try {
            String html = Jsoup.connect(url).get().html();
            System.out.println(html);
            String[] bbb = html.split(SEPARATORS_REGEX);
            System.out.println(bbb);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
