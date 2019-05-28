package session2;

public class Pitagora implements MyMyPitagoraChecker {

	public boolean check(int a, int b, int c) {
		if (a * a + b * b == c * c) {
			return true;
		}
		return false;
	}

}
