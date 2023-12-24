package Phase2.PracticeProject3.ElearningApp_TDD_TestNG;

	import java.util.HashMap;
	import java.util.Map;
	
	
	public class ElearningApplication {
		
		
		private Map<String, Integer> getcourse() {
			
			Map<String, Integer> courseMap = new HashMap<>();
			
			//Entering the course and duration
	        courseMap.put("Java", 16);      
	        courseMap.put("TestNG", 15);
	        courseMap.put("Junit", 7);
	        courseMap.put("selenium", 9);
			return courseMap;
	}
	
		public int getcourse(String Topic) {
			Map<String, Integer> courseMap;
			int count = 0;
			
			if (Topic.isEmpty()) {
				throw new NullPointerException("Topic Name shoud not be empty");
			}
			
			courseMap = getcourse();
			if (!courseMap.containsKey(Topic)) {
				throw new NullPointerException("Topic Name does not exist");
				
			} else {
				count = courseMap.get(Topic);
			}
			return count;
	
		}
	

}
