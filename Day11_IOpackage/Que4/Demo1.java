package Day11_IOpackage.Que4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) throws Exception {
		List<Student> stdList = new ArrayList<>();
		stdList.add(new Student(1,"Ram", 100, new Address("MH","Mumbai" , 28219)));
		stdList.add(new Student(2,"Shyam", 200, new Address("CG","Raipur" , 226219)));
		stdList.add(new Student(3,"Ramesh", 300, new Address("Bh","Patna" , 34726)));
		stdList.add(new Student(4,"Dinesh", 250, new Address("Rj","Jaipur" , 27863)));
		stdList.add(new Student(5,"raj", 130, new Address("Mp","Bhopal" , 54339)));
		
		 ObjectOutputStream oos =  new ObjectOutputStream(new FileOutputStream("d://studentdata.txt"));
		
		 oos.writeObject(stdList);
		 
		 oos.close();
		 
		 System.out.println("done");
	}

}

class Address implements Serializable{
	
	String state ; 
	String city ; 
	int pincode; 
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String state, String city, int pincode) {
		super();
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", pincode=" + pincode + "]";
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
	
}

class Student implements Serializable{
		int roll;
		String name; 
		int marks; 
	    Address address; 
	    
	    public Student() {
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", address=" + address + "]";
		}

		public Student(int roll, String name, int marks, Address address) {
			super();
			this.roll = roll;
			this.name = name;
			this.marks = marks;
			this.address = address;
		}

		public int getRoll() {
			return roll;
		}

		public void setRoll(int roll) {
			this.roll = roll;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getMarks() {
			return marks;
		}

		public void setMarks(int marks) {
			this.marks = marks;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		};
		
}

