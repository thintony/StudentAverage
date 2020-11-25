package cohort5;

public class Student {
	private String name;
	private double average;
	
	public Student(String name, double average){
		this.name = name;
		
		if(average >0.0)
			if(average <= 100.0)
				this.average = average;
	}
	
	public void name(String name) {
		this.name = name;
	}
	public String name() {
		return name;
	}
	public void average(double average) {
		if(average > 0.0)
			if(average <= 100.0)
				this.average = average;
	}
	public double average() {
		return average;
	}
	
	public String grade() {
		String grade = "";
		if (average >= 90.0)
			grade = "A";
		else if (average >= 80.0)
			grade = "B";
		else if (average >= 70.0)
			grade = "C";
		else if(average >=60)
			grade = "D";
		else 
			grade = "F";
		
		return grade;
	}

	
	public static void main(String[] args) {
		Student student1 = new Student("Tope Ojeme", 85.6);
		
		Student student2 = new Student("Okpe Okopi", 34.6);
		
		Student student3 = new Student("Joe Ofodu", 65.6);
		

		System.out.printf("ClassA Name is:%s%nAverage:%.2f%nGrade:%s%n%n",student1.name(),student1.average(),student1.grade());
		System.out.printf("ClassB Name is:%s%nAverage:%.2f%nGrade:%s%n%n",student2.name(),student2.average(),student2.grade());
		System.out.printf("ClassC Name is:%s%nAverage:%.2f%nGrade:%s",student3.name(),student3.average(),student3.grade());
		
	}

}
