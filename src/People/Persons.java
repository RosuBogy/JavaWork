package People;

import java.io.Serializable;

public class Persons implements Serializable {
	private String name;
	private int age;
	private boolean glasses;

	public Persons(String name, int age, boolean glasses) {
		super();
		this.name = name;
		this.age = age;
		this.glasses = glasses;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", glasses=" + glasses + "]";
	}

}
