package program;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;
        try {
            URL url = new URL("http://193.40.243.200/soidutaja/");
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuffer buffer = new StringBuffer();
            int read;
            char[] chars = new char[1024];
            while ((read = reader.read(chars)) != -1)
                buffer.append(chars, 0, read);
            String lammas = buffer.toString();
            JSONObject jsonObj = new JSONObject(lammas);
            System.out.println(jsonObj);
        } finally {
            if (reader != null)
                reader.close();
        }
    }
}
