package school;

import java.util.*;

public class Student {
	private String name;
	private String ssid;
	private String birthday;
	private double gpa;
	private String healthCond;
	private String address;
	private int grade;
	private String lunchNum;
	private String email;
	private Classes[] classes;
	private String phone;
	Scanner input = new Scanner(System.in);
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsid() {
		return ssid;
	}

	public void setSsid(String ssid) {
		this.ssid = ssid;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getHealthCond() {
		return healthCond;
	}

	public void setHealthCond(String healthCond) {
		this.healthCond = healthCond;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getLunchNum() {
		return lunchNum;
	}

	public void setLunchNum(String lunchNum) {
		this.lunchNum = lunchNum;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public Student(String name, String ssid, String birthday, double gpa, String healthCond, String address, int grade,
			String lunchNum, String email, String phone) {
		super();
		this.name = name;
		this.ssid = ssid;
		this.birthday = birthday;
		this.gpa = gpa;
		this.healthCond = healthCond;
		this.address = address;
		this.grade = grade;
		this.lunchNum = lunchNum;
		this.email = email;
		this.phone = phone;
	}

	public Student(double gpa, int grade) {
		super();
		this.gpa = gpa;
		this.grade = grade;
	}
	
	private String genId() {
		Random rand = new Random();
		int num1 = rand.nextInt(10);
		String pos1 = Integer.toString(num1);
		int num2 = rand.nextInt(10);
		String pos2 = Integer.toString(num2);
		int num3 = rand.nextInt(10);
		String pos3 = Integer.toString(num3);
		int num4 = rand.nextInt(10);
		String pos4 = Integer.toString(num4);
		int num5 = rand.nextInt(10);
		String pos5 = Integer.toString(num5);
		int num6 = rand.nextInt(10);
		String pos6 = Integer.toString(num6);
		int num7 = rand.nextInt(10);
		String pos7 = Integer.toString(num7);
		int num8 = rand.nextInt(10);
		String pos8 = Integer.toString(num8);
		
		String id = pos1+pos2+pos3+pos4+pos5+pos6+pos7+pos8;
		
		return id;
	}
	
	private String genLunchNum(String ssid, int grade) {
		String end = Integer.toString(grade);
		
		String num = ssid+end;
		return num;
	}
	
	private void pickClasses() {
		String[] classList = {"Math",
				"English",
				"History",
				"Science",
				"ProgrammingJava",
				"ProgrammingPython",
				"ProgrammingCSharp",
				"PE",
				"ProStart",
				"Cosmetology",
				"Health",
				"Choir",
				"Internship",
				"Accounting",
				"Business",
				"AutoShop",
				"Woodworking",
				"Welding",
				"APlus"};
		
		for(int i = 0; i<19; i++) {
			System.out.println(classList[i]);
		}
		System.out.println("What class would you like for period 1?");
		String inputclass = input.nextLine();
		if(inputclass.equalsIgnoreCase("Math")) {
			classes[0] = Classes.Math;
		}
		else if(inputclass.equalsIgnoreCase("English")) {
			classes[0] = Classes.English;
		}
		else if(inputclass.equalsIgnoreCase("History")) {
			classes[0] = Classes.History;
		}
		else if(inputclass.equalsIgnoreCase("Science")) {
			classes[0] = Classes.Science;
		}
		else if(inputclass.equalsIgnoreCase("ProgrammingJava")) {
			classes[0] = Classes.ProgrammingJava;
		}
		else if(inputclass.equalsIgnoreCase("ProgrammingPython")) {
			classes[0] = Classes.ProgrammingPython;
		}
		else if(inputclass.equalsIgnoreCase("ProgrammingCSharp")) {
			classes[0] = Classes.ProgrammingCSharp;
		}
		else if(inputclass.equalsIgnoreCase("PE")) {
			classes[0] = Classes.PE;
		}
		else if(inputclass.equalsIgnoreCase("ProStart")) {
			classes[0] = Classes.ProStart;
		}
		else if(inputclass.equalsIgnoreCase("Cosmetology")) {
			classes[0] = Classes.Cosmetology;
		}
		else if(inputclass.equalsIgnoreCase("Health")) {
			classes[0] = Classes.Health;
		}
		else if(inputclass.equalsIgnoreCase("Choir")) {
			classes[0] = Classes.Choir;
		}
		else if(inputclass.equalsIgnoreCase("Internship")) {
			classes[0] = Classes.Internship;
		}
		else if(inputclass.equalsIgnoreCase("Accounting")) {
			classes[0] = Classes.Accounting;
		}
		else if(inputclass.equalsIgnoreCase("Business")) {
			classes[0] = Classes.Business;
		}
		else if(inputclass.equalsIgnoreCase("AutoShop")) {
			classes[0] = Classes.AutoShop;
		}
		else if(inputclass.equalsIgnoreCase("Woodworking")) {
			classes[0] = Classes.Woodworking;
		}
		else if(inputclass.equalsIgnoreCase("Welding")) {
			classes[0] = Classes.Welding;
		}
		else if(inputclass.equalsIgnoreCase("APlus")) {
			classes[0] = Classes.APlus;
		}
		else {
			System.out.println("Class not listed, assigning Programming.");
			classes[0] = Classes.ProgrammingJava;
		}
		for(int i = 0; i<19; i++) {
			System.out.println(classList[i]);
		}
		System.out.println("What class would you like for period 1?");
		String inputclass2 = input.nextLine();
		if(inputclass2.equalsIgnoreCase("math")) {
			classes[1] = Classes.Math;
		}
		else if(inputclass2.equalsIgnoreCase("English")) {
			classes[1] = Classes.English;
		}
		else if(inputclass2.equalsIgnoreCase("History")) {
			classes[1] = Classes.History;
		}
		else if(inputclass2.equalsIgnoreCase("Science")) {
			classes[1] = Classes.Science;
		}
		else if(inputclass2.equalsIgnoreCase("ProgrammingJava")) {
			classes[1] = Classes.ProgrammingJava;
		}
		else if(inputclass2.equalsIgnoreCase("ProgrammingPython")) {
			classes[1] = Classes.ProgrammingPython;
		}
		else if(inputclass2.equalsIgnoreCase("ProgrammingCSharp")) {
			classes[1] = Classes.ProgrammingCSharp;
		}
		else if(inputclass2.equalsIgnoreCase("PE")) {
			classes[1] = Classes.PE;
		}
		else if(inputclass2.equalsIgnoreCase("ProStart")) {
			classes[1] = Classes.ProStart;
		}
		else if(inputclass2.equalsIgnoreCase("Cosmetology")) {
			classes[1] = Classes.Cosmetology;
		}
		else if(inputclass2.equalsIgnoreCase("Health")) {
			classes[1] = Classes.Health;
		}
		else if(inputclass2.equalsIgnoreCase("Choir")) {
			classes[1] = Classes.Choir;
		}
		else if(inputclass2.equalsIgnoreCase("Internship")) {
			classes[1] = Classes.Internship;
		}
		else if(inputclass2.equalsIgnoreCase("Accounting")) {
			classes[1] = Classes.Accounting;
		}
		else if(inputclass2.equalsIgnoreCase("Business")) {
			classes[1] = Classes.Business;
		}
		else if(inputclass2.equalsIgnoreCase("AutoShop")) {
			classes[1] = Classes.AutoShop;
		}
		else if(inputclass2.equalsIgnoreCase("Woodworking")) {
			classes[1] = Classes.Woodworking;
		}
		else if(inputclass2.equalsIgnoreCase("Welding")) {
			classes[1] = Classes.Welding;
		}
		else if(inputclass2.equalsIgnoreCase("APlus")) {
			classes[1] = Classes.APlus;
		}
		else {
			System.out.println("Class not listed, assigning Programming.");
			classes[1] = Classes.ProgrammingJava;
		}
		for(int i = 0; i<19; i++) {
			System.out.println(classList[i]);
		}
		System.out.println("What class would you like for period 1?");
		String inputclass3 = input.nextLine();
		if(inputclass3.equalsIgnoreCase("math")) {
			classes[2] = Classes.Math;
		}
		else if(inputclass3.equalsIgnoreCase("English")) {
			classes[2] = Classes.English;
		}
		else if(inputclass3.equalsIgnoreCase("History")) {
			classes[2] = Classes.History;
		}
		else if(inputclass3.equalsIgnoreCase("Science")) {
			classes[2] = Classes.Science;
		}
		else if(inputclass3.equalsIgnoreCase("ProgrammingJava")) {
			classes[2] = Classes.ProgrammingJava;
		}
		else if(inputclass3.equalsIgnoreCase("ProgrammingPython")) {
			classes[2] = Classes.ProgrammingPython;
		}
		else if(inputclass3.equalsIgnoreCase("ProgrammingCSharp")) {
			classes[2] = Classes.ProgrammingCSharp;
		}
		else if(inputclass3.equalsIgnoreCase("PE")) {
			classes[2] = Classes.PE;
		}
		else if(inputclass3.equalsIgnoreCase("ProStart")) {
			classes[2] = Classes.ProStart;
		}
		else if(inputclass3.equalsIgnoreCase("Cosmetology")) {
			classes[2] = Classes.Cosmetology;
		}
		else if(inputclass3.equalsIgnoreCase("Health")) {
			classes[2] = Classes.Health;
		}
		else if(inputclass3.equalsIgnoreCase("Choir")) {
			classes[2] = Classes.Choir;
		}
		else if(inputclass3.equalsIgnoreCase("Internship")) {
			classes[2] = Classes.Internship;
		}
		else if(inputclass3.equalsIgnoreCase("Accounting")) {
			classes[2] = Classes.Accounting;
		}
		else if(inputclass3.equalsIgnoreCase("Business")) {
			classes[2] = Classes.Business;
		}
		else if(inputclass3.equalsIgnoreCase("AutoShop")) {
			classes[2] = Classes.AutoShop;
		}
		else if(inputclass3.equalsIgnoreCase("Woodworking")) {
			classes[2] = Classes.Woodworking;
		}
		else if(inputclass3.equalsIgnoreCase("Welding")) {
			classes[2] = Classes.Welding;
		}
		else if(inputclass3.equalsIgnoreCase("APlus")) {
			classes[2] = Classes.APlus;
		}
		else {
			System.out.println("Class not listed, assigning Programming.");
			classes[2] = Classes.ProgrammingJava;
		}
		for(int i = 0; i<19; i++) {
			System.out.println(classList[i]);
		}
		System.out.println("What class would you like for period 1?");
		String inputclass4 = input.nextLine();
		if(inputclass4.equalsIgnoreCase("math")) {
			classes[3] = Classes.Math;
		}
		else if(inputclass4.equalsIgnoreCase("English")) {
			classes[3] = Classes.English;
		}
		else if(inputclass4.equalsIgnoreCase("History")) {
			classes[3] = Classes.History;
		}
		else if(inputclass4.equalsIgnoreCase("Science")) {
			classes[3] = Classes.Science;
		}
		else if(inputclass4.equalsIgnoreCase("ProgrammingJava")) {
			classes[3] = Classes.ProgrammingJava;
		}
		else if(inputclass4.equalsIgnoreCase("ProgrammingPython")) {
			classes[3] = Classes.ProgrammingPython;
		}
		else if(inputclass4.equalsIgnoreCase("ProgrammingCSharp")) {
			classes[3] = Classes.ProgrammingCSharp;
		}
		else if(inputclass4.equalsIgnoreCase("PE")) {
			classes[3] = Classes.PE;
		}
		else if(inputclass4.equalsIgnoreCase("ProStart")) {
			classes[3] = Classes.ProStart;
		}
		else if(inputclass4.equalsIgnoreCase("Cosmetology")) {
			classes[3] = Classes.Cosmetology;
		}
		else if(inputclass4.equalsIgnoreCase("Health")) {
			classes[3] = Classes.Health;
		}
		else if(inputclass4.equalsIgnoreCase("Choir")) {
			classes[3] = Classes.Choir;
		}
		else if(inputclass4.equalsIgnoreCase("Internship")) {
			classes[3] = Classes.Internship;
		}
		else if(inputclass4.equalsIgnoreCase("Accounting")) {
			classes[3] = Classes.Accounting;
		}
		else if(inputclass4.equalsIgnoreCase("Business")) {
			classes[3] = Classes.Business;
		}
		else if(inputclass4.equalsIgnoreCase("AutoShop")) {
			classes[3] = Classes.AutoShop;
		}
		else if(inputclass4.equalsIgnoreCase("Woodworking")) {
			classes[3] = Classes.Woodworking;
		}
		else if(inputclass4.equalsIgnoreCase("Welding")) {
			classes[3] = Classes.Welding;
		}
		else if(inputclass4.equalsIgnoreCase("APlus")) {
			classes[3] = Classes.APlus;
		}
		else {
			System.out.println("Class not listed, assigning Programming.");
			classes[3] = Classes.ProgrammingJava;
		}
		for(int i = 0; i<19; i++) {
			System.out.println(classList[i]);
		}
		System.out.println("What class would you like for period 1?");
		String inputclass5 = input.nextLine();
		if(inputclass5.equalsIgnoreCase("math")) {
			classes[4] = Classes.Math;
		}
		else if(inputclass5.equalsIgnoreCase("English")) {
			classes[4] = Classes.English;
		}
		else if(inputclass5.equalsIgnoreCase("History")) {
			classes[4] = Classes.History;
		}
		else if(inputclass5.equalsIgnoreCase("Science")) {
			classes[4] = Classes.Science;
		}
		else if(inputclass5.equalsIgnoreCase("ProgrammingJava")) {
			classes[4] = Classes.ProgrammingJava;
		}
		else if(inputclass5.equalsIgnoreCase("ProgrammingPython")) {
			classes[4] = Classes.ProgrammingPython;
		}
		else if(inputclass5.equalsIgnoreCase("ProgrammingCSharp")) {
			classes[4] = Classes.ProgrammingCSharp;
		}
		else if(inputclass5.equalsIgnoreCase("PE")) {
			classes[4] = Classes.PE;
		}
		else if(inputclass5.equalsIgnoreCase("ProStart")) {
			classes[4] = Classes.ProStart;
		}
		else if(inputclass5.equalsIgnoreCase("Cosmetology")) {
			classes[4] = Classes.Cosmetology;
		}
		else if(inputclass5.equalsIgnoreCase("Health")) {
			classes[4] = Classes.Health;
		}
		else if(inputclass5.equalsIgnoreCase("Choir")) {
			classes[4] = Classes.Choir;
		}
		else if(inputclass5.equalsIgnoreCase("Internship")) {
			classes[4] = Classes.Internship;
		}
		else if(inputclass5.equalsIgnoreCase("Accounting")) {
			classes[4] = Classes.Accounting;
		}
		else if(inputclass5.equalsIgnoreCase("Business")) {
			classes[4] = Classes.Business;
		}
		else if(inputclass5.equalsIgnoreCase("AutoShop")) {
			classes[4] = Classes.AutoShop;
		}
		else if(inputclass5.equalsIgnoreCase("Woodworking")) {
			classes[4] = Classes.Woodworking;
		}
		else if(inputclass5.equalsIgnoreCase("Welding")) {
			classes[4] = Classes.Welding;
		}
		else if(inputclass5.equalsIgnoreCase("APlus")) {
			classes[4] = Classes.APlus;
		}
		else {
			System.out.println("Class not listed, assigning Programming.");
			classes[4] = Classes.ProgrammingJava;
		}
		for(int i = 0; i<19; i++) {
			System.out.println(classList[i]);
		}
		System.out.println("What class would you like for period 1?");
		String inputclass6 = input.nextLine();
		if(inputclass6.equalsIgnoreCase("math")) {
			classes[5] = Classes.Math;
		}
		else if(inputclass6.equalsIgnoreCase("English")) {
			classes[5] = Classes.English;
		}
		else if(inputclass6.equalsIgnoreCase("History")) {
			classes[5] = Classes.History;
		}
		else if(inputclass6.equalsIgnoreCase("Science")) {
			classes[5] = Classes.Science;
		}
		else if(inputclass6.equalsIgnoreCase("ProgrammingJava")) {
			classes[5] = Classes.ProgrammingJava;
		}
		else if(inputclass6.equalsIgnoreCase("ProgrammingPython")) {
			classes[5] = Classes.ProgrammingPython;
		}
		else if(inputclass6.equalsIgnoreCase("ProgrammingCSharp")) {
			classes[5] = Classes.ProgrammingCSharp;
		}
		else if(inputclass6.equalsIgnoreCase("PE")) {
			classes[5] = Classes.PE;
		}
		else if(inputclass6.equalsIgnoreCase("ProStart")) {
			classes[5] = Classes.ProStart;
		}
		else if(inputclass6.equalsIgnoreCase("Cosmetology")) {
			classes[5] = Classes.Cosmetology;
		}
		else if(inputclass6.equalsIgnoreCase("Health")) {
			classes[5] = Classes.Health;
		}
		else if(inputclass6.equalsIgnoreCase("Choir")) {
			classes[5] = Classes.Choir;
		}
		else if(inputclass6.equalsIgnoreCase("Internship")) {
			classes[5] = Classes.Internship;
		}
		else if(inputclass6.equalsIgnoreCase("Accounting")) {
			classes[5] = Classes.Accounting;
		}
		else if(inputclass6.equalsIgnoreCase("Business")) {
			classes[5] = Classes.Business;
		}
		else if(inputclass6.equalsIgnoreCase("AutoShop")) {
			classes[5] = Classes.AutoShop;
		}
		else if(inputclass6.equalsIgnoreCase("Woodworking")) {
			classes[5] = Classes.Woodworking;
		}
		else if(inputclass6.equalsIgnoreCase("Welding")) {
			classes[5] = Classes.Welding;
		}
		else if(inputclass6.equalsIgnoreCase("APlus")) {
			classes[5] = Classes.APlus;
		}
		else {
			System.out.println("Class not listed, assigning Programming.");
			classes[5] = Classes.ProgrammingJava;
		}
		for(int i = 0; i<19; i++) {
			System.out.println(classList[i]);
		}
		System.out.println("What class would you like for period 1?");
		String inputclass7 = input.nextLine();
		if(inputclass7.equalsIgnoreCase("math")) {
			classes[6] = Classes.Math;
		}
		else if(inputclass7.equalsIgnoreCase("English")) {
			classes[6] = Classes.English;
		}
		else if(inputclass7.equalsIgnoreCase("History")) {
			classes[6] = Classes.History;
		}
		else if(inputclass7.equalsIgnoreCase("Science")) {
			classes[6] = Classes.Science;
		}
		else if(inputclass7.equalsIgnoreCase("ProgrammingJava")) {
			classes[6] = Classes.ProgrammingJava;
		}
		else if(inputclass7.equalsIgnoreCase("ProgrammingPython")) {
			classes[6] = Classes.ProgrammingPython;
		}
		else if(inputclass7.equalsIgnoreCase("ProgrammingCSharp")) {
			classes[6] = Classes.ProgrammingCSharp;
		}
		else if(inputclass7.equalsIgnoreCase("PE")) {
			classes[6] = Classes.PE;
		}
		else if(inputclass7.equalsIgnoreCase("ProStart")) {
			classes[6] = Classes.ProStart;
		}
		else if(inputclass7.equalsIgnoreCase("Cosmetology")) {
			classes[6] = Classes.Cosmetology;
		}
		else if(inputclass7.equalsIgnoreCase("Health")) {
			classes[6] = Classes.Health;
		}
		else if(inputclass7.equalsIgnoreCase("Choir")) {
			classes[6] = Classes.Choir;
		}
		else if(inputclass7.equalsIgnoreCase("Internship")) {
			classes[6] = Classes.Internship;
		}
		else if(inputclass7.equalsIgnoreCase("Accounting")) {
			classes[6] = Classes.Accounting;
		}
		else if(inputclass7.equalsIgnoreCase("Business")) {
			classes[6] = Classes.Business;
		}
		else if(inputclass7.equalsIgnoreCase("AutoShop")) {
			classes[6] = Classes.AutoShop;
		}
		else if(inputclass7.equalsIgnoreCase("Woodworking")) {
			classes[6] = Classes.Woodworking;
		}
		else if(inputclass7.equalsIgnoreCase("Welding")) {
			classes[6] = Classes.Welding;
		}
		else if(inputclass7.equalsIgnoreCase("APlus")) {
			classes[6] = Classes.APlus;
		}
		else {
			System.out.println("Class not listed, assigning Programming.");
			classes[6] = Classes.ProgrammingJava;
		}
		for(int i = 0; i<19; i++) {
			System.out.println(classList[i]);
		}
		System.out.println("What class would you like for period 1?");
		String inputclass8 = input.nextLine();
		if(inputclass8.equalsIgnoreCase("math")) {
			classes[7] = Classes.Math;
		}
		else if(inputclass8.equalsIgnoreCase("English")) {
			classes[7] = Classes.English;
		}
		else if(inputclass8.equalsIgnoreCase("History")) {
			classes[7] = Classes.History;
		}
		else if(inputclass8.equalsIgnoreCase("Science")) {
			classes[7] = Classes.Science;
		}
		else if(inputclass8.equalsIgnoreCase("ProgrammingJava")) {
			classes[7] = Classes.ProgrammingJava;
		}
		else if(inputclass8.equalsIgnoreCase("ProgrammingPython")) {
			classes[7] = Classes.ProgrammingPython;
		}
		else if(inputclass8.equalsIgnoreCase("ProgrammingCSharp")) {
			classes[7] = Classes.ProgrammingCSharp;
		}
		else if(inputclass8.equalsIgnoreCase("PE")) {
			classes[7] = Classes.PE;
		}
		else if(inputclass8.equalsIgnoreCase("ProStart")) {
			classes[7] = Classes.ProStart;
		}
		else if(inputclass8.equalsIgnoreCase("Cosmetology")) {
			classes[7] = Classes.Cosmetology;
		}
		else if(inputclass8.equalsIgnoreCase("Health")) {
			classes[7] = Classes.Health;
		}
		else if(inputclass8.equalsIgnoreCase("Choir")) {
			classes[7] = Classes.Choir;
		}
		else if(inputclass8.equalsIgnoreCase("Internship")) {
			classes[7] = Classes.Internship;
		}
		else if(inputclass8.equalsIgnoreCase("Accounting")) {
			classes[7] = Classes.Accounting;
		}
		else if(inputclass8.equalsIgnoreCase("Business")) {
			classes[7] = Classes.Business;
		}
		else if(inputclass8.equalsIgnoreCase("AutoShop")) {
			classes[7] = Classes.AutoShop;
		}
		else if(inputclass8.equalsIgnoreCase("Woodworking")) {
			classes[7] = Classes.Woodworking;
		}
		else if(inputclass8.equalsIgnoreCase("Welding")) {
			classes[7] = Classes.Welding;
		}
		else if(inputclass8.equalsIgnoreCase("APlus")) {
			classes[7] = Classes.APlus;
		}
		else {
			System.out.println("Class not listed, assigning Programming.");
			classes[0] = Classes.ProgrammingJava;
		}
		for(int i = 0; i<19; i++) {
			System.out.println(classList[i]);
		}
		System.out.println("What class would you like for period 1?");
		String inputclass9 = input.nextLine();
		if(inputclass9.equalsIgnoreCase("math")) {
			classes[8] = Classes.Math;
		}
		else if(inputclass9.equalsIgnoreCase("English")) {
			classes[8] = Classes.English;
		}
		else if(inputclass9.equalsIgnoreCase("History")) {
			classes[8] = Classes.History;
		}
		else if(inputclass9.equalsIgnoreCase("Science")) {
			classes[8] = Classes.Science;
		}
		else if(inputclass9.equalsIgnoreCase("ProgrammingJava")) {
			classes[8] = Classes.ProgrammingJava;
		}
		else if(inputclass9.equalsIgnoreCase("ProgrammingPython")) {
			classes[8] = Classes.ProgrammingPython;
		}
		else if(inputclass9.equalsIgnoreCase("ProgrammingCSharp")) {
			classes[8] = Classes.ProgrammingCSharp;
		}
		else if(inputclass9.equalsIgnoreCase("PE")) {
			classes[8] = Classes.PE;
		}
		else if(inputclass9.equalsIgnoreCase("ProStart")) {
			classes[8] = Classes.ProStart;
		}
		else if(inputclass9.equalsIgnoreCase("Cosmetology")) {
			classes[8] = Classes.Cosmetology;
		}
		else if(inputclass9.equalsIgnoreCase("Health")) {
			classes[8] = Classes.Health;
		}
		else if(inputclass9.equalsIgnoreCase("Choir")) {
			classes[8] = Classes.Choir;
		}
		else if(inputclass9.equalsIgnoreCase("Internship")) {
			classes[8] = Classes.Internship;
		}
		else if(inputclass9.equalsIgnoreCase("Accounting")) {
			classes[8] = Classes.Accounting;
		}
		else if(inputclass9.equalsIgnoreCase("Business")) {
			classes[8] = Classes.Business;
		}
		else if(inputclass9.equalsIgnoreCase("AutoShop")) {
			classes[8] = Classes.AutoShop;
		}
		else if(inputclass9.equalsIgnoreCase("Woodworking")) {
			classes[8] = Classes.Woodworking;
		}
		else if(inputclass9.equalsIgnoreCase("Welding")) {
			classes[8] = Classes.Welding;
		}
		else if(inputclass9.equalsIgnoreCase("APlus")) {
			classes[8] = Classes.APlus;
		}
		else {
			System.out.println("Class not listed, assigning Programming.");
			classes[8] = Classes.ProgrammingJava;
		}
		for(int i = 0; i<19; i++) {
			System.out.println(classList[i]);
		}
		System.out.println("What class would you like for period 1?");
		String inputclass10 = input.nextLine();
		if(inputclass10.equalsIgnoreCase("math")) {
			classes[9] = Classes.Math;
		}
		else if(inputclass10.equalsIgnoreCase("English")) {
			classes[9] = Classes.English;
		}
		else if(inputclass10.equalsIgnoreCase("History")) {
			classes[9] = Classes.History;
		}
		else if(inputclass10.equalsIgnoreCase("Science")) {
			classes[9] = Classes.Science;
		}
		else if(inputclass10.equalsIgnoreCase("ProgrammingJava")) {
			classes[9] = Classes.ProgrammingJava;
		}
		else if(inputclass10.equalsIgnoreCase("ProgrammingPython")) {
			classes[9] = Classes.ProgrammingPython;
		}
		else if(inputclass10.equalsIgnoreCase("ProgrammingCSharp")) {
			classes[9] = Classes.ProgrammingCSharp;
		}
		else if(inputclass10.equalsIgnoreCase("PE")) {
			classes[9] = Classes.PE;
		}
		else if(inputclass10.equalsIgnoreCase("ProStart")) {
			classes[9] = Classes.ProStart;
		}
		else if(inputclass10.equalsIgnoreCase("Cosmetology")) {
			classes[9] = Classes.Cosmetology;
		}
		else if(inputclass10.equalsIgnoreCase("Health")) {
			classes[9] = Classes.Health;
		}
		else if(inputclass10.equalsIgnoreCase("Choir")) {
			classes[9] = Classes.Choir;
		}
		else if(inputclass10.equalsIgnoreCase("Internship")) {
			classes[9] = Classes.Internship;
		}
		else if(inputclass10.equalsIgnoreCase("Accounting")) {
			classes[9] = Classes.Accounting;
		}
		else if(inputclass10.equalsIgnoreCase("Business")) {
			classes[9] = Classes.Business;
		}
		else if(inputclass10.equalsIgnoreCase("AutoShop")) {
			classes[9] = Classes.AutoShop;
		}
		else if(inputclass10.equalsIgnoreCase("Woodworking")) {
			classes[9] = Classes.Woodworking;
		}
		else if(inputclass10.equalsIgnoreCase("Welding")) {
			classes[9] = Classes.Welding;
		}
		else if(inputclass10.equalsIgnoreCase("APlus")) {
			classes[9] = Classes.APlus;
		}
		else {
			System.out.println("Class not listed, assigning Programming.");
			classes[9] = Classes.ProgrammingJava;
		}
	}

	public Classes[] getClasses() {
		return classes;
	}

	public Student() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name ");
		setName(input.nextLine());
		System.out.println("Enter your birthday ");
		setBirthday(input.nextLine());
		System.out.println("Enter your GPA ");
		setGpa(input.nextDouble());
		input.nextLine();
		System.out.println("Enter your health conditions ");
		setHealthCond(input.nextLine());
		System.out.println("Enter your address ");
		setAddress(input.nextLine());
		System.out.println("Enter your grade ");
		setGrade(input.nextInt());
		input.nextLine();
		System.out.println("Enter your email ");
		setEmail(input.nextLine());
		System.out.println("Enter your phone number ");
		setPhone(input.nextLine());
		setSsid(genId());
		setLunchNum(genLunchNum(this.ssid,this.grade));
		pickClasses();
	}

}
