class PARENT{
    void print(){
        System.out.println("this is a parent class");
    }
}
class CHILD extends PARENT{
    void print(){
        System.out.println("this is a child class");
    }
}



//Do Not change the Below Main Method


public class Main1 {
    public static void main(String args[]) {
        PARENT obj_parent = new PARENT();
        obj_parent.print();
        
        CHILD obj_child = new CHILD();
        obj_child.super.print();

    }
}
