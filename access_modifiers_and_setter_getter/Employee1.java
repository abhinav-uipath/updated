package access_modifiers_and_setter_getter;



/*class EmployeeClass {
	private int id;
	 private String name;

	public String getname() {
	return	name;
	}

	public void setname(String n) {
		this.name = n;

	}

	public int getid() {
		return id;
	}

	public void setid(int i) {
		this.id= i;
	}*/

 public class Employee1 {
	  int id;
	  String name;

	public String getname() {
	return	name;
	}

	public void setname(String n) {
		this.name = n;

	}

	public int getid() {
		return id;
	}

	public void setid(int i) {
		this.id= i;
	}
	public static void Main(String[] args) {

		Employee1 aman=new Employee1();
		aman.setid(56);
		System.out.println(aman.getid());
		aman.setname("abhi");
		System.out.println(aman.getname());
		
}
}

