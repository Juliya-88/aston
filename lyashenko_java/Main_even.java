import java.util.Scanner;

class Main_even {
  public static void main(String[] args) {
	// переменные
	String[] strArray = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
	Double a_double, b_double, delta_double;
	int a_int;
	int delta_int;

	// назначение программы
    System.out.println("выводим только четные значения из массива чисел");
	if (args.length > 0) {
		strArray = args;
	}
	else {
		System.out.println("Вы можете указать свой список значений при запуске программы");
		System.out.println("например: Main_even 1 3 5 7");
		System.out.println("по умолчанию используется набор '1 2 3 4 5 6 7 8 9 10'");
	}
	// обработаем каждый элемент массива
	for( int i = 0; i <= strArray.length - 1; i++)
	{
		try {
			// преобразуем строку в число
			a_double = Double.parseDouble(strArray[i]);
			// получим целый делитель от двух
			b_double = Math.floor(a_double / 2);
			// получим остаток от деления
			delta_double = a_double - b_double * 2;
			//если остаток от делении на 2 равен нулю
			if (delta_double == 0) {
				// число целое, выводим его
				System.out.println(strArray[i]);
			}
		} catch (NumberFormatException e) {
			// ошибка преобразования - значит это НЕ число
		}
	}
  }
}