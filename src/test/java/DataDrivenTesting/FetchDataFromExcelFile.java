package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class FetchDataFromExcelFile {
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
		
		//fetch the cell
		Cell c_name = r.getCell(0);
		Cell c_id = r.getCell(1);
		
		//fetch the data
		String name = c_name.getStringCellValue();
		double id = c_id.getNumericCellValue();
		
		System.out.println(name + id);
		
		//close the excel
		wb.close();
		
	}
	
	

}