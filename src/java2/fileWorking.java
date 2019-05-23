package java2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class fileWorking {
	public static void main(String[] args) throws IOException {

		readFile();

	}

	private static void readFile() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("test1.txt")));
		int suma = 0;

		while (true) {
			String s = br.readLine();
			if (s == null) {
				break;
			}
			String[] numere = s.split(",");

			for (String numar : numere) {
				suma += Integer.parseInt(numar);
			}
		}
		System.out.println(suma);

		br.close();
	}

	private static void writeFile() throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(new File("test1.txt"));
		pw.println("qwe");
		pw.println("asd");
		pw.println("zxc");
		pw.close();
	}

}
