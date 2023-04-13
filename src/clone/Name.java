package clone;

public class Name implements Cloneable {
 
    @Override
    protected Object clone() 
    throws CloneNotSupportedException 
    {
        return super.clone();
    }
    
}
