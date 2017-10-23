/**
 * Created by alien on 4/10/17.
 */
public enum Column {
    Integer(1,"java.lang.Integer"), Double(2,"java.lang.Double"), String(3,"java.lang.String");

    int value;
    String name;

    Column(int value, String name){
        this.value = value;
        this.name = name;
    }

    public int getValue(){
        return value;
    }

    public String getName(){
        return name;
    }
/*
    public String toString(){
        return name;
    }*/
}
