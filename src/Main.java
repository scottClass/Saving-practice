
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
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Scanner input = new Scanner(System.in);
        
        int x = input.nextInt();
        
        if (x == 1) {
            FileOutputStream saveFile = new FileOutputStream("save.txt");
            ObjectOutputStream save = new ObjectOutputStream(saveFile);
            
            int y = input.nextInt();
            save.writeObject(y);
        } else if (x == 2) {
            FileInputStream saveFile = new FileInputStream("save.txt");
            ObjectInputStream save = new ObjectInputStream(saveFile);
            
            int z = (Integer) save.readObject();
            System.out.println(z);
        }

    }
}
