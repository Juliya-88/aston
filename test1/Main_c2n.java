import java.util.Scanner;

class Main_c2n {
  public static void main(String[] args) {
	// ���������� ���������
    System.out.println("��������� ���� �����");
    // ���������� ���� � �������
    Scanner input = new Scanner(System.in);

    // �������� �������� "a"
    String a_string = new String("error");
	Double a_double = new Double(0.0);
	// ���� � ������ "error" ��������� ���� � �������
	while (a_string.equals("error")) {
		// ��������� - ������� ����� "a"
		System.out.print("������� ����� 'a': ");
		a_string = input.nextLine();
		try {
			// ����������� ������ � �����
			a_double = Double.parseDouble(a_string);
		} catch (NumberFormatException e) {
			// ������ �������������� - ������ ����� �� �����
			System.out.println("������: ��� �� ����� 'a': " + a_string);
			System.out.println();
			// ���������� � ������ "error" � ��������� ����
			a_string = "error";
		}
	}

    // �������� �������� "b"
    String b_string = new String("error");
	Double b_double = new Double(0.0);
	// ���� � ������ "error" ��������� ���� � �������
	while (b_string.equals("error")) {
		// ��������� - ������� ����� "b"
		System.out.print("������� ����� 'b': ");
		b_string = input.nextLine();
		try {
			// ����������� ������ � �����
			b_double = Double.parseDouble(b_string);
		} catch (NumberFormatException e) {
			// ������ �������������� - ������ ����� �� �����
			System.out.println("������: ��� �� ����� 'b': " + b_string);
			System.out.println();
			// ���������� � ������ "error" � ��������� ����
			b_string = "error";
		}
	}
    // ��������� ���� � �������
    input.close();
	// ��������� ���������
	if(a_double > b_double){
		System.out.println("a > b");
	}
	else if(a_double < b_double){
		System.out.println("a < b");
	}
	else{
		System.out.println("a = b");
	}
	// ��������
	System.out.println("a + b = " + (a_double + b_double));
	// ���������
	System.out.println("a - b = " + (a_double - b_double));
	// �������
	System.out.println("a / b = " + (a_double / b_double));
	// ���������
	System.out.println("a * b = " + (a_double * b_double));
  }
}