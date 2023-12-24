package Phase2.PracticeProject3.ElearningApp_TDD_TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;


public class EcommerceTest {
	
	
	ElearningApplication ELapp = new ElearningApplication();
	
	
	@Test
	
	public void findcourse1() {
		
		String TopicNAME1 = "Java";
		int Expected_duration = 16;
		
		int count = ELapp.getcourse(TopicNAME1);
		System.out.println(TopicNAME1 + " " +  count);
		Assert.assertEquals(count, Expected_duration);
	}
	
	
	@Test
		public void findcourse2() {
		
		String TopicNAME2 = "TestNG";
		int Expected_duration = 15;
		
		int count = ELapp.getcourse(TopicNAME2);
		System.out.println(TopicNAME2+ " " +  count);
		Assert.assertEquals(count, Expected_duration);
	}
	
	@Test
		public void findcourse3() {
			
			String TopicNAME3 = "Junit";
			int Expected_duration = 7;
			
			int count = ELapp.getcourse(TopicNAME3);
			System.out.println(TopicNAME3+ " " +  count);
			Assert.assertEquals(count, Expected_duration);
		}
	
	@Test
	public void findcourse4() {
		
		String TopicNAME4 = "selenium";
		int Expected_duration = 9;
		
		int count = ELapp.getcourse(TopicNAME4);
		System.out.println(TopicNAME4 + " " +  count);
		Assert.assertEquals(count, Expected_duration);
	}
	
//	This test case Prints Topic Name does not exist, as it throws NullPointerException
	@Test
	public void findcourse5() {
		
		String TopicNAME5 = "cucumber";
		int Expected_duration = 9;
		
		int count = ELapp.getcourse(TopicNAME5);
		
		Assert.assertEquals(count, Expected_duration);
	}
	


		
	
	@Test
	public void EmptyCourse() {
		try {
			String Topic = "";
			int Expected_duration = 0;
			
			int count = ELapp.getcourse(Topic);
			}
		catch (NullPointerException e) {
			System.out.println("Topic name should not be empty");
		}
	}
}
