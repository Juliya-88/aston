import java.util.Scanner;

class Main_c2s {
  public static void main(String[] args) {
	// назначение программы
    System.out.println("Сравнение двух строк");
    // инициируем ввод с консоли
    Scanner input = new Scanner(System.in);

    // получаем значение "a"
    String a_string = new String("error");
	// подсказка
	System.out.print("введите строку 'a': ");
	a_string = input.nextLine();

    // получаем значение "b"
    String b_string = new String("error");
	// подсказка
	System.out.print("введите строку 'b': ");
	b_string = input.nextLine();

	// результат сравнения
	if(a_string.equals(b_string)){
		System.out.println("Строки идентичны");
	}
	else{
		System.out.println("Строки неидентичны");
	}
    // закрываем ввод с консоли
    input.close();
  }
}