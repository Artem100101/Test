package services.imp.html;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class HTMLDownloader {
    private static final String URL_PATTERN = "^(https?)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";

    public void save(String url, String fileName) throws IOException, IllegalArgumentException {
        validateUrl(url);

        InputStream ist = new URL(url).openStream();
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        final byte[] bytes = new byte[64];

        try {
            while (ist.read(bytes) != -1) {
                bufferedOutputStream.write(bytes);
                bufferedOutputStream.flush();
                fileOutputStream.flush();
            }
        } finally {
            ist.close();
            fileOutputStream.close();
            bufferedOutputStream.close();
        }
    }

    private void validateUrl(String url) throws IllegalArgumentException {
        if (!url.matches(URL_PATTERN)) {
            throw new IllegalArgumentException("Can not validate url: " + url);
        }
    }
}
