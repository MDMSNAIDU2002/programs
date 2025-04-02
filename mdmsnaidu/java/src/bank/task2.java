package bank;
import java.util.*;

public class task2 {
	public static void main(String[] args) {
		String[] arr = new String[11];
        int index = 0;
       
        Map<Integer, String> questions = new HashMap<>();
        questions.put(1, "How many types of classloaders are present in JVM?");
        questions.put(2, "Is Java platform dependent or independent?");
        questions.put(3, "What are stored in the heap?");
        questions.put(4, "What keyword is used to define a class in Java?");
        questions.put(5, "What is used to store a sequence of characters in Java?");
        questions.put(6, "Which keyword is used to create an object in Java?");
        questions.put(7, "What is used to declare a constant variable in Java?");
        questions.put(8, "Which method is used to start a thread in Java?");
        questions.put(9, "Which keyword is used to create an interface in Java?");
        questions.put(10, "What is used to access elements from a collection in Java?");
       
        Map<Integer, String> correctAnswers = new HashMap<>();
        correctAnswers.put(1, "Three");
        correctAnswers.put(2, "Independent");
        correctAnswers.put(3, "Objects");
        correctAnswers.put(4, "class");
        correctAnswers.put(5, "String");
        correctAnswers.put(6, "new");
        correctAnswers.put(7, "final");
        correctAnswers.put(8, "start()");
        correctAnswers.put(9, "interface");
        correctAnswers.put(10, "Iterator"); 
       
        Scanner scan = new Scanner(System.in);
        for (Map.Entry<Integer, String> entry : questions.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue());
            System.out.println("Enter your answer:");
            String s1 = scan.nextLine();
           
            if (index < arr.length) {
                arr[index] = s1;
                index++;
            }
        }
       
        int correctCount = 0;
        for (int i = 0; i < questions.size(); i++) {
            if (arr[i].equalsIgnoreCase(correctAnswers.get(i + 1))) {
                correctCount++;
            }
        }
       
        System.out.println("\nYou answered " + correctCount + " questions correctly out of " + questions.size());
       
        scan.close();
    }
	}


