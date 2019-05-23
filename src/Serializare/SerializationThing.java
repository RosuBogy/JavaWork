package Serializare;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import People.Persons;

public class SerializationThing {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Persons[] oameni = { //
				new Persons("Ion", 20, true), //
				new Persons("Gheo", 21, false), //
				new Persons("Maria", 20, true) //
		};
		save(oameni);
		oameni = load();
		Persons[] x = load();
		System.out.println(x);
	}

	private static Persons[] load() throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.ser"));

		Persons[] result = (Persons) ois.readObject();

		ois.close();

		return result;
	}

	private static void save(Persons[] ion) throws FileNotFoundException, IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test.ser"));

		oos.writeObject(ion);

		oos.close();
	}

}
