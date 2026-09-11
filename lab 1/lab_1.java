public class lab_1 {

    public static void main(String[] args) {
        System.out.println("first funсtion");
        double xS1 = -4.0;
        double xE1 = 4.0;
        double xStep1 = 0.5;

        System.out.println("---------------------");
        System.out.printf("| %-8s | %-8s |\n", "x", "y");
        System.out.println("---------------------");

        for(double x = xS1; x <= xE1; x += xStep1){
            double y = Math.sin(Math.pow(x, 2) + 2 * x + 1);
             System.out.printf("| %-8s | %-8s |\n", x, y);
        }

        System.out.println("---------------------");
        System.out.println("second funсtion");
        
        double xS2 = 4.0;
        double xE2 = 6.0;
        double xStep2 = 0.35;

        System.out.println("---------------------");
        System.out.printf("| %-8s | %-8s |\n", "x", "y");
        System.out.println("---------------------");

        for(double x = xS2; x <= xE2; x += xStep2){
            if (x < 5){
                double y = 2 * Math.pow(x, 5) + 2 * Math.pow(x, 2);
                System.out.printf("| %-8s | %-8s |\n", x, y);
            }
            else if(x >= 5.0){
                double y = Math.log10(x + 1 / x + 2);
                System.out.printf("| %-8s | %-8s |\n", x, y);
            }
            
        }

      System.out.println("---------------------");
System.out.println("arr task");

int length = 10;
int width = 10;
int[][] arr = new int[length][width];

for (int i = 0; i < length; i++) {
    for (int j = 0; j < width; j++) {
        arr[i][j] = (int) (Math.random() * 100);
        System.out.printf("%-4d", arr[i][j]);
    }
    System.out.println(); 
}

int maxAboveDiagonal = arr[0][1];

for (int i = 0; i < length; i++) {
    for (int j = i + 1; j < width; j++) {
        if (arr[i][j] > maxAboveDiagonal) {
            maxAboveDiagonal = arr[i][j];
        }
    }
}

System.out.println("---------------------");
System.out.println("maximum above diagonal: " + maxAboveDiagonal);
    }
}
