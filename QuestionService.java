import java.util.Scanner;
public class QuestionService {
    Question[] questions = new Question[5];
    String[] selection = new String[5];

    public QuestionService(){
        questions[0] = new Question(1,"size of int","2","6","4","8","4");
        questions[1] = new Question(2, "size of double", "2", "6", "4", "8", "8");
        questions[2] = new Question(3, "size of char", "2", "6", "4", "8", "2");
        questions[3] = new Question(4, "size of long", "2", "6", "4", "8", "8");
        questions[4] = new Question(5, "size of boolean", "1", "2", "4", "8", "1");

    }

    public void playQuiz(){
        Scanner sc = new Scanner(System.in); // one scanner only

        for (int i = 0; i < questions.length; i++) {
            Question q = questions[i];
            System.out.println("\nQuestion " + q.getId() + ": " + q.getQuestion());
            System.out.println("A. " + q.getOpt1());
            System.out.println("B. " + q.getOpt2());
            System.out.println("C. " + q.getOpt3());
            System.out.println("D. " + q.getOpt4());
            System.out.print("Enter your answer: ");
            selection[i] = sc.nextLine().trim(); // store trimmed answer
        }

        sc.close();
        


    }
    public void printScore(){
        int score=0;
        for(int i=0;i<questions.length;i++){
            Question que =questions[i];
            String answer =que.getAnswer().trim().toLowerCase();
            String userAnswer = selection[i].trim().toLowerCase();
            if(answer.equals(userAnswer)){
                score++;
            }
        }
        System.out.println("Your score is : " + score);
    }


}
