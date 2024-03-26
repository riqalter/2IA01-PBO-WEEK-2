package pboPert204;
import java.util.Scanner;
public class GradeBookTest {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        GradeBook myGradeBook = new GradeBook();

        System.out.println("Please enter the course name:");
        String courseName = input.nextLine();
        System.out.println();

        myGradeBook.displayMessage(courseName);
    }
}