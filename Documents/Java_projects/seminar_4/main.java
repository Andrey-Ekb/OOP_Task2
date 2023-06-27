// import java.io.IOException;
// import java.util.Random;
// import java.util.logging.*; 

// public class lg {
//     public static void main(String[] args) throws IOException{

//         Logger ll = Logger.getLogger(lg.class.getName());
//         String logsPath = "log.txt";
//         FileHandler fh = new FileHandler(logsPath, false);
//         FileHandler fh1 = new FileHandler("logsPath.txt", true);
//         ll.addHandler(fh);
//         ll.addHandler(fh1);
//         SimpleFormatter formatter = new SimpleFormatter();
//         // XMLFormatter formatter = new XMLFormatter();
//         fh.setFormatter(formatter);
//         // fh1.setFormatter(formatter);
//         Random rand = new Random();
//         for (int i = 0; i < 10; i++) {
//             int a = rand.nextInt(10);
//             ll.log(Level.INFO,"element: " + a);
//         }
//         ll.log(Level.WARNING, "logger off" );
//         ll.info("test");
//         ll.warning("logsPath");
//     }

// }

/*
задача 1 Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
 Вывести название каждой планеты и количество его повторений в списке. ("Меркурий", "Венера", "Земля",
"Марс", "Юпитер", "Сатурн", "Уран", "Нептун", "Плутон", "Земля", "Юпитер", "Марс", "Венера", "Юпитер")
 */

// import java.util.ArrayList;
// import java.util.Arrays;

// public class main {
//     public static void main(String[] args) {
//         ArrayList<String> list1 = new ArrayList<>(
//                 Arrays.asList("Земля", "Земля", "Земля", "Земля", "Юпитер", "Венера", "Марс", "Марс", "Плутон",
//                         "Марс"));
//         System.out.println(list1);
//         int count = 1;
//         ArrayList<String> list2 = new ArrayList<>();

//         for (int i = 0; i < list1.size() - 1; i++) {
//             if (!list2.contains(list1.get(i))) {
//                 list2.add(list1.get(i));
//                 count = 1;
//                 for (int j = i + 1; j < list1.size() - 1; j++) {
//                     if (list1.get(i) == list1.get(j)) {
//                         count += 1;
//                     }
//                 }
//                 System.out.println(list1.get(i) + " " + count + " раза");
//             }
//         }
//     }
// }

// третий вариант {

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Innermain
 */

// import java.util.ArrayList;
// import java.util.Arrays;
 
public class main {
public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>(Arrays.asList("Земля", "Земля", "Земля", "Меркурий", "Венера", "Меркурий", "Плутон"));
        planets.sort(null);
        int count = 1;
        for (int i = 1; i < planets.size(); i++) {
            if (planets.get(i).equals(planets.get(i-1))) {
                count++;
            } else {
                System.out.printf("%s:%s", planets.get(i-1), count);
                System.out.println();
                count = 1;
            }
        }
       
        if (count != 1) {
            System.out.printf("%s:%s", planets.get(planets.size() - 1), count);
            System.out.println();
        } else {
            System.out.printf("%s:%s", planets.get(planets.size() - 1), "1");
            System.out.println();
        }

    }
}

// пример работы

//     mport java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Iterator;
// import java.util.List;

// public class Sem {
//     public static void main(String[] args) {
//     //    Создать список типа ArrayList. Поместить в него как строки, так и целые числа. 
//     // Пройти по списку, найти и удалить целые числа.
//         List<Object> array = new ArrayList<>(Arrays.asList("Земля",12, "Земля", 1,"Земля", 3, 4, 4.2, "Земля", "Земля"));

//         // for (int i = 0; i < array.size(); i++) {
//         //     if (array.get(i) instanceof Integer){
//         //         array.remove(i);
//         //         i--;
//         //     }
//         // }
        

//         // for (int i = array.size()-1; i >= 0; i--) {
//         //     if (array.get(i) instanceof Integer){
//         //         array.remove(i);
//         // }
//         // }

//         Iterator iter = array.iterator();
//         while (iter.hasNext()){
//             if (iter.next() instanceof Integer){
//                 iter.remove();
//             }
//         }
//         System.out.println(array);
//     }
// }