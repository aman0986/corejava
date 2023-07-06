package inheritence1;

public class TestParent {
	public static void main(String[] args) {
        ParentClass parentObj = new ParentClass(10);
        parentObj.parentMethod();

        ChildClass childObj = new ChildClass(20, 30);
        childObj.parentMethod(); 
        childObj.childMethod();

        System.out.println("Parent Field: " + parentObj.parent);
        System.out.println("Child papa: " + childObj.parent);
        System.out.println("Child Field: " + childObj.child);
        
    }
}


