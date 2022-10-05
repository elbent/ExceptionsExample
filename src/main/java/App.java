import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {
    public static void main(String[] args) {
        int[] myArray = {3, 4, 5};

        try {
            System.out.println("The element at index 3 " + myArray[3]);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Oh no! you got an exception: " + ex.getMessage());
            // in a web app, maybe show an error page rather than garbage
        }
        System.out.println("our program continues");

        try {
            readFromFile("C://file.txt");
            // some other stuff
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
       // } catch (InsufficientFundsException ex) {
         //   System.out.println("oh no! not enough  money");
        } catch (Exception ex) {
            System.out.println("Something went wrong " + ex.getMessage());
        }
        System.out.println("Our program continues");
    }

    public static void readFromFile(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        FileReader reader = new FileReader(file);
    }
}
