/**
 * Created by alien on 4/7/17.
 */
public abstract class Model {
    abstract Attribute[] getAttributes();
    abstract Object getValueForAttribute(Attribute attribute);
}
