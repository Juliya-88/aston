import java.util.Scanner;

class Main_even {
  public static void main(String[] args) {
	// ����������
	String[] strArray = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
	Double a_double, b_double, delta_double;
	int a_int;
	int delta_int;

	// ���������� ���������
    System.out.println("������� ������ ������ �������� �� ������� �����");
	if (args.length > 0) {
		strArray = args;
	}
	else {
		System.out.println("�� ������ ������� ���� ������ �������� ��� ������� ���������");
		System.out.println("��������: Main_even 1 3 5 7");
		System.out.println("�� ��������� ������������ ����� '1 2 3 4 5 6 7 8 9 10'");
	}
	// ���������� ������ ������� �������
	for( int i = 0; i <= strArray.length - 1; i++)
	{
		try {
			// ����������� ������ � �����
			a_double = Double.parseDouble(strArray[i]);
			// ������� ����� �������� �� ����
			b_double = Math.floor(a_double / 2);
			// ������� ������� �� �������
			delta_double = a_double - b_double * 2;
			//���� ������� �� ������� �� 2 ����� ����
			if (delta_double == 0) {
				// ����� �����, ������� ���
				System.out.println(strArray[i]);
			}
		} catch (NumberFormatException e) {
			// ������ �������������� - ������ ��� �� �����
		}
	}
  }
}