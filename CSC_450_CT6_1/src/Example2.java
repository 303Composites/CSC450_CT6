import java.io.*;

public class Example2 {

	public static void main(String[] args) {
		BufferedReader buff = null;
		try {
			String data;

			buff = new BufferedReader(new FileReader("file2.txt"));
			while ((data = buff.readLine()) != null) {
				System.out.println(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (buff != null)
					buff.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}