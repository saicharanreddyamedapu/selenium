package DataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataprovidersImplimentation {
	
	@DataProvider
	public Object[][] data() {
		Object[][] obj=new Object[2][2];
		
		obj[0][0]="un_sel";
		obj[0][1]="psd_123";
		
		obj[1][0]="usn2-vis";
		obj[1][1]="pdd_456";
		
//		obj[2][0]="us3_789";
//		obj[2][1]="pwd_111";
		
		return obj;
		
	}
		
		@Test(dataProvider = "data")
		public void print(String un, String pwd) {
			
			System.out.println(un);
			System.out.println(pwd);
//			System.out.println(nam);
			System.out.println("executed");
			
		}
		
		


}