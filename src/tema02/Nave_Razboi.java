package tema02;

public class Nave_Razboi implements Armata {
	private String nume;
	private int tunuri;
	private int rachete;

	public Nave_Razboi(String nume, int tunuri, int rachete) {
		super();
		this.nume = nume;
		this.tunuri = tunuri;
		this.rachete = rachete;
	}

	@Override
	public int FirePower() {
		return tunuri * 100 + rachete * 1000;
	}

	public void ShowName() {
		System.out.println(nume);

	}
}
