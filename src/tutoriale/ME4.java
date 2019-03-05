package tutoriale;

public class ME4 {
	public static int eval(String s) {

		if (s.contains("+")) {
			int index = s.lastIndexOf("+");
			String left = s.substring(0, index);
			String right = s.substring(index + 1);
			return eval(left) + eval(right);
		} else if (s.contains("*")) {
			int index = s.lastIndexOf("*");
			String left = s.substring(0, index);
			String right = s.substring(index + 1);
			return eval(left) * eval(right);

		}

		return Integer.parseInt(s);
	}

	public static void main(String[] args) {
		System.out.println(eval("5*2+3*7+10"));
	}
}
