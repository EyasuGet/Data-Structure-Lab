package question6;

public class sort {
        public static void main(String[] args) {
            int[] array = {3, 7, 1, 9, 4};
            int indexToDelete = 0;

            System.out.print("Original array:");
            printArray(array);

            array = deleteEl(array, indexToDelete);

            System.out.print("Array after deleting " + indexToDelete + " index :");
            printArray(array);
        }

        public static int[] deleteEl(int[] array, int index) {
            // Check if index is valid
            if (index < 0 || index >= array.length) {
                System.out.println("Invalid index.");
                return array;
            }


            int[] newArray = new int[array.length - 1];
            for (int i = 0, j = 0; i < array.length; i++) {    // Copy elements
                if (i != index) {
                    newArray[j++] = array[i];
                }
            }
            return newArray;
        }

        public static void printArray(int[] array) {
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }



}
