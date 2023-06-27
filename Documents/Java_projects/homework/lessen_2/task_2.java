/**
 * 2) Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации 
 * запишите в лог-файл.
 * 1 3 4 2
 * 1 3 2 4
 * 1 2 3 4
 */
public class task_2 {

    public static void main(String[] args) {
        int[] sortArr = {1,3,4,2,6,-10,8,-5};
        System.out.println("\n");
        System.out.print("Заданная строка : ");
        for(int s=0; s<sortArr.length; s++){
           System.out.print(sortArr[s]+" ");
        }
        System.out.println("\n");
            for (int i = 0; i < sortArr.length; i++) {
                if (i==sortArr.length-1) System.out.print("Регзультат : ");
                for(int s=0; s<sortArr.length; s++){   
                System.out.print( sortArr[s]+" ");
            }
        System.out.println("\n");
            for(int j = 0; j < sortArr.length - i - 1; j++) {
                if(sortArr[j + 1] < sortArr[j]) {
                    int swap = sortArr[j];            
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }
            }
        }
    }
}

