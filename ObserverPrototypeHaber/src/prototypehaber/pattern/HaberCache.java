
package prototypehaber.pattern;

/**
 *
 * @author Ender
 */
import java.util.Hashtable;
public class HaberCache {
    private static Hashtable<String, Haber> haberMap 
            = new Hashtable<String, Haber>();
    public static Haber getHaber(String haberID){
        Haber cachedHaber = haberMap.get(haberID);
        return (Haber) cachedHaber.clone();
    }
    public static void loadCache(){
        DepremOldu deprem = new DepremOldu();
        deprem.setId("1");
        haberMap.put(deprem.getId(), deprem);
        SavasCikti savas = new SavasCikti();
        savas.setId("2");
        haberMap.put(savas.getId(), savas);
    }
    
}
