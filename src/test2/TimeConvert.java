package test2;

public class TimeConvert {

	public String getTimeAsString() {
		long time = System.currentTimeMillis();
		long secondsInDay = time % (24 * 60 * 60 * 1000) / 1000;
		long ss = secondsInDay % 60;
		long mm = secondsInDay / 60 % 60;
		long hh = secondsInDay / (60 * 60) % (60 * 60) + 2;

		if (ss <= 9) {

			return adaugaZero(hh) + ":" + adaugaZero(mm) + ":" + adaugaZero(ss);
		}

		return hh + ":" + mm + ":" + ss;
	}

	private String adaugaZero(long n) {

		String out = Long.toString(n);

		if (n <= 9) {
			return "0" + n;
		}
		return "" + n;

	}

}
