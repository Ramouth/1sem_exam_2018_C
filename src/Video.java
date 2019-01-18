//Syntaksen for at nedarve fra Media
public class Video extends Media {

    //datafields til klassen
    private String filType;
    private int duration;
    private String resolution;
    private String fotograf;

//laver objekt sådan at vi nu kan lave et Video-objekt
    public Video(String filType, int duration, int resolution, String fotograf) {
        this.filType = filType;
        this.duration = duration;
        this.resolution = "HD";
        this.fotograf = "Jens Peter";
}
}


