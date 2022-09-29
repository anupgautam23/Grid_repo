package Day11_IOpackage;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable {
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNameString() {
		return nameString;
	}


	public void setNameString(String nameString) {
		this.nameString = nameString;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", nameString=" + nameString + ", age=" + age + "]";
	}


	int id ; 
	String nameString ; 
	transient int age ;
	

	public Student(int id, String nameString, int age) {
		super();
		this.id = id;
		this.nameString = nameString;
		this.age = age;
	}


	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Student s1 =  new Student(1, "ram", 20);
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("d://file.txt"));
		out.writeObject(s1);
		
		out.close();
		
		
		System.out.println("okk");
	}

}
