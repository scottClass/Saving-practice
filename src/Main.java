
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author johns6971
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Scanner input = new Scanner(System.in);

        int option = input.nextInt();

        if (option == 1) {
            FileOutputStream saveFile = new FileOutputStream("save.txt");
            ObjectOutputStream save = new ObjectOutputStream(saveFile);

            int toEnter = input.nextInt();
            save.writeObject(toEnter);
        } else if (option == 2) {
            FileInputStream saveFile = new FileInputStream("save.txt");
            ObjectInputStream save = new ObjectInputStream(saveFile);

            int toRead = (Integer) save.readObject();
            System.out.println(toRead);
        } else if (option == 3) {
            FileOutputStream saveFile = new FileOutputStream("save.txt");
            saveFile.close();
        }

    }
}
