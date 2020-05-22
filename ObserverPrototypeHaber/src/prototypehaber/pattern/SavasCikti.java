
package prototypehaber.pattern;

/**
 *
 * @author Ender
 */
public class SavasCikti extends Haber {
    public SavasCikti(){
        icerik = "Rusya ve Amerika savaş bildirisi yayımladı!";
    }

    @Override
    void yaz() {
        System.out.println("SavasCikti.java Class'ındaki yaz() metodu.");
    }
}
