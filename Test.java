package exercise1;

import javax.swing.JOptionPane;
import java.util.Random;
//Creating Class and defining the object
public class Test {
  int totalQuestions = 5;
  int correctAnswers = 0;
  Random randomObject = new Random();
  //Inserting all the questions 
  String[][] questions = {
    {"Which one of the following symbols indicates a single line comment in Java application source code:", "//", "##", "*/", "#!", "A"},
    {"Which of the following components does a Java application need to have at least one of?", "Local Variable", "Class", "Instance variable", "Non-static Method", "B"},
    {"What is the return type of Constructors?", "None of the mentioned", "int", "float", "Void", "A"},
    {"Which keyword is used for accessing the features of a package?", "Import", "Export", "Package", "Extends", "A"},
    {"In java, jar stands for_____.", "Java Archive Runner", "Java Application Resource", "Java Application Runner", "None of the above", "D"}
  };
  //Input answer
  public void simulateQuestion() {
    for (String[] question : questions) {
      inputAnswer(question);
    }
  }
  
  public void inputAnswer(String[] question) {
	  String answer = JOptionPane.showInputDialog(null, question[0] + "\n\nA. " + question[1] + "\nB. " + question[2] + "\nC. " + question[3] + "\nD. " + question[4]+"\n");
    checkAnswer(answer, question[5]);
  }
  
  public void checkAnswer(String answer, String correctAnswer) {
    if (answer.equalsIgnoreCase(correctAnswer)) {
      correctAnswers++;
      JOptionPane.showMessageDialog(null, generateMessage(true));
    } else {
      JOptionPane.showMessageDialog(null, generateMessage(false) + "\nCorrect answer: " + correctAnswer);
    }
  }
  //Generating the message if True or not
  public String generateMessage(boolean True) {
    int message = randomObject.nextInt(4);
    switch (message) {
      case 0:
        return True ? "Excellent!" : "No. Please try again";
      case 1:
        return True ? "Good!" : "Wrong. Try once more";
      case 2:
        return True ? "Keep up the good work!" : "Don't give up!";
      case 3:
        return True ? "Nice work!" : "No. Keep trying..";
    }
    return "";
  }
  //Calling the class 
  public static void main(String[] args) {
    Test test = new Test();
    test.simulateQuestion();
    JOptionPane.showMessageDialog(null, "Total questions: " + test.totalQuestions + "\nCorrect answers: " + test.correctAnswers + "\nPercentage: " + (test.correctAnswers * 100 / test.totalQuestions) + "%");
  }
}
