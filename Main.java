package quiz;

import quiz.models.Question;
import quiz.services.QuizService;

public class Main {

	public static void main(String[] args) {
		Question[] questions = new Question[] {
				new Question("what is the size of an int data type in java?",
						new String[] { "8 bit", "16 bit", "32 bit", "64 bit" }, "32 bit"),
				new Question("which method is the entry point of a java program?",
						new String[] { "start()", "main()", "run()", "init()" }, "main()"),
				new Question("which of the these is not a valid access modifier in java?",
						new String[] { "public", "private", "protected", "package" }, "package"), };
		QuizService quiz = new QuizService(questions);
		quiz.start();
		quiz.showResults();
	}

}
