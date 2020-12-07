package ui;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataSets {
	
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
	@DataProvider(name="create")
	public Object[][] dataset2(Method m) {
		Object [][] testdata =null;
		if(m.getName().equals("DataTest")) {
			testdata=new Object[][] {
				{"standard_user","secret_sauce"},
				{"locked_out_user","secret_sauce"},
				{"problem_user","secret_sauce"},
				{"performance_glitch_user","secret_sauce"}
			};
		}else if (m.getName().equals("DataTest3")) {
			testdata=new Object[][] {
				{"standard_user","secret_sauce","sauceDemo"},
				{"locked_out_user","secret_sauce","sauceDemo"},
				{"problem_user","secret_sauce","sauceDemo"},
				{"performance_glitch_user","secret_sauce","sauceDemo"}
			};
			
		}
		return testdata;
	}
}
