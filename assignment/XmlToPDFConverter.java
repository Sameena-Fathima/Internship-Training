package assignment;

import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import com.itextpdf.text.Element;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

interface XmlToPDF {
	public void WriteToPDF(String xmlfile) throws Exception;
}



public class XmlToPDFConverter implements XmlToPDF{
	public void WriteToPDF(String xmlfile) throws Exception
	   {
	      Document document = new Document();
	      PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("Bill.pdf"));
	      document.open();
	      
	      PdfPTable table = new PdfPTable(5); // 5 columns.
	      table.setWidthPercentage(100); //Width 100%
	      table.setSpacingBefore(10f); //Space before table
	      table.setSpacingAfter(10f); //Space after table
	      
	      float[] columnWidths = {1f, 1f, 1f, 1f, 1f};
	      table.setWidths(columnWidths);
	      
		  Font boldFont = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD);
		  
		  Paragraph detail = new Paragraph("Customer Name: Sierra\nBill No : 1002\nBill Date : 10/03/2021",boldFont);
	      detail.setAlignment(Paragraph.ALIGN_CENTER);
	      document.add(detail);
	      
	      this.insertCell(table,"S.NO");
	      this.insertCell(table,"ITEM NAME");
	      this.insertCell(table,"PRICE");
	      this.insertCell(table,"QUANTITY");
	      this.insertCell(table,"TOTAL");
		  
	      DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
		  dbf.setIgnoringElementContentWhitespace(true);
	      dbf.setValidating(true);
	      
	      DocumentBuilder db=dbf.newDocumentBuilder();
	      org.w3c.dom.Document doc=db.parse(xmlfile);
		  
		  org.w3c.dom.Element rootElement=doc.getDocumentElement();

		  for(int i=0;i<rootElement.getChildNodes().getLength();i++) {
			  for(int j=0;j<rootElement.getChildNodes().item(i).getChildNodes().getLength();j++) {
				  this.insertCell(table,rootElement.getChildNodes().item(i).getChildNodes().item(j).getFirstChild().getNodeValue()); 
				  
			  }
		  }
		  document.add(table);	    
		  document.close();
	      writer.close();
	      System.out.println("PDF created...");
	   }
	private void insertCell(PdfPTable table,String content){
		  PdfPCell cell = new PdfPCell(new Paragraph(content));
		  cell.setPaddingLeft(10);
	      cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	      cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		  table.addCell(cell);	
	}
}
