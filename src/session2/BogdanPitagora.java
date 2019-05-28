package session2;

public class BogdanPitagora implements PitagoraChecker {

	public boolean check(int a, int b, int c) {
		if ((a * a) + (b * b) == (c * c)) {
			return true;
		}
		return false;
	}
}
