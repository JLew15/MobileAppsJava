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
