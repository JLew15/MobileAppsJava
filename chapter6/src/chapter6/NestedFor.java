package chapter6;

public class NestedFor {

	public NestedFor() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		for (int year = 0; year < 2020; year++) {
			System.out.println("Year " + year);
			for (int monthOfYear = 0; monthOfYear < 12; monthOfYear++) {
				System.out.println(" Month" + monthOfYear);
				for (int weekOfYear = 0; weekOfYear < 4; weekOfYear++) {
					System.out.println(" Week" + weekOfYear);
					for (int dayOfWeek = 0; dayOfWeek < 7; dayOfWeek++) {
						System.out.println(" Day" + dayOfWeek  + ": ");
						for (int hour = 0; hour < 24; hour++) {
							System.out.println(" H" + hour);
							for (int min = 0; min < 60; min++) {
								System.out.println(" M" + min);
								for(int sec = 0; sec < 60; sec++) {
									System.out.print(" S" + sec);
								}
							}
						}
					}
				}
			}
			System.out.println ("");
		}
		System.out.println("All done");

	}

}
