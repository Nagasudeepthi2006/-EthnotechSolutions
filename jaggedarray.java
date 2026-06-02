import java.util.*;

class Main {
    public static void main(String[] args) {
        int[][] marks = new int[3][];

        marks[0] = new int[2];
        marks[1] = new int[3];
        marks[2] = new int[4];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < marks.length; i++) {
            for(int j = 0; j < marks[i].length; j++) {
                marks[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < marks.length; i++) {
            int sum = 0;
            System.out.print("Student " + (i+1) + " Marks: ");
            
            for(int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
                sum += marks[i][j];
            }

            double avg = (double) sum / marks[i].length;

            System.out.println();
            System.out.println("Total: " + sum);
            System.out.println("Average: " + avg);
        }
    }
}