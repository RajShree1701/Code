package interviewpractice;

public class selectionsort1 {
    public static void main(String[] args) {
        int a[] = {7, 6, 3, 4, 2, 1};

        System.out.println("Original array:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        // Selection sort logic
        for (int i = 0; i < a.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[smallest] > a[j]) {
                    smallest = j;
                }
            }
            // Swap elements
            int temp = a[smallest];
            a[smallest] = a[i];
            a[i] = temp;
        }

        System.out.println("Sorted array:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
