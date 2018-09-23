import java.util.Scanner;

class Load_Questions {
    String[] Load_Questions = new String[20];
    String[] questiontext = new String[20];
    String choice1;
    String choice2;
    String choice3;
    String choice4;
    int marks;
    int penalty;
    int count = 0;

    Load_Questions(String[] questiontext, String choice1, String choice2,String choice3,String choice4, int marks,int penalty) {
        this.questiontext = question text;
        this.choice1 = choice1;
        this.choice2 = choice2;
        this.choice3 = choice3;
        this.choice4 = choice4;
        this.marks = marks;
        this.penalty = penalty;
        for(i=0;i<Load_Questions.length;i++) {
            if(Load_Questions[i]>0) {
                count++
                System.out.println(count+"are added to the quiz");
            } else {
                System.out.println("does not have questions")
            }

        }
    }

        }


        
 Class START_QUIZ {
    for(i=1;i<queationtext.length;i++) {
        for(j=1;j<questiontext.length;j++) {
            System.out.println(questiontext[i][j]);

        }
    }

 }   
    
 
public int penalty() {

        if(questiontext1 ==  choice1) {
        System.out.println("Wronganswer!"+"penalty:"+"-4");

    }
    elseif(questiontext2 == choice2){

        System.out.println("Wronganswer!"+"penalty"+"-3");

    }
    elseif(questiontext3 == choice3) {
        System.out.println("Wronganswer!"+"penalty"+"-2");
    }

}
  







/**
 * Solution class for code-eval.
 */
public final class Solution {
     /**
     * Constructs the object.
     */
    private Solution() {
        // leave this blank
    }
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
         // instantiate this Quiz
        Quiz q = new Quiz();
         // code to read the test cases input file
        Scanner s = new Scanner(System.in);
        // check if there is one more line to process
        while (s.hasNext()) {
            // read the line
            String line = s.nextLine();
             // split the line using space
            String[] tokens = line.split(" ");
              // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
                case "LOAD_QUESTIONS":
                System.out.println("|----------------|");
                System.out.println("| Load Questions |");
                System.out.println("|----------------|");
                loadQuestions(s, q, Integer.parseInt(tokens[1]));
                break;
                case "START_QUIZ":
                System.out.println("|------------|");
                System.out.println("| Start Quiz |");
                System.out.println("|------------|");
                startQuiz(s, q, Integer.parseInt(tokens[1]));
                break;
                case "SCORE_REPORT":
                System.out.println("|--------------|");
                System.out.println("| Score Report |");
                System.out.println("|--------------|");
                displayScore(q);
                break;
                default:
                break;
            }
        }
    }
    /**
     * Loads questions.
     *
     * @param      s              The scanner object for user input
     * @param      quiz           The quiz object
     * @param      questionCount  The question count
     */
    public static void loadQuestions(final Scanner s, final Quiz quiz, final int questionCount) {
        // write your code here to read the questions from the console
        // tokenize the question line and create the question object
        // add the question objects to the quiz class
    }

    /**
     * Starts a quiz.
     *
     * @param      s            The scanner object for user input
     * @param      quiz         The quiz object
     * @param      answerCount  The answer count
     */
    public static void startQuiz(final Scanner s, final Quiz quiz, final int answerCount) {
        // write your code here to display the quiz questions
        // read the user responses from the console
        // store the user respones in the quiz object
    }

    /**
     * Displays the score report
     *
     * @param      quiz     The quiz object
     */
    public static void displayScore(final Quiz quiz) {
        // write your code here to display the score report
    }
}
