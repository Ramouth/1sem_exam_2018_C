//importere en række pakker til Java

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


/**
 *  Hver mediefil hos TV2 skal have et unikt ID, og denne klasse hjælper med at genrere unikke ID'er
 */

//laver en public class, der hedder MediaID
public class MediaID {
//instantierer variablen latestId til at være en int og være 100
    private static int latestId = 100;

//laver en metode, der kan generere noget. I dette tilfælde bliver det en fil
    public static int generate() {
        //Sørger for at der genereres en ny fil. Dens path navn bliver media_id, sådan at hver bruger kan lave en unik fil.
        File file = new File("media_id.txt");

        // Låser filen op før adgang
        // file.setWritable(true);
//Her bruges try til at sørge for, at vi ikke får en fejl, når der er en fil af det samme navn.
        try {

//Hvis der er en fil ved det samme navn, så bruges scanner objektet til at finde latest ID og ligge en til med ++, sådan at to filer ikke får samme path
            if (file.exists()) {
                FileReader fileReader = new FileReader(file);
                Scanner scanner = new Scanner(file);
                latestId = (int) scanner.nextInt();
            }

            latestId++;
//Bruger fileWriter til at lave et ny objekt (file)
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(Integer.toString(latestId));
            fileWriter.close();

//Sørger for at alle exeptions bliver Catched
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Låser filen ned for at den ikke redigeres ved en fejl
        // file.setReadOnly();
//returnerer LatestId
        return latestId;
    }

}