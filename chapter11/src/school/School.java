package school;

public class School {

	public School() {
		Student jaidenL = new Student();
		System.out.println(jaidenL.getName());
		System.out.println(jaidenL.getSsid());
		System.out.println(jaidenL.getBirthday());
		System.out.println(jaidenL.getGpa());
		System.out.println(jaidenL.getHealthCond());
		System.out.println(jaidenL.getAddress());
		System.out.println(jaidenL.getGrade());
		System.out.println(jaidenL.getLunchNum());
		System.out.println(jaidenL.getEmail());
		System.out.println(jaidenL.getPhone());
	}

	public static void main(String[] args) {
		new School();

	}

}
