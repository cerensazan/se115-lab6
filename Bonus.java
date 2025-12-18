import java.util.Random;

public class Bonus {

        public static void main(String[] args) {
            Random randomGenerator= new Random();
            int[][] scores = new int[5][4];
            int highest = -1, bestStudent = -1, bestQuiz = -1;
            
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 4; j++) {
                    scores[i][j] = randomGenerator.nextInt(101);
                    System.out.print(scores[i][j] + " ");
                    if (scores[i][j] > highest) {
                        highest = scores[i][j];
                        bestStudent = i;
                        bestQuiz = j;
                    }
                }
                System.out.println();
            }

            for (int i = 0; i < 5; i++) {
                int sum = 0;
                for (int j = 0; j < 4; j++) sum += scores[i][j];
                System.out.println("Student " + (i + 1) + ": " + (sum / 4.0));
            }
            for (int j = 0; j < 4; j++) {
                int sum = 0;
                for (int i = 0; i < 5; i++) sum += scores[i][j];
                System.out.println("Quiz " + (j + 1) + ": " + (sum / 5.0));
            }

            System.out.println("Highest score: " + highest + " (Student " + (bestStudent + 1) +
                    ", Quiz " + (bestQuiz + 1) + ")");
        }
    }

