public class Student{
	private String name;
	private double[] grades;
	private static int totalNumberOfStudents=1;

	public Student (){

	}
	//setting name
	public void setname(String name){
		this.name=name;
	}
	//getting name
	public String getname(){
		return this.name;
	}
	//setting grades
	public void setgrades(double[] grades){
		this.grades=grades;
	}
	//getting grades
	public double[] getgrades(){
		return this.grades;
	}
	//method of getting average
	public double grades(){
		//declare variables
		double sum=0;
		double average;
		//creating a forloop
		for (int a=0; a<grades.length; a++){
			sum+=grades[a];
		}
		average=sum/grades.length;
		return average;
	}
	//getting totalNumbeOfStudents
	public int gettotalNumbeOfStudents(){
		return this.totalNumberOfStudents++;
	}
	public void printStudentDetails(){
		System.out.println("Student name is:" + this.name);
		System.out.println("Average grade is:" + grades());
		System.out.println("Total number of Students is:" +this.totalNumberOfStudents);
	}
}