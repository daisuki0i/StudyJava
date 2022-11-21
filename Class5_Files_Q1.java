import java.nio.file.Paths;
import java.util.Scanner;
import java.nio.file.NoSuchFileException;
import java.io.IOException;

public class Class5_Files_Q1 {
    public static void main(String[] args) {

        try (Scanner f = new Scanner(Paths.get("howToCode.txt"))) {
            int count = 0;
            while (f.hasNext()) {
                f.next();
                count++;
            }
            System.out.println("Number of words:" + count);
        } catch (NoSuchFileException e) {
            System.out.println("File not found" + e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}