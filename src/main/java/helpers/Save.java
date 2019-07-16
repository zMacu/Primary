package helpers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Save {

    public static void writeUsingFileWriter(String data) {
        File file = new File("BooksAndMagazines.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file, true);
            fr.write(data + "\n");
            //fr.append(data);
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            //close resources
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
