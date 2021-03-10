package day15.XmlToExcel;

import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
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
		HSSFRow row,first_row;
		HSSFCell cell;
		first_row=sheet.createRow(row_num++);

		for(int i=0;i<rootElement.getChildNodes().getLength();i++) {
			row=sheet.createRow(row_num++);
			for(int j=0;j<rootElement.getChildNodes().item(i).getChildNodes().getLength();j++) {
				if(i==0)
				{
					cell=first_row.createCell(j);
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
	