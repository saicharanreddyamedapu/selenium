package DataDrivenTesting;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class WriteBackDataToExcel {
	@Test
	public void FetchDataFromExcel() throws EncryptedDocumentException, IOException {
		
		//convert the physical file to java obj
		FileInputStream fis=new FileInputStream("./src/test/resources/xcel1.xlsx");
		
		//fetch or create excel or workbook
		Workbook wb = WorkbookFactory.create(fis);
		
		//fetch the sheet
		Sheet sh = wb.getSheet("NPC");
		
		//fetch the row
		Row r = sh.getRow(2);
		
		//create the cell 
		Cell nc = r.createCell(3);
		
		//write the data
		nc.setCellValue("Selenium");
		
		//convert obj to physical file
		FileOutputStream fos = new FileOutputStream("./src/test/resources/xcel1.xlsx");
		wb.write(fos);
		
		//close the excel
		wb.close();
		
}
}
//	@Test
//	public void writingDataUsingForLoopInExcelFile() throws EncryptedDocumentException, IOException {
//	
//		//convert the physical file to java obj
//				FileInputStream fis=new FileInputStream("./src/test/resources/xcel2.xlsx");
//				
//				//fetch or create excel or workbook
//				Workbook wb = WorkbookFactory.create(fis);
//				
//				//fetch the sheet
//				Sheet sh = wb.getSheet("NPC2");
//				
//				for(int i = 1; i < 4; i++ ) {
//					
//					Row rc = sh.createRow(i);
//
//					for(int j = 1; j < 3  ; j++ ) {
//						
//
//
//					//fetch the row
////					Row r = sh.getRow(i);
//					
//					//create the cell 
//					Cell nc = rc.createCell(j);
//					
//					//write the data
//					nc.setCellValue("Selenium  "+ j);
//					
//				}
//				}
//				
//				
//				//convert obj to physical file
//				FileOutputStream fos = new FileOutputStream("./src/test/resources/xcel2.xlsx");
//				wb.write(fos);
//				
//				//close the excel
//				wb.close();
//				
//	}
//}