//Importere java input/output

import java.io.File;
import java.time.Instant;
import java.util.Date;

//Importerer java.time.Instant, der gør at man kan lave et timestamp
//Importerer en utility pakke, der kan håndterer datoer.

//deklarer klassen, der kaldes Media. Klassen er public
public class Media {
//Her instanstieres en række member variables til klassen.
    //assetId instantieres til at være en int eller Integer. Den er private
    private int assetId;
    //Name instansieres som en String. Den er private
    private String name;
    //Date initializer new Date(), der betyder, at når vi skriver Date, bruger vi Java´s Date() metode, der giver os dagens dato.
    private Date created = new Date();
    //fileName er en private string.
    private String fileName;

//public metoden Media deklareres hermed
    public Media() {
        //assetId bliver her lig med mediaId, der er en metode, der deklareres i MediaID-mappen. Metoden bruges til at generer en id
        assetId = MediaID.generate();
        //Date der er instansieret længere oppe bliver brugt sammen med java metoden from. Instant.now metoden betyder at date bruger den nuværende dato. Dermed giver Created dagens dato.
        created = Date.from(Instant.now());
    }
//Get-metoden, der betyder, at man nu nemt kan bruge denne klasses assetID i andre klasser og at det skal være en integer, når den bliver kaldt
    public int getAssetId() {
        return assetId;
    }
//Set-metoden sørger for at sette assetId til en integer, når den bliver kaldt
    public void setAssetId(int assetId) {
        this.assetId = assetId;
    }
//Bruger get-metoden til at sørge for at Name er String når den bliver kaldt
    public String getName() {
        return name;
    }
//Bruger set-metoden til at sørge for at Name er String når den bliver kaldt
    public void setName(String name) {
        this.name = name;
    }
//Created bruger nu Get-metoden skal hermed være af Datatypen Date når den bliver kaldt
    public Date getCreated() {
        return created;
    }

    //Created bruger nu set-metoden skal hermed være af Datatypen Date
    public void setCreated(Date created) {
        this.created = created;
    }
//get-metoden betyder at fileName nu skal returnere String, når fileName bliver kaldt
    public String getFileName() {
        return fileName;
    }
//set-metoden betyder at fileName nu skal returnere String når den bliver kaldt
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    //Overrider toString metoden som betyder, at det kan blive nemmere at operere med datatyper som f.eks. Date.

    @Override
    public String toString() {
        return "Media{" +
                "assetId=" + assetId +
                ", name='" + name + '\'' +
                ", created=" + created +
                ", fileName='" + fileName + '\'' +
                '}';

    }
    //metoden er påbegyndt til at finde og printe filerne
    public void logToConsol() {
        File file = new File(Main.MEDIA_MAPPE);
                //if
    }
}