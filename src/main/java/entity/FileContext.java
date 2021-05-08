package entity;

public class FileContext {
    private String context;
    private String filePattern;

    public FileContext(String context, String filePattern) {
        this.context = context;
        this.filePattern = filePattern;
    }

    public String getFilePattern() {
        return filePattern;
    }

    public String getContext() {
        return context;
    }
}
