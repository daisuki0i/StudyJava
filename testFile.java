import java.nio.file.Paths;
// import java.util.Arrays;
import java.util.Scanner;
import java.nio.file.NoSuchFileException;
import java.io.IOException;

public class testFile {
    public static int countWordInFile(String path) {
        int count = 0;
        try (Scanner f = new Scanner(Paths.get(path))) {
            while (f.hasNext()) {
                f.next();
                count++;
            }
        } catch (NoSuchFileException e) {
            System.out.println("File not found" + e);
        } catch (IOException e) {
            System.out.println(e);
        }
        return count;
    }

    public static int countWordInFile2(String path) {
        int count = 0;
        try (Scanner f = new Scanner(Paths.get(path))) {
            while (f.hasNextLine()) {
                String data = f.nextLine();
                String[] splitted = data.split(" ");
                // System.out.println(Arrays.toString(splitted));
                count += splitted.length;
            }
        } catch (NoSuchFileException e) {
            System.out.println("File not found" + e);
        } catch (IOException e) {
            System.out.println(e);
        }
        return count;
    }

    public static void main(String[] args) {
        // int count1 = countWordInFile("howToCode.txt");
        int count2 = countWordInFile2("howToCode.txt");
        System.out.println("Word count: " + count2);
    }
}
