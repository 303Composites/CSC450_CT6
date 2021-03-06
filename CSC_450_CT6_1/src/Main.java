import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String fileName = "file.txt";
 
        try (FileInputStream file = new FileInputStream(fileName)) {

            int i = 0;

            do {

                byte[] buf = new byte[1024];
                i = file.read(buf);
                
                String value = new String(buf, StandardCharsets.UTF_8);
                System.out.print(value);

            } while (i != -1);
            file.close();
            
        
        }
    }
}