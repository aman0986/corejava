package inheritence1;

public class ChildClass extends ParentClass{

    int child;

    public ChildClass(int parent, int child) {
        super(parent); 
        this.child = child;
    }

    public void childMethod() {
        System.out.println("This is a child method.");
    }


}
