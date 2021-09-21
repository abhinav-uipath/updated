package access_modifiers_and_setter_getter;
class MyEmp{
	int salary;
	String Name;
	
	public int getsalary() {
		return salary;
	}
	public String getname() {
		return Name;
	}
	public void setname(String n) {
		Name = n;
	}
}
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyEmp aman=new MyEmp();
		aman.setname("Abhinav Sharma");
		System.out.println(aman.getname());
		aman.salary=111;
		System.out.println(aman.getsalary());
	}

}
