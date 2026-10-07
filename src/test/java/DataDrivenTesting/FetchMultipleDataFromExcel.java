package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class FetchMultipleDataFromExcel {
	
		@Test
		public void FetchDataFromExcel() throws EncryptedDocumentException, IOException {
			
			//convert the physical file to java obj
			FileInputStream fis=new FileInputStream("C:\\EXCEL.xlsx");
			
			//fetch or create excel or workbook
			Workbook wb = WorkbookFactory.create(fis);
			
			//fetch the sheet
			Sheet sh = wb.getSheet("data");
			
			//fetch all the row
			for(int i =0;i<=sh.getLastRowNum();i++) {
				for(int j=0;j<sh.getRow(i).getLastCellNum();j++) {
					
					String data = sh.getRow(i).getCell(j).toString();
					System.out.print(data +" ");
				}
				System.out.println("");

		}
			//close the excel
			wb.close();

	}
	}