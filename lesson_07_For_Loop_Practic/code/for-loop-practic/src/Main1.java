
public class Main1 {
    public static void main(String[] args) {

        System.out.println("Multiplication table - 2");
        // Вывести на экран таблицу квадратов чисел от 1до 100

        // алгоритм:
        // - цикл 1 будет переберать числа от 1 до 9, параметр i от 1 до 9, i++
        // - цикл 2 (вложенный)будет перебирать числа от 1 до 9, параметр j от 1 до 9, i++
        // внутри цикла печатаем результат умножения i * j
        // переход на новую строку делаем при i которое делится на 10 без остатка

        for (int i = 1; i < 100 ; i++) {
            System.out.print("\t" + i + " * " + i + " = " + i*i); // "\t" - добавляет табуляцию в печать
          if ( i % 10 == 0){
              System.out.println(); // переход на новую строчку каждый 10 й раз
          }
        }

    }
}

