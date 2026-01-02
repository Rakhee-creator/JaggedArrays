public class JaggedArrays {
          public static void main(String[] args) {
            int[][] student = new int[3][];

            student[0] = new int[]{85, 90};
            student[1] = new int[]{70, 75, 80, 95};
            student[2] = new int[]{88, 92, 76};

            double highestAvg = 0;
            int topStudent = -1;

            for (int i = 0; i < student.length; i++) {
                int sum = 0;
                for (int j = 0; j < student[i].length; j++) {
                    sum += student[i][j];
                }
                double avg = (double) sum / student[i].length;
                System.out.println("Student " + i + " sum = " + sum);
                System.out.println("Student " + i + " avg = " + avg);

                if (avg > highestAvg) {
                    highestAvg = avg;
                    topStudent = i;
                }
            }

            System.out.println("\nTop student is Student " + topStudent +
                    " with highest average = " + highestAvg);
        }
    }

