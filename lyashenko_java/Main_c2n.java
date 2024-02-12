import java.util.Scanner;

class Main_c2n {
  public static void main(String[] args) {
	// назначение программы
    System.out.println("Сравнение двух чисел");
    // инициируем ввод с консоли
    Scanner input = new Scanner(System.in);

    // получаем значение "a"
    String a_string = new String("error");
	Double a_double = new Double(0.0);
	// пока в строке "error" повторяем ввод с консоли
	while (a_string.equals("error")) {
		// подсказка - введите число "a"
		System.out.print("введите число 'a': ");
		a_string = input.nextLine();
		try {
			// преобразуем строку в число
			a_double = Double.parseDouble(a_string);
		} catch (NumberFormatException e) {
			// ошибка преобразования - значит ввели НЕ число
			System.out.println("ошибка: это не число 'a': " + a_string);
			System.out.println();
			// возвращаем в строку "error" и повторяем ввод
			a_string = "error";
		}
	}

    // получаем значение "b"
    String b_string = new String("error");
	Double b_double = new Double(0.0);
	// пока в строке "error" повторяем ввод с консоли
	while (b_string.equals("error")) {
		// подсказка - введите число "b"
		System.out.print("введите число 'b': ");
		b_string = input.nextLine();
		try {
			// преобразуем строку в число
			b_double = Double.parseDouble(b_string);
		} catch (NumberFormatException e) {
			// ошибка преобразования - значит ввели НЕ число
			System.out.println("ошибка: это не число 'b': " + b_string);
			System.out.println();
			// возвращаем в строку "error" и повторяем ввод
			b_string = "error";
		}
	}
    // закрываем ввод с консоли
    input.close();
	// результат сравнения
	if(a_double > b_double){
		System.out.println("a > b");
	}
	else if(a_double < b_double){
		System.out.println("a < b");
	}
	else{
		System.out.println("a = b");
	}
	// сложение
	System.out.println("a + b = " + (a_double + b_double));
	// вычитание
	System.out.println("a - b = " + (a_double - b_double));
	// деление
	System.out.println("a / b = " + (a_double / b_double));
	// умножение
	System.out.println("a * b = " + (a_double * b_double));
  }
}