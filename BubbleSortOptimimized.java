/*
This optimized version bubblesort algorithm. 
It detects if needs to stop the loop if array is sorted.
*/
public class BubbleSort {
    
        public static void main(String[] args) {
            BubbleSort bubbleSort = new BubbleSort();
            int[] array = {3,5,6,11,4,15,143,333,7,8,88,2};
            bubbleSort.handleSort(array);
        }
    
    
        public void handleSort(int[] array){
            int temporary = 0;
            boolean swapped;
    
            for (int i = 0; i < array.length; i++){
                swapped = false;

                for (int j = 0; j <array.length-i-1; j++){
                    if (array[j+1] < array[j]){
                        temporary = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temporary;
                        swapped = true;
                    }
                }

                if(!swapped){
                    break;
                }

            }

            //printing sorted array
            for (int a : array){
                System.out.print(a + " ");
            }
        }
    }