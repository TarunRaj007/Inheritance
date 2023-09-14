package OopsConcept;

public class ChildClass extends ParentClass {
	
	public void Tarun() {
		System.out.println("print Tarun");
	}
	public void Praveen() {
		System.out.println("print Praveen");
	}

	public static void main(String[] args) {
		ChildClass c=new ChildClass();
		c.Tarun();
		c.Praveen();
		c.venkat();
		c.sam();
	}

}
