
public class InsertionSort {
    
        public static void main(String[] args) {
            InsertionSort insertionSort = new InsertionSort();
            int[] array = {13,5,6,11,4,15,143,333,7,8,88,2};

            for (int number : array){
                System.out.println(number);
            }
            
            insertionSort.handleSort(array);
        }
    
        public void handleSort(int[] array){
            int temporary = 0;
            int nextIndex;

            for (int index = 0; index < array.length; index++){
                nextIndex = index+1;

                while(nextIndex < array.length){
                    if (array[index] > array[nextIndex]){
                        temporary = array[index];
                        array[index] = array[nextIndex];
                        array[nextIndex] = temporary;
                    }
                    nextIndex++;
                }
            }

            //print sorted list
            for (int element : array){
                System.out.println(element);
            }
        }

    
    }

    