package OopsConcept;

public class GrandChild extends ChildClass{
	public void Raju() {
		System.out.println("Raju");
	}

	public static void main(String[] args) {
		GrandChild c = new GrandChild();
		c.Raju();
		c.Tarun();
		c.Praveen();

	}

}
