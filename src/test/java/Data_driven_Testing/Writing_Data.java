package Data_driven_Testing;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writing_Data {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+".//testdata//write_file.xlsx");
		XSSFWorkbook book1 = new XSSFWorkbook();
		XSSFSheet sheet1= book1.createSheet("Data");
		XSSFRow row1=sheet1.createRow(0);
		row1.createCell(0).setCellValue("Welcome");
		row1.createCell(1).setCellValue(10);
		
		System.out.println("File created");
		
		book1.write(file);
		book1.close();
		file.close();
		

	}

}
