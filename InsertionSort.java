import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InsertionSort {
    
        public static void main(String[] args) {
            InsertionSort insertionSort = new InsertionSort();
            ArrayList<Integer> list = new ArrayList<Integer>();
            int[] array = {13,5,6,11,4,15,143,333,7,8,88,2};

            for (int number : array){
                list.add(number);
            }

            for (int element : list){
                System.out.println(element);
            }
            
            insertionSort.handleSort(list);
        }
    


    
        public void handleSort(ArrayList<Integer> list){
            int temporary = 0;
            int a = 0; // next element
    
            for (int i = 0; i < list.size()-1; i++){
                    a = i+1;
                while (a < list.size()){

                    if (list.get(i) > list.get(a)){
                        Collections.swap(list, i, a);
                    }
                    a++;
                }
                
            }



            for (int element : list){
                System.out.println(element);
            }
        }
    }