package tema02;

public class Avioane implements Armata {

	private String nume;
	private int nrRachete;
	private int nrBombe;

	public Avioane(String nume, int nrRachete, int nrBombe) {
		super();
		this.nume = nume;
		this.nrRachete = nrRachete;
		this.nrBombe = nrBombe;
	}

	@Override
	public int FirePower() {
		return nrRachete * 1000 + nrBombe * 2000;
	}

	public void ShowName() {
		System.out.println(nume);

	}

	public String getResource() {
		return "Avion";
	}

}
