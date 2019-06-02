package tema02;

public class Submarine implements Armata {
	private String nume;
	private int torpile;

	public Submarine(String nume, int torpile) {
		super();
		this.nume = nume;
		this.torpile = torpile;
	}

	@Override
	public int FirePower() {
		return torpile * 500;
	}

	public void ShowName() {
		System.out.println(nume);

	}

}
