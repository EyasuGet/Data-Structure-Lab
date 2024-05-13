package question4;

public class Sorting {
    public static void main(String[] args) {
        char[] alphabets = {'d', 'y', 'a', 'o', 'w', 'i', 'j','c','b', 'g','z'};


        System.out.println("before sorting:");
        printArray(alphabets);

        bubbleSort(alphabets);

        System.out.println("\nafter sorting:");
        printArray(alphabets);
    }

    public static void bubbleSort(char[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    //swap
                    char temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void printArray(char[] arr) {
        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}

