import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestDeProg {

	public static void main(String[] args) throws IOException {
		String fileName = "test.txt";

		BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
		bw.write("Premi�re ligne");
		bw.newLine();
		bw.write("Deuxi�me ligne");
		bw.newLine();

		bw.close();
	}

}
