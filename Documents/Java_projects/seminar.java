// /**
//  * Seminar
//  */
// public class seminar {
//   public static void main(String[] args) {
//     System.out.println("привет");  /* вывод на экран */
  
//   }
// }


// import java.util.Scanner;
// public class seminar {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in, "cp866");       // cp866 - настройка вывода
//         System.out.print("Введите имя: ");
//         String name = sc.next();
//         // .nextLine()   --- Считывает строчку 
//         // .next() --- считывает элемент
//         // .nextInt() --- считывает Число
//         //12 \n 
//         // num = 12
//         // .... sc.nextLine(); //
//         System.out.printf("Привет, %s, %d", name, 12);            // %s - техт, %d - число
//         sc.close();
//     }
// }



// /* Задание. Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество 
// подряд идущих 1.
// */

// public class seminar {
//     public static void main(String[] args) {
//         int[] array = { 1, 1, 0, 1, 1, 1, 1, 1 };
//         int count = 0;
//         int current = 0;
//         for (int i = 0; i < array.length; i++) {
//             if (array[i] == 1) {
//                 current += 1;
//             } else {
//                 if (current > count) {
//                     count = current;
//                 }
//                 current = 0;
//             }
//         }
//         if (current > count) {
//             count = current;
//         }
//         System.out.println(count);
//     }
// }


// /*  Задача. Дан массив nums = [3,2,4,3,3,1,5,3,3] и число val = 3. Если в массиве есть числа, равные 
//  заданному, нужно перенести эти элементы в конец массива. Таким образом, первые несколько (или все) 
//  элементов массива должны быть отличны от заданного, а остальные - равны ему.
 
//   [2 4 1 5 3 3 3 3 3].  Работать разрешается только с 1 массивом.
// */
// import java.util.Arrays;

// public class seminar {
//   public static void main(String[] args) {
//         int[] array = new int[] {3,2,4,3,3,1,5,3,3};
//         int val = 3;
//         int counter = 0;
//         for (int i = 0; i < array.length; i++) {
//             if (array[i] != val) {
//                 array[counter] = array[i];
//                 array[i] = val;
//                 counter += 1;
//             }
//         }
//         System.out.println(Arrays.toString(array));
//     }    
// }


// Семинар 2
//
/**
//  * Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N, которая 
//  * состоит из чередующихся символов c1 и c2, начиная с c1.
//  */
// public class seminar {
//     public static void main(String[] args) {
//         int number = 10;
//         char c1 = 'a';
//         char c2 = 'b';
//         metod(c1, c2, number);
//     }

//     public static void metod(char c1, char c2, int number) {
//         StringBuilder sb = new StringBuilder();
//         for (int i = 0; i < number/2; i++) {
//             sb.append(c1).append(c2);
//         }
//         System.out.println(sb);
//     }
// }


//    ДАЛЕЕ НАДО ВСЕ ПРОВЕРИТЬ - РАБОТАЕТ ИЛИ ...

// private static String method02_arch(String str1) {

//         String strRslt = "";
//         char curntChr = str1.charAt(0);
//         int qnt = 1;

//         for (int i = 1; i < str1.length(); i++) {
//             if (str1.charAt(i) == curntChr) {
//                 qnt++;
//             } else {
//                 strRslt += String.valueOf(curntChr) + (qnt > 1 ? qnt : "");
//                 curntChr = str1.charAt(i);
//                 qnt = 1;
//             }
//         }

//         strRslt += String.valueOf(curntChr) + (qnt > 1 ? qnt : "");

//         return strRslt;

//     }

// ////////////////////////////

// package geekBrains.javaApi.seminar.Seminar02;

// import static java.lang.Thread.sleep;

// public class Sem02_2online {

// // NIO(byte bufer ) ?!?! later ?


//     public static void main(String[] args) throws InterruptedException {
//         long m1 = System.currentTimeMillis();

// //        method01_strBldr_2(N);

// //        int N=10000;
// //        char a='a';
// //        char b='b';
// //
// //
//         String strIn = "aaaabbbccrccddfdddm";
//         System.out.println(strIn);

//         String strOut = method02_arch(strIn);

//         System.out.println(strOut);


//         sleep(500);
//         long m2 = System.currentTimeMillis();
//         System.out.println("время исполения: " + (m2 - m1 - 500));
//     }

//     private static String method02_arch(String str1) {

//         String strRslt = "";
//         char curntChr = str1.charAt(0);
//         int qnt = 1;

//         for (int i = 1; i < str1.length(); i++) {
//             if (str1.charAt(i) == curntChr) {
//                 qnt++;
//             } else {
//                 strRslt += String.valueOf(curntChr) + (qnt > 1 ? qnt : "");
//                 curntChr = str1.charAt(i);
//                 qnt = 1;
//             }
//         }

//         strRslt += String.valueOf(curntChr) + (qnt > 1 ? qnt : "");

//         return strRslt;

//     }

// //    private static void method01_strBldr_2() {
// //         int n=10;
// //
// //             StringBuilder stringBuilder = new StringBuilder();
// //            for (int i = 0; i < n/2; i++) {
// //                stringBuilder.append("c1c2");
// //            }
// //            System.out.println(stringBuilder);
// //
// //    }
// //Дано четное число N (>0) и символы c1 и c2.
// // Написать метод, который вернет строку длины N,
// // которая состоит из чередующихся символов c1 и c2, начиная с c1.
// //

//     private static String method01_strBldr(int N, char a, char b) {

//         StringBuilder str1 = new StringBuilder();
//         for (int i = 0; i < N / 2; i++) {
//             str1.append(a).append(b);
//         }
//         return str1.toString();
//     }


// }

// /////////////////////////////

// import java.io.File;
// import java.io.FileReader;
// import java.io.FileWriter;

// public class Main {
//     public static void main(String[] args) {
//         //Записать в файл слово TEST 10 раз
//         int n = 10;
//         String text = "TEST";
//         // try {
//         //     FileWriter writer = new FileWriter("file.txt", true);
//         //     for (int i = 0; i < n; i++) {
//         //         writer.write(text);
//         //         writer.write("\n");
//         //     }
//         //     System.out.println("Получилось!");
//         //     writer.close();
//         // }
//         // catch (Exception e){
//         //     System.out.println("Что то пошло не так");
//         // }
//         File fl = new File("file.txt");
//         try{
//             FileReader file = new FileReader(fl);
//             char[] arr = new char[(int) fl.length()];
//             file.read(arr);
//             for(char c: arr){
//                 System.out.print(c);
//             }
//             file.close();
//         }
//         catch (Exception e)
//         {
//             System.out.println("Что то пошло не так");
//         }
//     }
// }