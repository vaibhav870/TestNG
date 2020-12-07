package ui;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	@Test(dataProvider="create",dataProviderClass=DataSets.class)
	public void DataTest(String user,String pass) {
		System.out.println(user+"===>"+pass);
		
	}
	@Test(dataProvider="dataset",dataProviderClass=DataSets.class)
	public void DataTest2(String user,String pass) {
		System.out.println(user+"===>"+pass);
		
	}
	@Test(dataProvider="create",dataProviderClass=DataSets.class)
	public void DataTest3(String user,String pass,String test) {
		System.out.println(user+"===>"+pass+"==?"+test);
		
	}
	
	
}
