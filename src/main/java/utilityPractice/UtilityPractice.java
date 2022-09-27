package utilityPractice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.WebDriver;

import newGenericUtility.ExcelUtility;

public class UtilityPractice
{

    
     public static void main(String[] args) throws EncryptedDocumentException, IOException
     {
    	
    	 ExcelUtility  eu =new ExcelUtility();
    	 String data = eu.FetxhDataFromExcel("./src/test/resources/SI.xlsx", "sheet3", 0, 0);
    	System.out.println(data);
    	
    	//eu.sendDataToexcel("./src/test/resources/SI.xlsx", "sheet3", 1, 1,"kiran");
    	eu.sendDataToexcel1("./src/test/resources/SI.xlsx", "sheet3", 1, 1,"kiran123");
    
}}
