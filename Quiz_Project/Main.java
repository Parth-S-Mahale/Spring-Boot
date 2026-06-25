package Quiz_Project;

public class Main {
    static void main() {
        QuestionService service = new QuestionService();
        service.displayQuestions();
        service.printScore();
    }
}
