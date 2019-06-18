package filework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PasswordRepository {

	private static final String PASSWORD_DATABASE = "AccountsDatabases.txt";

	public Database load() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PASSWORD_DATABASE));
		Database result = (Database) ois.readObject();
		ois.close();
		return result;
	}

	public void save(Database db) {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(PASSWORD_DATABASE));
			oos.writeObject(db);
			oos.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error while saving file");
			e.printStackTrace();
		}
	}

}
