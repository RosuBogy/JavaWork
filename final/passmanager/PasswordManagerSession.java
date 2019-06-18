package passmanager;

import java.io.FileNotFoundException;
import java.io.IOException;

import filework.Database;
import filework.FileDatabase;
import filework.PasswordRepository;
import keyboard.Keyboard;

public class PasswordManagerSession {

	private Keyboard keyboard = new Keyboard();
	private Database database = new FileDatabase();
	private PasswordRepository repository = new PasswordRepository();

	private static PasswordManagerSession instance = new PasswordManagerSession();

	public static PasswordManagerSession getInstance() {
		return instance;
	}

	public Keyboard getKeyboard() {
		return keyboard;
	}

	public Database getDatabase() {
		return database;
	}

	public PasswordRepository getRepository() {
		return repository;
	}

	public void init() {
		try {
			Database database = repository.load();
			this.database = database;
		} catch (FileNotFoundException e) {
			System.out.println("File does not exist. Or it is created for the first time. Continue...");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
