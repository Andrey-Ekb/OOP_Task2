package seminar_3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<> (Arrays.asList(1,2,3,4,5));
        //List arr1 = new ArrayList(Arrays.asList(1,2,3,4,5));              // неправельно !!!
        System.out.println(arr);
        //System.out.println(arr1);
        
        List<Character> list1 = List.of('s','e','r','g','e','y');
        System.out.println(list1);
    } 
}
