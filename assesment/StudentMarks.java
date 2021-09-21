package assesment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

class Student{
	 int id;  
	    String name;  
	    float marks;  
	  //  public Student(int id, String name, float price) {

		public Student(int id, String name, float marks) {
			super();
			this.id = id;
			this.name = name;
			this.marks = marks;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public float getMarks() {
			return marks;
		}
		public void setMarks(float marks) {
			this.marks = marks;
		}
}
public class StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Student> studentlist = new ArrayList<Student>();
		 
		 //Adding Student data
		 studentlist.add(new Student(1,"ravi",60.0f));
		 studentlist.add(new Student(2,"abhi",62.0f));
		 studentlist.add(new Student(3,"aman",63.0f));
		 studentlist.add(new Student(4,"avinash",64.0f));
		 

		 Student studentA = studentlist.stream().max((student1, student2)->student1.marks > student2.marks ? 1: -1).get();    
	        System.out.println("Highest marks is "+studentA.marks);
	        OptionalDouble averageMarks = studentlist.stream()//.filter(n -> n.getName())
	        		.mapToDouble(s -> s.getMarks()).average();
         System.out.println("Average marks is "+averageMarks);
         
         Optional<Student> student = studentlist.stream()
        	        .sorted(Comparator.comparingDouble(Student::getMarks).reversed()).skip(1).findFirst();
        System.out.println(student.get());
         
         
         List < Student > employeesSortedList1 = studentlist.stream()
         .sorted((o1, o2) -> (int)(o2.getMarks() - o1.getMarks())).collect(Collectors.toList());
         System.out.println(employeesSortedList1);
	}

}
