package java_projects_1;

/**
 * program
 */
// public class program {
// public static void main(String[] args) {
// System.out.println("Hello World");
// }

// }

// public class program {
// public static void main(String[] args) {
// String s = " 2" ;

// System.out.println(s);
// }

// }

// public class program {
// public static void main(String[] args) {
// var i = 123;
// var j = 123.456;

// System.out.println(j);
// System.out.println(getType(i));
// System.out.println(getType(j));
// }

// }

// public class program {
// public static void main(String[] args) {
// int i = 123_23_34;
// System.out.println(Integer.MIN_VALUE);
// }

// }

// public class program {
// public static void main(String[] args) {
// String s = "qwer";

// System.out.println(s.charAt(1));
// }

// }

// public class program {
// public static void main(String[] args) {
// int a = 123;

// System.out.println(a++);
// System.out.println(a);
// }

// }

// public class program {
// public static void main(String[] args) {
// boolean f = 123 != 321;

// System.out.println(f);
// }

// }

// public class program {
// public static void main(String[] args) {

// int a = 8;
// // 1000

// System.out.println(a = >> 1);
// }

// }

// public class program {
// public static void main(String[] args) {

// int a = 5;
// int b = 2;

// System.out.println(a | b );
// // 101
// // 010
// // 111

// // System.out.println(a & b )
// // 101
// // 010
// // 000
// // = 0

// // System.out.println(a ^ b )
// // 101
// // 010
// // 111
// // = 7
// }

// }

// public class program {
// public static void main(String[] args) {
// String s = "qwwe1"; // 4, 0...3
// // boolean a = true;
// boolean b = s.length() >= 5 || s.charAt(4) == 1;
// // boolean b = s.length() >= 5 | s.charAt(4) == 1;

// // System.out.println(a & b );
// // System.out.println(a && b );
// System.out.println(b);

// // 1
// // 0
// // 0

// }
// }

// Массивы
// public class program{
// public static void main(String[] args) {
// int[] arr = new int[] {1, 2, 3, 4, 5};
// arr[3] = 13;
// System.out.println(arr[3]);

// }
// }

// Многомерные массивы массивов
// public class program {
// public static void main(String[] args) {
// int[] arr[] = new int [3] [5];
// for (int[] line : arr) {
// for(int item : line) {
// System.out.printf("%d ", item);
// }
// System.out.println();
// }
// }
// }

// public class program {
// public static void main(String[] args) {
// int[][] arr = new int [3] [5];

// for (int i = 0; i < arr.length; i++) {
// for(int j = 0; j < arr[i].length; j++) {
// System.out.printf("%d ", arr[i][j]);
// }
// System.out.println();
// }
// }
// }

// ОШИБКА
// public class program {
// public static void main(String[] args) {
// byte b = Byte.parseByte("1211");
// System.out.println(b);
// }

// }

// Получени данных из терминала
// import java.util.Scanner;

// public class program {
// public static void main(String[] args) {
// Scanner iScanner = new Scanner(System.in);
// System.out.printf("name: ");
// String name = iScanner.nextLine();
// System.out.printf("Привет, %s!\n", name);
// iScanner.close();
// }

// }

// Некоторые примитивы
// import java.util.Scanner;
// public class program {
// public static void main(String[] args) {
// Scanner iScanner = new Scanner(System.in);
// System.out.printf("int a: ");
// int x = iScanner.nextInt();
// System.out.printf("double a: ");
// double y = iScanner.nextDouble();
// System.out.printf("%d + %f = %f", x, y, x + y);
// iScanner.close();
// }

// }

// Проверка на соответствие получаемого типа
// import java.util.Scanner;
// public class program {
// public static void main(String[] args) {
// Scanner iScanner = new Scanner(System.in);
// System.out.printf("int a: ");
// boolean flag = iScanner.hasNextInt();
// System.out.println(flag);
// int i = iScanner.nextInt();
// System.out.println(i);
// iScanner.close();
// }

// }

// Форматированный вывод
// public class program {
// public static void main(String[] args) {
// int a = 1, b = 2;
// int c = a + b;
// String res = a + " + " + b + " = " + c;
// System.out.println(res);
// }

// }

// public class program {
// public static void main(String[] args) {
// String s = "qwe";
// int a = 123;
// String q = s + a;
// System.out.println(q);
// }

// }

// public class program {
// public static void main(String[] args) {
// int a = 1, b = 2;
// int c = a + b;
// String res = String.format("%d + %d = %d \n", a, b, c);
// System.out.printf("%d + %d = %d \n", a, b, c);
// System.out.println(res);
// }

// }

// Виды спецификаторов
// public class program {
// public static void main(String[] args) {

// float pi = 3.1415f;
// System.out.printf("%f\n", pi); // 3,141500
// System.out.printf("%.2f\n", pi); // 3,14
// System.out.printf("%.3f\n", pi); // 3,141
// System.out.printf("%e\n", pi); // 3,141500e+00
// System.out.printf("%.2e\n", pi); // 3,14e+00
// System.out.printf("%.3e\n", pi); // 3,141e+00
// }
// }

