package Methods.Algorithm;

public class SelectionSort {
    public static int[] selectionSort(int[] arr , int n) {
        for (int i = 0; i < n; i++) {
            int index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[index]) {
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;

        }
        return arr;
    }


    }
