package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteBackDataToPropertyFile {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		// convert physical file to java object
		FileInputStream fis = new FileInputStream("./src/test/resources/demo.properties");

		// create an empty prioperties object
		Properties prop = new Properties();

		// load the properties object
		prop.load(fis);

		prop.put("Name", "Sai charan");
		prop.put("age", "21");
		prop.put("key", "123");

		// convert object to physical file
		FileOutputStream fos = new FileOutputStream("./src/test/resources/demo.properties");

		// SAVE the file
		prop.store(fos, "student details updated");

	}
}