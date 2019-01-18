//Dette er Main Classen for projektet. Classen er public
public class Main {
//Her deklareres en konstant. I dette tilfælde en string, der ikke kan ændres. Den er static som betyder, at den kaldes uden for klassen. Her er det software versionen.
    public static final String SOFTWARE_VERSION = "0.1.0";
    //Her deklareres en konstant. I dette tilfælde en string, der ikke kan ændres. Den er static som betyder, at den kaldes uden for klassen. Her kaldes MEDIA MAPPEN for media
    public static final String MEDIA_MAPPE = "media/";

//her kaldes en metode med datatypen string. Den er static, så den kan kaldes uden for sin klasse som er tilfældet her.
    public static void main(String[] args) {
        //Metoden test kaldes her. Denne metode er kaldt i test-mappen.

        Test.test();

    }
}

