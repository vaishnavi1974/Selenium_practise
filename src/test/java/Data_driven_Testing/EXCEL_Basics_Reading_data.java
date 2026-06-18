package Data_driven_Testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EXCEL_Basics_Reading_data {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\2016_Movies.xlsx");
		XSSFWorkbook book1=new XSSFWorkbook(file);
		XSSFSheet sheet1 = book1.getSheetAt(0);
		int totalrow=sheet1.getLastRowNum();
		int totalcell=sheet1.getRow(1).getLastCellNum();
		System.out.println("Total no of rows: "+totalrow);
		System.out.println("Total no of ceels in a row: "+totalcell);
		
		for(int i=0;i<=totalrow;i++)
		{
			XSSFRow currentrow=sheet1.getRow(i);
			for(int j=0;j<totalcell;j++)
			{
				XSSFCell cell=currentrow.getCell(j);
				System.out.println(cell.toString());
				
			}
			//System.out.println();
		}
		book1.close();
		file.close();
	}

}
