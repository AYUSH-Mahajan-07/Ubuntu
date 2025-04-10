class SMS {

	static int[] count = new int[40]; // total count of students

	public static void main(String[] args) {
		SMS obj = new SMS(args[0]); // making an object and passing values
	}

	SMS(String inp) {
		String[] students = inp.split("\\|");
		int id = 0; // To store reg
		String regNumber = "";
		for (String i : students) { // for each student
			String[] studentData = i.split(",");
			String Name = studentData[0].replace(" ", " ");
			id = regNo(studentData[1], studentData[2]);
			regNumber = createRegNo(id);
			String email = emailGenerator(regNumber);
			// String phone = studentData.length > 3 ? studentData[3] : "N/A";
			System.out.printf("%-20s :  %-25s %-25s%n", Name, email, regNumber);
			// System.out.printf("%-22s : %-22s %-12s %-12s%n", name, email, regNumber,
			// phone);
		}
	}

	String emailGenerator(String rollNumber) {
		return rollNumber.toLowerCase() + "@sggs.ac.in";
	}

	String createRegNo(int Rnumber) {
		int d = 0;
		if (Rnumber > 9 && Rnumber < 20) {
			d = 5;
		}
		String year = (Rnumber >= 10) ? "2025" : "2024";
		String rollno = year + dept(Rnumber) + d;

		if (++count[Rnumber] < 10) {
			rollno += "0" + count[Rnumber];
		} else if (count[Rnumber] < 100) {
			rollno += "0" + count[Rnumber];
		} else {
			rollno += count[Rnumber];
		}
		return rollno;
	}

	String dept(int Rnumber) {
		String[] set = { "BME", "BCE", "BCS", "BEC", "BIT", "BIN", "BPR", "BCH", "BTT", "BEL" };
		int a = Rnumber % 10;
		return set[a];
	}

	int regNo(String Branch, String Mode) { // mode - DSY or Regular
		int branchvalue = -1;
		String Branches = Branch.toLowerCase();

		if (Branches.contains("mech"))
			branchvalue = 0;
		else if (Branches.contains("civil"))
			branchvalue = 1;
		else if (Branches.contains("cse"))
			branchvalue = 2;
		else if (Branches.contains("extc"))
			branchvalue = 3;
		else if (Branches.contains("it"))
			branchvalue = 4;
		else if (Branches.contains("instrument"))
			branchvalue = 5;
		else if (Branches.contains("production"))
			branchvalue = 6;
		else if (Branches.contains("chemical"))
			branchvalue = 7;
		else if (Branches.contains("textile"))
			branchvalue = 8;
		else if (Branches.contains("electrical"))
			branchvalue = 9;
		else
			return -1;

		return Mode.equalsIgnoreCase("DSY") ? branchvalue + 10 : branchvalue;
	}

}

/*
 * "Ayush Mahajan,IT,Regular,8830186696|Shri Mahajan,IT,Regular,8667933358|XYX XYZ,IT,Regular,9988556644|Parikshit tamhane,EXTC,DSY,1234567890"
 */