// package seminar_3;

// import java.io.IOException;
// import java.util.Random;
// import java.util.logging.*;



// public class lg {
//     public static void main(String[] args) throws IOException{
        
//     Logger ll =Logger.getLogger(lg.class.getName());
    
//     String logsPath = "seminar_3/log.txt";                          // ред-ция пути
//     FileHandler fh = new FileHandler(logsPath, false);              // перезаписывает
//     FileHandler fh1 = new FileHandler(logsPath, true);              // дополнение
//     ll.addHandler(fh);
//     ll.addHandler(fh1);
//     SimpleFormatter formatter = new SimpleFormatter();
//     //HML Formatter formatter = new HML Formatter();
//     fh.setFormatter(formatter);
//     //fh.setFormatter(formatter);
//     Random rand = new Random();
//     for (int i=0; i<10; i ++){
//         int a = rand.nextInt(10);
//         ll.log(Level.INFO, "element: " + a);
//     }
//     ll.log(Level.WARNING, "logger OFF");
//     ll.info("text");
//     ll.warning("logsPath");
//     }
// }




// package seminar_3;

// import java.util.ArrayList;
// import java.util.Arrays;

// /**
//  * Заполнить срисок названия планет Солнечной системы в произволном порядке с повторениями
//  * Вывести названия каждой планеты  и кол-во повторений.
//  * [земля,земля, марс, юпитер, земля]
//  * 
//  * земля: 3
//  * марс: 1
//  * юпитер: 1
//  */
// public class lg {
//     public static void main(String[] args) {
//         ArrayList<String> list = new ArrayList<>(Arrays.asList("земля","марс","земля","марс","земля","юритер","земля"));
//         int count  = 1;
//         ArrayList<String> list2 = new ArrayList<>();
        
//         for (int i = 0; i < list.size()-1; i++) {
//             if(!list2.contains(list.get(i))) {
//                 list2.add(list.get(i));
//                 count = 1;
//                 for (int j = i + 1; j < list.size()-1; j++) {
//                     if(list.get(i) == list.get(j)) {
//                        count ++;
//                     } 
//                 }   
//             System.out.println(list.get(i)+" : "+count);  
//             }
//         }
//     }
// }



// // вариант второй 

// package seminar_3;

// import java.util.Arrays;
// import java.util.List;

// public class lg {
//     public static void main(String[] args) {
//         final List<String> PLANETS = Arrays.asList("earth","mars","venera","jupyter","saturn","heptun","mercuriy");
//     List<Integer> numbers = Arrays.asList(0,0,0,0,0,0,0,0);
//     String[] planets = new String[] {"earth","mars","venera","earth","saturn","neptun"};

//     for (String planet : planets) {
//         int idx = PLANETS.indexOf(planet.toLowerCase());
//         if (idx != -1 ){
//             numbers.set(idx, numbers.get(idx)+1);
//         }
//     }
//     for(int i=0;i<PLANETS.size(); ++i) {
//         if(numbers.get(i) > 0) {
//             System.out.println(PLANETS.get(i)+":"+numbers.get(i));

//         }
//     }
// }
// }


package seminar_3;
/**
 * задача. Создать список типа ArrayList, поместить в него слова и цифры. Потом, проити по 
 * списку и удалить из него целые числа.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class lg {
    public static void main(String[] args) {
    List<Object> array = new ArrayList<>(Arrays.asList("земля",12,"земля",1, "земля", 3,4,"земля","земля","земля"));
    // for (int i = 0; i < array.size(); i++) {
    //     if (array.get(i) instanceof Integer) {
    //         array.remove(i);
    //         i--;   // при удалениие строка сдвиниться на удаленное значение, а счетчик пойдет 
    //                // далее и поэтому пропустит следующее значение. Поэтому, мы i--.
    //     }
    // }
    // System.out.println(array);


    // другой вариант :

    // for (int i = array.size()-1; i>=0 ; i--) {
    //     if (array.get(i) instanceof Integer) {
    //         array.remove(i);
    //     }
    // }
    // System.out.println(array);

    // третий вариант:

    Iterator iter = array.iterator();
    while (iter.hasNext()) {
        if(iter.next() instanceof Integer){
            iter.remove();
        }
    }
    System.out.println(array);
}}