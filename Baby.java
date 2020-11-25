package cohort5;

import java.util.Scanner;

public class Baby {
	private String name;
	private String gender;
	
	public Baby(String name, String gender) {
		this.name = name;
		if(name == "samuel") {
			this.gender = "male";
		}
		else
		{ 
			this.gender = "female";
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Baby obj = new Baby("samuel","female");
		
		System.out.printf("%s%n%s", obj.getName(),obj.getGender());
		
		
		
		}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

}
