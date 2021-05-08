package services.comon;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class FileReader {
    public String readFile(String fileName) throws IOException {
        FileInputStream fis = new FileInputStream(fileName);
        InputStreamReader isr = new InputStreamReader(fis, Charset.defaultCharset());
        BufferedReader br = new BufferedReader(isr);
        try {
            StringBuilder sb = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null) {
                sb.append(line);
            }

            return sb.toString();
        } finally {
            fis.close();
            isr.close();
            br.close();
        }
    }
}
