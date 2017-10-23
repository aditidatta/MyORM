import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;

/**
 * Created by alien on 4/7/17.
 */
public class Main {
    public static void main(String[] args) throws Exception{
        Class<?> cl = Class.forName("java.lang.String");
        Constructor<?> cons = cl.getConstructor(cl);
        Object obj = cons.newInstance("Hello world");
        System.out.println(obj);
        System.out.println(cl.getName());
        System.out.println(obj.hashCode());
        //ParameterizedType type = (ParameterizedType) obj.getGenericType();
        Map<Object, Book> map = new HashMap<>();
        map.put("hello", new Book("Hello", "Aditi"));
        String str = "Hello";

        if(cl.isInstance(str)){
            System.out.println("Yes");
        }

        Object ob = new ArrayList<Book>();
        System.out.println(ob.getClass());
        System.out.println(map.get("hello"));

        /*HashMap< Double, String> map1 = new HashMap<>();
        map1.put(new Double(12), "Hello");
        map1.put(new Double(12), "World");

        System.out.println(map1.get(new Double(12)));
        */

        Book[] books = new Book[5];


        Object object = null;
        if(null instanceof Object){
            System.out.println("OBJECT");
        }
        else{
            System.out.println("NONE");
        }

        Column col = Column.Double;
        System.out.println(col);

        Class<?> cl1 = Class.forName(col.getName());
        //Constructor<?> cons1 = cl1.getConstructor(cl1);
        //Class[] argTypes = new Class[] { String.class };
        //Method m = cl.getMethod("parseDouble");
        Method m = cl1.getDeclaredMethod("parse"+col, String.class);
        Object obj1 = m.invoke(null, "123.23");
        Double num = (Double) obj1;
        if(cl1 == Double.class){
            System.out.println("works");
        }
        System.out.println(num);

        TreeMap<Object, String> map1= new TreeMap<>();
        map1.put(0.23, "0.23");
        map1.put(0.24, "0.24");
        map1.put(0.14, "0.14");
        map1.put(0.12, "0.12");

        SortedMap<Object, String> subMap = map1.tailMap(0.23);

        for(String string : subMap.values()){
            System.out.println(string);
        }

        Object str2 = new String("New");
        Object str3 = new String("Few");

        Comparable<? super Object> compStr2 = (Comparable<? super Object>) str2;
        Comparable<? super Object> compStr3 = (Comparable<? super Object>) str3;

        if(compStr2.compareTo(compStr3) > 0){
            System.out.println(compStr2 + " is Greater than " + compStr3 );
        }else if(compStr2.compareTo(compStr3) < 0){
            System.out.println(compStr2 + " is less than " + compStr3 );
        }else{
            System.out.println(compStr2 + " is equal to " + compStr3 );
        }

    }
}
