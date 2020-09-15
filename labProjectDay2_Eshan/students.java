package labProjectDay2_Eshan;

import java.util.Scanner;

class StudentC{
	private String name, id;
	private double grade;
	public StudentC(String name, String id) {
		this(name,id,-1.0);
	}
	public StudentC(String name, String id, double grade) {
		this.name=name;
		this.id=id;
		this.grade=grade;
	}
	public StudentC(String id) {
		this("",id,-1.0);
	}
	public void display() {
		if(!name.equals("")) {
			System.out.println("Name: "+name);
		}
		if(grade!=-1.0) {
			System.out.println("Grade: "+grade);
		}
	}
	public void display(int year) {
		display();
		System.out.println("Year: "+year);
	}
}
public class students {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StudentC s = null;
		while(true) {
			System.out.println("Enter 1 to create student, 2 to display details, 3 to exit");
			int resp = scan.nextInt();
			if(resp==1) {
				System.out.println("Enter 1 to create student using name id & grade, 2 to create student using name & id, 3 to create student using id");
				int choice = scan.nextInt();
				if(choice==1) {
					scan.nextLine();
					System.out.print("Enter name: ");
					String name = scan.nextLine();
					System.out.print("Enter id: ");
					String id = scan.nextLine();
					System.out.print("Enter grade: ");
					double grade = scan.nextDouble();
					s = new StudentC(name, id, grade);
				}
				else if(choice==2) {
					scan.nextLine();
					System.out.print("Enter name: ");
					String name = scan.nextLine();
					System.out.print("Enter id: ");
					String id = scan.nextLine();
					s = new StudentC(name, id);
				}
				else {
					scan.nextLine();
					System.out.print("Enter id: ");
					String id = scan.nextLine();
					s = new StudentC(id);
				}
			}
			else if(resp==2) {
				System.out.println("Enter 1 display the object with year, 2 without year");
				int choice = scan.nextInt();
				if (choice == 1) {
					System.out.print("Enter year: ");
					int year = scan.nextInt();
					if (s != null)
						s.display(year);
				} else if (choice == 2) {
					s.display();
				}
			}
			else {
				break;
			}
		}
		scan.close();
	}

}
