package tema02;

public class CentralCommand {

	public static void main(String[] args) {
		int putere_totala1 = 0;
		int putere_totala2 = 0;
		Armata[] army1 = { new Soldati("Ion"), new Soldati("Marie"), //
				new Tancuri("Sherman", 10, 10), new Tancuri("Abrahams", 15, 20), //
				new Nave_Razboi("Nava1", 10, 10), new Nave_Razboi("Nava2", 10, 5), //
				new Submarine("Submarin1", 15), new Submarine("Submarin2", 5), //
				new Avioane("Avion1", 2, 2), new Avioane("Avion2", 1, 3) };

		Armata[] army2 = { new Soldati("Ghoerghe"), new Soldati("Vasile"), //
				new Tancuri("Sherman1", 10, 10), new Tancuri("Abrahams1", 15, 20), //
				new Nave_Razboi("Nava2", 10, 10), new Nave_Razboi("Nava3", 10, 5), //
				new Submarine("Submarin2", 15), new Submarine("Submarin3", 5), //
				new Avioane("Avion2", 2, 2), new Avioane("Avion3", 1, 3) };

		for (Armata resursa : army1) {
			resursa.ShowName();
			System.out.println(resursa.FirePower());
			putere_totala1 += resursa.FirePower();
		}

		System.out.println("Putere totala prima armata este: " + putere_totala1);

		for (Armata resursa : army2) {
			resursa.ShowName();
			System.out.println(resursa.FirePower());
			putere_totala2 += resursa.FirePower();
		}

		System.out.println("Putere totala a doua armata este: " + putere_totala2);
	}

}
