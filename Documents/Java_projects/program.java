 
///**
//  * program
//  */
// public class program {

//     public static void main(String[] args) {
//         System.out.println("Привет !!!");    /* вывод на экран */
//     }
// }

// class Program
// {
//  public static void main(String[] args) {
//  short age = 10;
//  int salary = 123456;
//  System.out.println(age); //10
//  System.out.println(salary); //123456
//  }
// }

// class Program
// {
//  public static void main(String[] args) {
//  float e = 2.7f;
//  double pi = 3.1415;
//  System.out.println(e); // 2.7
//  System.out.println(pi); // 3.1415
//  }
// }

// class Program
// {
//  public static void main(String[] args) {
//  char ch = '1';
//  System.out.println(Character.isDigit(ch)); // true
//  ch = 'a';
//  System.out.println(Character.isDigit(ch)); // false
//  }
// }

// public class program {
//     public static void main(String[] args) {
//         int a= 123;

//         System.out.println(a--);                       // 123
//         System.out.println(a);                         // 122
//         System.out.println(a++);                       // 122
//         System.out.println(a);                         // 123

//         boolean f=125 > 100;
//         System.out.println(f);                         // true

//         boolean r=125 <= 100;
//         System.out.println(r);                         // false

//         boolean c=125 != 100;
//         System.out.println(c);                         // true

//     }
// }



// public class program {

//     public static void main(String[] args) {

//         int d=8;
//         System.out.println(d << 1);                    // сдвиг на 1 бит = 16
//         System.out.println(d >> 1);                    //  = 4

//         int g=5;
//         int s=2;
//         System.out.println(g | s);                       // 7
//         System.out.println(g ^ s);                       // 7
//         System.out.println(g & s);                       // 0

//         boolean z = true;
//         Boolean x = true;
//         System.out.println(z & x);
//         System.out.println(z && x);

//         System.out.println(z | x);
//         System.out.println(z || x);
//     }
// }


// public class program {

//     public static void main(String[] args) {
        
//         String s="qwer";
//         Boolean b=s.length() >= 5 && s.charAt(4) =='1';
//         System.out.println(b);

//         String a = "qwer1";
//         Boolean d = a.length() == 5 && a.charAt(4) =='1';
//         System.out.println(d);
//     }
// }

/**
  Массивы
 */
// public class program {
//     public static void main(String[] args) {
//         int[] arr = new int[10];
//         System.out.println(arr.length);                         // длина массива
//         System.out.println(arr[3]);                             // смотрим 3 элемент массива

//         arr = new int[] {1,2,3,4,5};
//         System.out.println(arr.length);                         // длина массива

// //многомерные массивы:
//         int[] arr1[] = new int [3][5];
//         for (int [] line : arr1) {
//             for(int item : line) {
//                 System.out.printf("%d", item);
//             }
//             System.out.println();
//         }

// // двумерный массив

//         int [][]arr2 = new int [3][5];
//         for(int i=0; i<arr2.length; i++) {
//             for(int j=0; j <arr2[i].length; j ++){
//                 System.out.printf("%d",arr2[i][j]);
//             }
//             System.out.println();
//         }
//     }
// }


// Получение данных с терминала

// import java.util.Scanner;
// public class program {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("введите целое число (1,5,10 Int a: ");
//         int x = iScanner.nextInt();
//         System.out.printf("введите вещественное число (1,3; 2,7; 10,4) double a: ");
//         double y = iScanner.nextDouble();
//         System.out.printf("%d + %f = %f", x, y, x + y);
//         iScanner.close();
//     }
// }



// import java.util.Scanner;
// public class program {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in,"cp866");
//         System.out.printf("введите имя: ");
//         String name = iScanner.nextLine();
//         System.out.printf("Привет, %s!", name);
//         iScanner.close();
//     }
// }


// Проверка на соответствие получаемого типа

// import java.util.Scanner;
// public class program {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("int a: ");
//         boolean flag = iScanner.hasNextInt();
//         System.out.println(flag);
//         int i = iScanner.nextInt();
//         System.out.println(i);
//         iScanner.close();
//     }
// }

/**
 * program
 */
// public class program {

//     public static void main(String[] args) {
//         String s = "qwe";
//         int a = 35;
//         String g = a+s;
//         System.out.println(g);
//         System.out.println(a+s);
//     }
// }


/*
 * Создание строки из 1 млн. +
 */

 /**
  * program
  */
// public class program {
//     public static void main(String[] args) {
//         String str =" ";
//             for(int i=0; i<1_000_000; i++) { 
//                 str +="+";
//                 System.out.print(str);
//             }       
//     }   
// }
// выриат решение этой задачи в разы


// public class program {
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder();
//         for (int i=0; i<1_000_000; i++) {
//             sb.append("+");
//             System.out.println(sb);
//         }
//     }
// }

/**
 * сумма чисел из строки
 */


public class program {
    public static void main(String[] args) {
        String text = "Вася заработал 5000 рублей, Петя - 17563 рубля, а Маша - 30000"; 
        String str = text.trim();
        String digits="";
            int sum = 0;
            str+=" ";
            for (int i = 0; i < str.length(); i++) {
              char chrs = str.charAt(i);
              if (Character.isDigit(chrs))
                digits+=chrs;
              else{
                  if(!digits.equals(""))
                     sum+= Integer.parseInt(digits);
                  digits = "";
              }
              
            }
            System.out.printf(" общая з/пл составит: %d ", sum);
            System.out.println("\n");
    }
    
}