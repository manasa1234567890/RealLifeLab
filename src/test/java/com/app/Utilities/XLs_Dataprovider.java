package com.app.Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class XLs_Dataprovider {
	
	@DataProvider(name = "excelData")
    public static Object[][] readExcelData() throws IOException {
        String filePath = "C:\\realifelab";
        String sheetName = "Sheet1"; // Change to your sheet name

        FileInputStream fileInputStream = new FileInputStream(new String (filePath));
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        @SuppressWarnings("rawtypes")
		XSSFSheet sheet = workbook.getSheet(sheetName);



        Object[][] data = new Object[((XSSFSheet) sheet).getLastRowNum()][sheet.getRow(0).getLastCellNum()]; // Assuming the first row is header

        for(int i=0;i<sheet.getLastRowNum();i++)
		{
			for(int j=0;j<sheet.getRow(0).getLastCellNum();j++)
			{
				data[i][j] = sheet.getRow(i+1).getCell(j).toString();
			}
		}

        workbook.close();
        fileInputStream.close();

        return data;
    }

}






