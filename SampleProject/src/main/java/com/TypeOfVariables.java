package com;

public class TypeOfVariables {
	
/* Types of variables are below,
 * 1) Instance Variable
 * 2) Static Variable
 * 3) Local Variable --> can be use within the loop or method or block only 
 */
	
	public String empName; //instance variable creates when object creation and destroy when object destroy
	public int empId;
	public static String projectName="LBG"; // static variable creates when class loads and destroy when class unloads
	public int fileId;
	public static String companyName;
	public long mobileNo;
	

	public static void main(String[] args) {
		
		int a=10; // Local variables
		int b=20,c;
		c=a+b;
		System.out.println("Value of c is:"+c);
		companyName="TCS";
		System.out.println("Company Name is:" +companyName);
		TypeOfVariables tov =new TypeOfVariables();
		tov.empName="Raghav";
		projectName="Dupont"; // overrides Project Name
		System.out.println("Employe name is:" + tov.empName);
		TypeOfVariables tov1 = new TypeOfVariables("Gopi",1239486,8773959,9032858059l);
		System.out.println("Name of Employ:" + tov1.empName );
		System.out.println("Id of Employ is :" +tov1.empId);
		System.out.println("Company Name is:"+companyName);
		System.out.println("File id of Project is:"+tov1.fileId);
		System.out.println("Name of Project is:" +projectName);
		System.out.println("Mobile No of Employ is:" +tov1.mobileNo);
		
		

	}
	


	public TypeOfVariables() {
		super();
	}



	public TypeOfVariables(String empName, int empId, int fileId, long mobileNo) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.fileId = fileId;
		this.mobileNo = mobileNo;
	}

}
