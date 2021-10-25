
 import java.util.Random;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        //  for quiz ask 10 questions
        //   Display 5 options for each question
        //   store the questions and answers in multi-dimensional array
        String[][] questions = new String[10][2];
        questions[0][0] = "There are 16 students from Mr. Block’s class at the library. The other four students in the class are \n"
                +"practicing math facts in the classroom. Which number sentence shows the total number of students in\n" +
                "Mr. Block’s class??\n" + "\n" +
                "A)16 + 4\n" +
                "B) 16 – 4\n" +
                "C)  16 × 4\n" +
                "D) 16 / 4\n"+
                "E)(16+4)/4 ";
        questions[1][0] = " Cody rides his bike to the park to meet a friend at noon. Cody arrives at the park at 11:00 a.m.\n" +
                "Which question can be answered using this information?\n" +"\n" +
                "A) What is the distance between the park and Cody’s house?\n" +
                "B) How long could Cody have to wait for his friend?\n" +
                "C) How long does Cody stay at the park?\n" +
                "D) When will Cody leave to go home?\n"+
                "E) What is Cody's frind name?";
        questions[2][0] = " Which number correctly completes the number sentence 80 × 34 = ___?\n\n" + "\n" +
                "A) 275\n" +
                "B) 560\n" +
                "C) 2150\n" +
                "D) 2720\n"+
                "E) 1930";
        questions[3][0] = " Which number correctly completes the subtraction sentence 6.0 - 4.25 =?\n" + "\n" +
                "A) 2.35\n" +
                "B) 1.75\n" +
                "C) 2\n" +
                "D) 0.25\n"+
                "E) 4";
        questions[4][0] = "Which is the most appropriate metric unit for measuring the length of a spoon?\n" + "\n" +
                "A) milimeter\n" +
                "B) decimeter\n" +
                "C) kilometer\n" +
                "D) centimeter\n"+
                "E) meter";
        questions[5][0] ="Which number correctly completes the division sentence 3,000/ 30 = ___?\n\n" + "\n" +
                "A) 1000\n" +
                "B) 100\n" +
                "C) 1\n" +
                "D) 10\n"+
                "E) 900";
        questions[6][0] ="What is the value of n in the equation 64 / n = 8?\n" + "\n" +
                "A) 6\n" +
                "B) 7\n" +
                "C)3\n" +
                "D) 8\n"+
                "E) 2";
        questions[7][0] ="A building is 36 feet high. What is the height of the building in yards?\n" + "\n" +
                "A) 45\n" +
                "B) 15\n" +
                "C)12\n" +
                "D)18\n"+
                "E) 9";
        questions[8][0] ="Which number sentence shows the commutative property of multiplication?\n" + "\n" +
                "A)3*2=2*3\n" +
                "B) 3*1=3\n" +
                "C) 3*0=0\n" +
                "D) (3*2)*4=3*(2*4)\n"+
                "E) (3*2)+4=(3*4)+(2*4)";
        questions[9][0] =  "Brad draws a shape on his paper. The shape has four sides. It has only one pair of parallel sides.\n" +
                "What shape does Brad draw?\n" + "\n" +
                "A)  parallelogram\n" +
                "B) rectangle\n" +
                "C)  square\n" +
                "D) trapezoid\n"+
                "E) cylinder";
        questions[0][1] = "A";
        questions[1][1] = "B";
        questions[2][1] = "D";
        questions[3][1] = "B";
        questions[4][1] = "D";
        questions[5][1] = "B";
        questions[6][1] = "D";
        questions[7][1] = "C";
        questions[8][1] = "A";
        questions[9][1] = "D";

        //
        //  Feedback for every wrong answer
        //  create a variable to count correct answers
        int correct= 0;
        //  create a string to store the wrong answers
        String wrongAnswer = "";
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please enter your answer like:  A or a\n GOOD LUCK!");
        // display each question in a loop and store wrong answers and count correct ones
        for (int i = 0; i < questions.length; i++) {
            System.out.println(i+1+ ". "+ questions[i][0]);
            System.out.println(" Please enter your answer and click enter:\n");
            String userAnswer = sc.nextLine();
            if(questions[i][1].equalsIgnoreCase(userAnswer)){
                correct++;
            }else{
                wrongAnswer = wrongAnswer+ (i+1)+". ";
            }
        }

        System.out.println("You have "+correct+"/10 correct answer");
      
      System.out.println(wrongAnswer.toString());

        //   Ask user to try again
        //  test again
        System.out.println("Would you like to try again? yes/y or no/n");
        String repeat = sc.nextLine();
        if (repeat.equalsIgnoreCase("y")){
            // to shuffle an array use Random class, take int numbers between 0-10
            Random rand = new Random();
            for (int i = 0; i < questions.length; i++) {
                int randomIndexToSwap = rand.nextInt(questions.length);
                String[] temp = questions[randomIndexToSwap];
                questions[randomIndexToSwap] = questions[i];
                questions[i] = temp;
            }
            int answer= 0;
            String wrongAnswers = "";
            for (int i = 0; i < questions.length; i++) {
                System.out.println(i+1+ ". "+questions[i][0]);
                System.out.println(" Please enter your answer and click enter:\n");
                String userAnswer = sc.nextLine();
                if(questions[i][1].equalsIgnoreCase(userAnswer)){
                    answer++;
                }else{
                    wrongAnswers = wrongAnswers+ (i+1)+". ";
                }
            }
            System.out.println("You have "+correct+"/10 correct answer on second try");
            
      System.out.println(wrongAnswers.toString());

        }
        System.out.println("Thank you to attending the Quiz ");
    }
}