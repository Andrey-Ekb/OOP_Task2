// /* 
// * Урок 1. Знакомство с языком программирования Java
// **/

// // Задание 1. Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

// import java.util.Scanner;
    
// public class homework {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);  
//         System.out.println("");
//         System.out.print("Введите число (0-15): ");
//         int n = sc.nextInt();
//         int p = 1;
//         int t = 0;
//         if (n<16){ 
//             for (int i = 0; i <= n; i++) {
//                 if (i != 0) {
//                     p = p * i;
//                     t = t + i; 
//                 }
//         }
//         System.out.printf("треугольное число = %d \n", p);
//         System.out.printf("произведение числа = %d\n", t);      
//         sc.close();
//         }
//     System.out.println("");
//     }
// }

// Задание 2. Вывести все простые числа от 1 до 1000

// import java.util.Scanner;
    
// public class homework {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);  
//         System.out.print("Введите число (0-10000): ");
//         int kont = sc.nextInt();
//         sc.close();
//         // int[] arr = new int[] {2,3,5,7};
//         for(int i=1; i < kont; i++){ 
//             if ((i % 2) !=0){
//                 if ((i % 3) != 0){
//                         if (i % 5 != 0){
//                             if(i % 7 != 0){
//                             System.out.printf(" %d\t", i);
//                         }
//                     }
//                 }
//             }
//         }
//     }
// }


// /**
//  * Задача 3. Дана строка sql-запроса "select * from students WHERE ". Сформируйте часть WHERE этого 
//  * запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки. 
//  * Если значение null, то параметр не должен попадать в запрос.Пример данной строки {"name":"Ivanov", 
//  * "country":"Russia", "city":"Moscow", "age":"null"} 
//  * Вывод: select * from students WHERE name=Ivanov AND country=Russia AND city=Moscow
//  */

//  public class homework {
//     public static void main(String[] args) {
//         String reg = "\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"20\"";
//         StringBuilder sb = new StringBuilder(reg);
//         System.out.println("\n");
//         System.out.println(sb.toString());
//         String reg1=reg.substring(1,reg.length()-1);
//         //System.out.println(reg1);
//         StringBuilder result = new StringBuilder("select * from students where ");
//         System.out.println("\n");
//         System.out.print(result);
//         String[] keyWithVal = reg1.split(", ");
//         // System.out.println(Arrays.toString(keyWithVal));
//         StringBuilder res = new StringBuilder();
//         boolean flag = true;
//         for (String item : keyWithVal) {
//             String[] keyValue = item.split(":");
//             String key = keyValue[0].replace("\"", "");
//             String value = keyValue[1].replace("\"","");
//             // System.out.printf("промежуточные : %s %s ", key, value);

//             if (!value.equalsIgnoreCase("null")) { // Если значение не равно null
//                // System.out.println("значение не равно 0");
//             if(flag==false){
//                 res.append(" AND ");
//             }   
//             res.append(key).append("=").append(value);     
//             // System.out.printf("добавляем = %s", key);           
//             flag = false;
//             }
//         }
//     System.out.println(res);
//     System.out.println("\n");
//     }
// }


// /**
//  * Задача 4. Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации 
//  * запишите в лог-файл.
//  * 1 3 4 2
//  * 1 3 2 4
//  * 1 2 3 4
//  */
// public class homework {

//     public static void main(String[] args) {
//         int[] sortArr = {1,3,4,2,6,-10,8,-5};
//         System.out.println("\n");
//         System.out.print("Заданная строка : ");
//         for(int s=0; s<sortArr.length; s++){
//            System.out.print(sortArr[s]+" ");
//         }
//         System.out.println("\n");
//             for (int i = 0; i < sortArr.length; i++) {
//                 if (i==sortArr.length-1) System.out.print("Регзультат : ");
//                 for(int s=0; s<sortArr.length; s++){   
//                 System.out.print( sortArr[s]+" ");
//             }
//         System.out.println("\n");
//             for(int j = 0; j < sortArr.length - i - 1; j++) {
//                 if(sortArr[j + 1] < sortArr[j]) {
//                     int swap = sortArr[j];            
//                     sortArr[j] = sortArr[j + 1];
//                     sortArr[j + 1] = swap;
//                 }
//             }
//         }
//     }
// }