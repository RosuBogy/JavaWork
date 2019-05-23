package People;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ClientReader {

	public static void main(String[] args) throws IOException {
		Persons[] oameni = { //
				new Persons("Ion", 20, true), //
				new Persons("Gheo", 21, false), //
				new Persons("Maria", 20, true) //
		};
		save(oameni);
		oameni = load();
	}

	private static Persons load() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("clienti.txt")));

		while (true) {
			String s = br.readLine();
			if (s == null) {
				break;
			}
			System.out.println(s);
		}
		br.close();
	}

	private static void save(Persons[] persons) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(new File("clienti.txt"));

		for (Persons om : persons) {
			pw.println(om.toString());
		}
		pw.close();
	}
}
