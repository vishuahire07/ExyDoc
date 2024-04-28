package com.ExyDoc.UtilityClasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel 
{
	public FileInputStream fileip;
	public FileOutputStream fileop;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	public CellStyle style;
	 
  String path = "./src/test/resources/TestData/TestData.xlsx";	
	
  public int getRowCount(String SheetName) throws IOException
  {
  	fileip = new FileInputStream(path);
  	workbook = new XSSFWorkbook(fileip);
  	sheet = workbook.getSheet(SheetName);
  	int rowcount = sheet.getLastRowNum();
  	workbook.close();
  	fileip.close(); 	
	return rowcount;
 
  }
  
  public int getCellCount(String SheetName, int rownum) throws IOException  
  {
	fileip = new FileInputStream(path);
	workbook = new XSSFWorkbook(fileip);
	sheet = workbook.getSheet(SheetName);
	row = sheet.getRow(rownum);
	int cellcount = row.getLastCellNum();
	workbook.close();
	fileip.close();
	return cellcount;	  
  }
  
  public String getCellDate(String SheetName, int rownum, int colnum ) throws IOException
  {
	fileip = new FileInputStream(path);  
	workbook = new XSSFWorkbook(fileip);
	sheet = workbook.getSheet(SheetName);
	row = sheet.getRow(rownum);
	cell = row.getCell(colnum);
	
	DataFormatter formater = new DataFormatter();
	String data;
	try
	{
	data = formater.formatCellValue(cell);
	}
	catch(Exception e)
	{
	  data = "";	
	}
    workbook.close();
    fileip.close();
    return data;	
  }
  
  public void setCellData(String SheetName, int rownum, int colnum, String data) throws IOException
  {
	 fileip = new FileInputStream(path);  
	 workbook = new XSSFWorkbook(fileip);
	 sheet = workbook.getSheet(SheetName);
	 row = sheet.getRow(rownum);
	 cell = row.createCell(colnum);
	 cell.setCellValue(data);
	 
	 fileop = new FileOutputStream(path);
	 workbook.write(fileop);
	 workbook.close();
	 fileip.close();
	 fileop.close();
	 	  
  }
  
  public void fillGreenColor(String SheetName, int rownum, int colnum) throws IOException
  {
	fileip = new FileInputStream(path); 
	workbook = new XSSFWorkbook(fileip);
	sheet = workbook.getSheet(SheetName);
	row = sheet.getRow(rownum);
	cell = row.getCell(colnum);
	
	style = workbook.createCellStyle();
	style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
	style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	cell.setCellStyle(style);
	workbook.write(fileop);
	workbook.close();
    fileip.close();
    fileop.close();	  
  }
  
  public void fillRedColor(String SheetName, int rownum, int colnum) throws IOException
{
    fileip = new FileInputStream(path);
    workbook = new XSSFWorkbook(fileip);
    sheet = workbook.getSheet(SheetName);
    row = sheet.getRow(rownum);
    cell = row.getCell(colnum);
    
    style = workbook.createCellStyle();
    style.setFillForegroundColor(IndexedColors.RED.getIndex());
    style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
    cell.setCellStyle(style);
    workbook.write(fileop);
    workbook.close();
    fileip.close();
    fileop.close();
	  
}
	
	
}