// public class program {
// // static int t = 435; Глобальная переменная РАНО ТЕБЕ ЕЩЁ НА НЕЁ СМОТРЕТЬ
// ПАЦАН!!!!
// public static void main(String[] args) {
// // int a = 123;
// int b = 111;
// {
// int a = 222;
// System.out.println(a);
// }
// int a = 123;
// System.out.println(a);
// }

// }

// Функции и методы
// public class program {
// static void sayHi() {
// System.out.println("hi!");
// }
// static int sum(int a, int b) {
// return a+b;
// }
// static double factor(int n) {
// if(n==1)return 1;
// return n * factor(n-1);
// }
// public static void main(String[] args) {
// sayHi(); // hi!
// System.out.println(sum(1, 3)); // 4
// System.out.println(factor(5)); // 120.0
// }

// }

// Управляющие конструкции:
// условный оператор
// public class program {
// public static void main(String[] args) {
// int a = 1;
// int b = 2;
// int c;
// if (a > b) {
// c = a;
// } else {
// c = b;
// }
// System.out.println(c);
// }

// }

// public class program {
// public static void main(String[] args) {
// int a = 1;
// int b = 2;
// int c = 0;
// if (a > b) c = a;
// if (b > a) c = b;
// System.out.println(c);
// }

// }

// тернарный оператор
// public class Program {
// public static void main(String[] args) {
// int a = 1;
// int b = 2;
// int min = a < b ? a : b;
// System.out.println(min);
// }

// }

// Оператор выбора
// import java.util.Scanner;
// public class program {
// public static void main(String[] args) {
// int mounth = value;
// String text = " ";
// switch (mounth) {
// case 1:
// text = "Autumn";
// break;
// default:
// text = "mistake";
// break;
// }
// System.out.println(text);
// iScanner.close();
// }

// }

// public class program {
// public static void main(String[] args) {
// for (int i = 0; i < 10; i++) {
// if (i % 2 == 0)
// continue;
// System.out.println(i);
// }
// }

// }

// public class program {
// public static void main(String[] args) {
// for (int i = 0; i < 10; i++) {
// if (i % 2 != 0)
// continue;
// System.out.println(i);
// }
// }

// }

// public class program {
// public static void main(String[] args) {
// for (int i = 0; i < 10; i++) {
// if (i % 2 != 0)
// break;
// System.out.println(i);
// }
// }

// }

// public class program {
// public static void main(String[] args) {
// for (int i = 0; i < 10; i++) {
// for (int j = 0; j < 5; j++) {
// break;
// }
// if (i % 2 != 0)
// break;
// System.out.println(i);
// }
// }

// }

// Цикл while
// public class program {
// public static void main(String[] args) {
// int value = 321;
// int count = 0;
// while (value != 0) {
// value /= 10;
// count++;
// }
// System.out.println(count);
// }

// }

// Цикл do while
// public class program {
// public static void main(String[] args) {
// int value = 321;
// int count = 0;
// do {
// value /= 10;
// count++;
// } while (value != 0);
// System.out.println(count);
// }

// }

// Оператор цикла for
// public class program {
// public static void main(String[] args) {
// int s = 0;
// for (int i = 1; i <= 10; i++) {
// s += i;
// }
// System.out.println(s);
// }

// }

// Вложенные циклы
// public class program {
// public static void main(String[] args) {
// for (int i = 0; i < 5; i++) {
// for (int j = 0; j < 5; j++) {
// System.out.print("* ");
// }
// System.out.println();
// }
// // * * * * *
// // * * * * *
// // * * * * *
// // * * * * *
// // * * * * *
// }

// }

// Работает только для коллекций
// public class program {
// public static void main(String[] args) {
// int arr[] = new int[10];
// for (int item : arr) {
// System.out.printf("%d ", item);
// }
// System.out.println();
// }

// }

// public class program {
//     public static void main(String[] args) {

//     int[] arr = new int[] { 1, 2, 3, 4, 5, 77 };
//     for (int i = 0; i < arr.length; i++) {
//         // arr[i] = 10;
//     }
//     for (int item : arr) {
//         System.out.println(item);
//     }
//     }

// }



// Работа с файлами
// Создание и запись\ дозапись
// import java.io.FileWriter;
// import java.io.IOException;
// public class program {
//     public static void main(String[] args) {
//         try (FileWriter fw = new FileWriter("file.txt", false)) {
//             fw.write("line 1");
//             fw.append('\n');
//             fw.append('2');
//             fw.append('\n');
//             fw.write("line 3");
//             fw.flush();
//         } catch (IOException ex) {
//             System.out.println(ex.getMessage());
//     }
//  } }



// Чтение, Вариант посимвольно
// import java.io.*;
// public class program {
//     public static void main(String[] args) throws Exception {
//         FileReader fr = new FileReader("file.txt");
//         int c;
//         while ((c = fr.read()) != -1) {
//             char ch = (char) c;
//             if (ch == '\n') {
//                 System.out.print(ch);
//         } else {
//             System.out.print(ch);
//         }
//     }
//  } }



// Вариант построчно
import java.io.*;
/**
public class \program {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.printf("== %s ==", str);
        }
        br.close();
    }
    
}
/*










