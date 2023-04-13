package clone;

public class Clone {
    public static void main(String[] args) {//Main method
        CloneMethod cm = new CloneMethod("CARLOs");//Create a new object
        CloneMethod cm2 = (CloneMethod) cm.clone();//Create a new object and clone the previous one
        System.out.println(cm.name);
        System.out.println(cm2.name);
    }
}