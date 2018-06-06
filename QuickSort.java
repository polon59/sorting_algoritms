import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class QuickSort {


    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        List<Integer> list = new ArrayList<>();
        int[] array = {3,5,6,11,4,15,143,333,7,8,88,2,41};

        for (int number : array){
            list.add(number);
        }

        quickSort.handleSort(list);
    }
    

    public void handleSort(List<Integer> list){

        System.out.println(list.size());
        int pivot = list.size()/2;
        System.out.println(pivot);
        

    }
}