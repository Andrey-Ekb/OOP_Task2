package lessen_4;
// import java.util.LinkedList;
// import java.util.Queue;

// public class ss {
//  public static void main(String[] args) {
//  Queue<Integer> queue = new LinkedList<Integer>();
//  queue.add(1);
//  queue.add(2);
//  queue.add(3);
//  queue.add(4);
//  System.out.println(queue); // [1, 2, 3, 4]
//  int item = queue.remove();
//  System.out.println(queue); // [2, 3, 4]
//  queue.offer(2809);
//  item = queue.remove();
//  System.out.println(queue); // [3, 4, 2809]
//  item = queue.remove();
//  System.out.println(queue); // [4, 2809]
//  item = queue.poll();
//  System.out.println(queue); // [2809]
//  }
// }


// import java.util.*;
// public class ss {
//     public static void main(String[] args) {
//     Queue<Integer> queue = new LinkedList<Integer>();
//     queue.add(1);
//     int item = queue.remove();
//     queue.offer(2808);
//     queue.offer(28);
//     item = queue.poll();
//     System.out.println(queue);
//     }
// }


// import java.util.*;

// public class ss {
//     public static void main(String[] args) {
//         Deque<Integer> deque = new ArrayDeque<>();
//         deque.addFirst(1);     deque.addLast(2);
//         deque.removeFirst();      deque.removeLast();
//         deque.offerFirst(1);   deque.offerLast(2); 
//         deque.pollFirst();       deque.pollLast();
//         deque.getFirst();        deque.getLast();
//         deque.peekFirst();       deque.peekLast();
//     }
// }


// import java.util.*;
// public class ss {
//  public static void main(String[] args) {
//     Stack<Integer> stack = new Stack<>();
//     stack.push(1);
//     stack.push(12);
//     stack.push(123);
//     System.out.println(stack.pop()); // 123
//     System.out.println(stack.pop()); // 12
//     System.out.println(stack.pop()); // 1
//     }
// }

// import java.util.*;
// import java.io.*;

// /**
//  * Вычислить значение выражения в постфинской форме записи: 1 2 3* +ss
//  */

// public class ss {

//     public static void main(String[] args) {
//         var exp = " 1 2 3 * + ".split(" ");
//         int res=0;
//         System.out.println(exp);

//       Stack<Integer> st = new Stack()     // НЕРАБОТАЕТ ???????
//         for (int i=0; i<exp.length; i++) {
//             if (isDigit(exp[i])) {
//                 st.push(Integer.parseInt(exp[1]));
//             } else {
//                 switch (exp[i]) {
//                     case "+":
//                         res = st.pop()+st.pop();
//                         st.push(res);
//                         break;
//                     case "-":
//                         res = st.pop()-st.pop();
//                         st.push(res);
//                         break;
//                     case "*":
//                         res = st.pop()*st.pop();
//                         st.push(res);
//                         break;
//                     case "/":
//                         res = st.pop()/st.pop();
//                         st.push(res);
//                         break;
//                     default:
//                         break;
//                 }
//             }
//         }
//         System.out.println("%d\n", st.pop());
//     }

//     private static boolean isDigit(String string) {
//         return false;
//     }
// }


//                              ч.2 коллекции МАР.
//


//          TREE MAP

import java.util.*;

public class ss {
    public static void main(String[] args) {
        TreeMap<Integer,String> tMap = new TreeMap<>();
        tMap.put(1,"один"); System.out.println(tMap); 
        // {1=один}
        tMap.put(6,"шесть"); System.out.println(tMap);
        // {1=один, 6=шесть}
        tMap.put(4,"четыре"); System.out.println(tMap);
        // {1=один, 4=четыре, 6=шесть}
        tMap.put(3,"три"); System.out.println(tMap);
        // {1=один, 3=три, 4=четыре, 6=шесть}
        tMap.put(2,"два"); System.out.println(tMap);
        // {1=один, 2=два, 3=три, 4=четыре, 6=шесть}
    }
}