package ui;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	@Test(dataProvider="dataset")
	public void DataTest(String user,String pass) {
		System.out.println(user+"===>"+pass);
		
	}
	
	@DataProvider
	public Object[][] dataset() {
		Object [] [] data= new Object[4][2];
		
		data[0][0]="user1";
		data[0][1]="pass1";
		
		data[1][0]="user2";
		data[1][1]="pass2";
		
		data[2][0]="user3";
		data[2][1]="pass3";
	
		data[3][0]="user4";
		data[3][1]="pass4";
		
		return data;
	}
}
