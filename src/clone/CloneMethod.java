package clone;//Package name

public class CloneMethod implements Cloneable{//Implement the Cloneable interface
   public String name; //Declare a variable of type String


    public CloneMethod(String other) { //Constructor
        this.name = other;//Assign the value of the parameter to the variable
    }//End of constructor

    public String getName() {
        return name;
    }
    
    @Override//Override the clone method
    public Object clone() {//Override the clone method
        try {//Try to clone the object
            CloneMethod cm = (CloneMethod) super.clone();//Cast the object to the type of the class to make sure
            cm.name = (String) name;//Assign the value of the variable to the new object
            return cm;//Return the new object
        } catch (CloneNotSupportedException e) {//If the object cannot be cloned
            throw new AssertionError();//Throw an error
        }//End of try-catch
    }//End of clone method
}   //End of CloneMethod class
