package chapter4;

public class Q1 {

	public static void main(String[] args) {
		
		char operator = '+';
		int num1 = 10;
		int num2 = 5;
		
		int result = 0;
		
		if(operator == '+') {
			result = num1 + num2;
		}
		else if(operator == '-') {
			result = num1 - num2;
		}
		else if(operator == '*') {
			result = num1 * num2;
		}
		else if(operator == '/') {
			result = num1 / num2;
		}
		else {
			System.out.println("������ �����Դϴ�");
			return;
		}
		System.out.println("��� ���� " + result + "�Դϴ�");
	}
}
