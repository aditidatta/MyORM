/**
 * Created by alien on 4/5/17.
 */
public class Attribute {
    private String name;
    private String type;
    private boolean unique;
    private boolean primary;


    public Attribute(String name, String type) {
        this.name = name;
        this.type = type;
        this.unique = false;
        this.primary = false;
    }

    public Attribute(String name, String type, boolean unique) {
        this.name = name;
        this.type = type;
        this.unique = unique;
        this.primary = false;
    }

    public Attribute(String name, String type, boolean unique,
                     boolean primary) {
        this.name = name;
        this.type = type;
        this.unique = unique;
        this.primary = primary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isUnique() {
        return unique;
    }

    public boolean isPrimary() {
        return primary;
    }

    public void setUnique(boolean unique) {
        this.unique = unique;
    }

    public void setPrimary(){
        primary = true;
    }
}
