package newGenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	Workbook wb;
	 //To FetchDataFrom Excel
	public Workbook intialiseExcel(String url)
	{
		FileInputStream fis=null;
		try {
			fis = new FileInputStream(url);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return wb;
	}
	
	public String FetxhDataFromExcel(String url,String shet, int row, int Col)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(url);
		Workbook wb = WorkbookFactory.create(fis);
		String fetchdata = wb.getSheet(shet).getRow(row).getCell(Col).getStringCellValue();
		return fetchdata;

	}
	
	//Send data to excel
	
	public void sendDataToexcel(String path,String shee,int row,int Col,String val) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet=wb.getSheet(shee);
		Cell cell = sheet.createRow(row).createCell(Col);
		cell.setCellValue(val);
		FileOutputStream fos= new FileOutputStream(path);
		wb.write(fos);
		
		
	}
	
	public void sendDataToexcel1(String path,String shee,int row,int Col,String val) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet=wb.getSheet(shee);
		Cell cell = sheet.getRow(row).createCell(Col);
		cell.setCellValue(val);
		FileOutputStream fos= new FileOutputStream(path);
		wb.write(fos);
		
		
	}
	
	
	
	
	
	
	
	
	


}