import java.util.Scanner;

public class Implementation{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Student fulo = new Student();
		System.out.println ("please enter name");
		String name = input.nextLine();
		//creating an array
		double [] grades = new double [3];
		System.out.println ("please enter grades");
		//creating a forloop
		for (int i=0; i<grades.length; i++){
			grades[i] = input.nextDouble ();
		}
		fulo.setname(name);
		fulo.setgrades(grades);
		fulo.printStudentDetails();
		
	}
}