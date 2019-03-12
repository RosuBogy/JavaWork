package test2;

public class CeasDigital {
	public static void main(String[] args) throws InterruptedException {
		TimeConvert tc = new TimeConvert();
		Display display = new Display();

		while (true) {
			String time = tc.getTimeAsString();
			// System.out.println(time);
			display.show(time);

			Thread.sleep(1000);
		}
	}

}
