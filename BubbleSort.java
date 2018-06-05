/*
*This is simple implementation of bubblesort algorithm
*/
public class BubbleSort {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = {3,5,6,11,4,15,143,333,7,8,88,2};
        bubbleSort.handleSort(array);
    }


    public void handleSort(int[] array){
        int temporary = 0;

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j <array.length-i-1; j++){
                if (array[j+1] < array[j]){
                    temporary = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temporary;
                }
            }
        }
        for (int element : array){
            System.out.println(element);
        }
    }
}