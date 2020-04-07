package Runner;

import masters.Chemistry;

public class RunnerMain {
	
	

	public static void main(String[] args) {
		
		String masterCourse1="Physics";
		
		String name1="Dillip";
		
		String cgpa1="7.9";
		
		
		String masterCourse2="Chemistry";
		
		String name2="Rajesh";
		
		String cgpa2="7.8";
		
		Chemistry chemStudent1 = new Chemistry( masterCourse1,name1,cgpa1  );
		
		
		
		Chemistry chemStudent2 = new Chemistry( masterCourse2,name2,cgpa2  );
		Chemistry chem = new Chemistry();
		
		System.out.println("There were "+chem.chemStudCount()+" regitrations today");
		// TODO Auto-generated method stub

	}
	
	

}
