package md_1;

public class t17 {
    public static void main(String[] args) {
        int[][] array = {
            { 12,  35,   7 },
            { 42,  -8,  19 },
            { 14,   3,  25 }
        };

        if (array == null || array.length == 0 || array[0].length == 0) {
            System.out.println("The array is empty.");
            return;
        }

        int min = array[0][0];
        int minRow = 0;
        int minCol = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                    minRow = i;
                    minCol = j;
                }
            }
        }

        System.out.println("Minimum element: " + min);
        System.out.println("Row index: " + minRow + " (Row number: " + (minRow + 1) + ")");
        System.out.println("Column index: " + minCol + " (Column number: " + (minCol + 1) + ")");
    }
}