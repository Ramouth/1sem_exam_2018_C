//Syntaksen for at nedarve fra Media
public class Billede extends Media {

    //datafields til klassen
    private String filType;
    private int pixelBredde;
    private int pixelHøjde;
    private String fotograf;

    //laver objekt sådan at vi nu kan Billede-objekt
    public Billede (String filType, int duration, int resolution, String fotograf) {
        this.filType = filType;
        this.pixelBredde = 1920;
        this.pixelHøjde = 1080;
        this.fotograf = "Jens Nielsen";
    }
}