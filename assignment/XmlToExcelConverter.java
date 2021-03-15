package assignment;

import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

interface XmlToExcel {
	public void WriteToExcel(String xmlfile) throws Exception;
}

public class XmlToExcelConverter implements XmlToExcel  
{   
	public void WriteToExcel(String xmlfile) throws Exception
	{
		HSSFWorkbook workbook = new HSSFWorkbook();  
		HSSFSheet sheet = workbook.createSheet("Bill");   
		HSSFCellStyle style = workbook.createCellStyle();
		HSSFFont font = workbook.createFont();
		font.setBold(true);
		style.setFont(font);
		
		DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		dbf.setIgnoringElementContentWhitespace(true);
		dbf.setValidating(true);
		
		
		DocumentBuilder db=dbf.newDocumentBuilder();
		Document doc=db.parse(xmlfile);
		
		Element rootElement=doc.getDocumentElement();
		int row_num=0;
		HSSFRow row,col_heading;
		HSSFCell cell;
		
		sheet.addMergedRegion(new CellRangeAddress(0,0,0,2));
		sheet.addMergedRegion(new CellRangeAddress(0,0,3,4));
		sheet.addMergedRegion(new CellRangeAddress(0,0,5,6));
		HSSFRow details = sheet.createRow(row_num++);  
		details.createCell(0).setCellValue("Customer Name : Sierra");  
		details.createCell(3).setCellValue("Bill No : 1002");  
		details.createCell(5).setCellValue("Bill Date : 10/03/2021");
		
		col_heading=sheet.createRow(row_num++);
		
		for(int i=0;i<rootElement.getChildNodes().getLength();i++) {
			row=sheet.createRow(row_num++);
			for(int j=0;j<rootElement.getChildNodes().item(i).getChildNodes().getLength();j++) {
				if(i==0)
				{
					cell=col_heading.createCell(j);
					cell.setCellValue(rootElement.getChildNodes().item(i).getChildNodes().item(j).getNodeName());
					cell.setCellStyle(style);
				}
				row.createCell(j).setCellValue(rootElement.getChildNodes().item(i).getChildNodes().item(j).getFirstChild().getNodeValue());
			}
		}
		FileOutputStream fos = new FileOutputStream("Bill_Details.xlsx");  
		workbook.write(fos);   
		fos.close();  
		workbook.close(); 	
		
		System.out.println("Excel created...");
	}
	
}
	