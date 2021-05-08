package services.imp.html;

import entity.FileContext;
import services.Calculator;
import services.comon.FileReader;
import services.comon.WordCalculator;

import java.util.Map;

public class HtmlWordCalculator implements Calculator {
    private static final String DEFAULT_PATTERN = "([\\s,.!?\";:\\[\\]\\(\\)\\/=<>'\\d$\\*_#&—\\+}{]+|-{2,})";

    private final HTMLDownloader htmlDownloader;
    private final FileReader fileReader;
    private final WordCalculator wordCalculator;

    public HtmlWordCalculator() {
        this.htmlDownloader = new HTMLDownloader();
        this.fileReader = new FileReader();
        this.wordCalculator = new WordCalculator();
    }

    @Override
    public void start(String url, String fileName) {
        try {
            htmlDownloader.save(url, fileName);
            String context = fileReader.readFile(fileName);
            FileContext fileContext = new FileContext(context, DEFAULT_PATTERN);
            Map<String, Integer> result = wordCalculator.calculate(fileContext);

            printResult(result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }

    private void printResult(Map<String, Integer> result) {
        System.out.println(result);
    }
}
