public class Student {
	private String name = "John";
	private String classes = "CO2";

	public Student() {}

	public void setName(String newName) {
		System.out.println("Name of " + name + " is set to: " + newName);
		name = newName;
	}

	public void setClasses(String newClasses) {
		System.out.println("Class " + classes + " is set to: " + newClasses);
		classes = newClasses;
	}
}
