import java.util.Scanner;

class Main_c2s {
  public static void main(String[] args) {
	// ���������� ���������
    System.out.println("��������� ���� �����");
    // ���������� ���� � �������
    Scanner input = new Scanner(System.in);

    // �������� �������� "a"
    String a_string = new String("error");
	// ���������
	System.out.print("������� ������ 'a': ");
	a_string = input.nextLine();

    // �������� �������� "b"
    String b_string = new String("error");
	// ���������
	System.out.print("������� ������ 'b': ");
	b_string = input.nextLine();

	// ��������� ���������
	if(a_string.equals(b_string)){
		System.out.println("������ ���������");
	}
	else{
		System.out.println("������ �����������");
	}
    // ��������� ���� � �������
    input.close();
  }
}