package services.comon;

import entity.FileContext;

import java.util.HashMap;
import java.util.Map;

public class WordCalculator {
    public Map<String, Integer> calculate(FileContext fileContext) {
        String context = fileContext.getContext();
        String[] words = context.split(fileContext.getFilePattern());
        Map<String, Integer> calculatedMap = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if(isWord(word)) {
                int count = calculatedMap.getOrDefault(word, 0);
                calculatedMap.put(word, count + 1);
            }
        }

        return calculatedMap;
    }

    private boolean isWord(String word) {
        return word != null && !word.equals("") && word.length() > 1;
    }
}
