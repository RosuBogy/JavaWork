package test2;

import java.util.Scanner;

public class MiniCalc {
	private double curValue = 0;

	public double doOperation(String operation) {
		if (!(operation.substring(1).matches("^[0-9]*"))) {
			return curValue;
		}

		char operatie = operation.charAt(0);
		double operand = Double.parseDouble(operation.substring(1));

		switch (operatie) {
		case '+':
			curValue += operand;
			break;
		case '-':
			curValue -= operand;
			break;
		case '*':
			curValue *= operand;
			break;
		case '/':
			if (operand == 0) {
				System.out.println("Nu se poate");
				break;
			}
			curValue /= operand;
			break;
		case '=':
			curValue = operand;
			break;
		default:
			return curValue;
		}

		return curValue;

	}

	public static void main(String[] args) {

		String op = null;
		Display disp = new Display();
		Scanner scanner = new Scanner(System.in);
		MiniCalc calc = new MiniCalc();

		while (true) {
			System.out.print(">");
			op = scanner.nextLine();
			if ("x".equals(op)) {
				scanner.close();
				break;
			}

			// int rez = (int) calc.doOperation(op);

			disp.show("" + calc.doOperation(op));

		}
		scanner.close();
	}
}
