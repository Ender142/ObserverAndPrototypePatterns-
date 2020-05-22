
package prototypehaber.pattern;

/**
 *
 * @author Ender
 */
public abstract class Haber implements Cloneable {
    private String id;
    protected String icerik;
    abstract void yaz();
    public String getIcerik(){
        return icerik;
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id=id;
    }
    public Object clone(){
        Object clone = null;
        try {
            clone=super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
