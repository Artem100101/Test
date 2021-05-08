import services.Calculator;
import services.imp.html.HtmlWordCalculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static String url = "";
    private static final String FILE_NAME = "page.html";
    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        if (args.length > 0) {
            url = args[0];
        } else {
            readIn();
        }

        Calculator calculator = new HtmlWordCalculator();
        while (true) {
            calculator.start(url, FILE_NAME);
            readIn();
        }
    }

    private static void readIn() throws IOException {
        System.out.println("Enter URL: ");
        url = READER.readLine();
    }

}
