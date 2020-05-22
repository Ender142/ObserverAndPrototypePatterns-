
package prototypehaber.pattern;

/**
 *
 * @author Ender
 */
public class DepremOldu extends Haber {
    public DepremOldu() {
    icerik = "İstanbul'da 7.8 büyüklüğünde deprem meydana geldi!";
}

    @Override
    void yaz() {
        System.out.println("DepremOldu.java Class'ındaki yaz() metodu.");
    }
}
