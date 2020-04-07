package masters;

import java.util.HashMap;

public class Chemistry {
	
	static  HashMap <String,String> nameCgpaMap =new HashMap<String, String>();
	
	

	public  Chemistry(String masterCourse2, String name2, String cgpa2) {
		
		nameCgpaMap.put(name2, cgpa2);
	}

	public Chemistry() {
		// TODO Auto-generated constructor stub
	}

	

	public int chemStudCount() {
		
		int count=0;
		
		count=nameCgpaMap.size();
		System.out.println(nameCgpaMap.size());
		
		return count;
	}

}
