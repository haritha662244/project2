package in.ashokit.service;

import java.awt.Font;
import java.io.IOException;

import javax.swing.text.Document;

import org.hibernate.graph.SubGraph;

import org.springframework.stereotype.Service;

import com.lowagie.text.pdf.PdfPTable;

import jakarta.servlet.http.HttpServletResponse;

@Service
public class PDFGeneratorService {
	public  PdfPTable export(HttpServletResponse response) throws IOException{
		PdfPTable  table = null;
		
		
	
		Document doucement = new Document(PageSize .A4);
		PdfWriter.getInstance(doucement,response.getOutputStream());
		
		
		doucement.open();
		Font  fontTitle= FontFactory.getFont(FontFactory.HELVETICA_BOLD);
		fontTitle.setSize(18);
		
		
		paragraph paragraph= new paragraph("Product Infromation",fontTitle);
		paragraph.setAlignment(paragraph.ALIGN_CENTER);		
		doucement.add(paragraph);
		
		
		
		Font fontParagraph =  FontFactory.getFont(FontFactory.HELVETICA);
		fontParagraph.setSize(12);
		
		paragraph paragraph2= new paragraph("Below is some information about product.",fontParagraph)
		paragraph2.setAlignment(paragraph.ALIGIN_LEFT);
		doucement.add(paragraph2);
		

		Font fontParagraph3 =  FontFactory.getFont(FontFactory.HELVETICA);
		fontParagraph.setSize(12);
		
		
		paragraph paragraph2= new paragraph("Below is some information about product.",fontParagraph)
	    paragraph2.setAlignment(paragraph.ALIGIN_LEFT);
		doucement.add(paragraph3);
		
		
	 table = new  PdfPTable(3);
		
		table.addCell("Header1");
		table.addCell("Header2");
		table.addCell("Header3");
		
		//ADD rows To The  table
		
		
		table.addCell(" Column 1");
		table.addCell("Column 2");
		table.addCell("Column 3");
		
		
		table.addCell(" Column 1");
		table.addCell("Column 2");
		table.addCell("Column 3");
		
		
		//add the table to the pdf document
		doucement.add(table);
		
		//doucement .close();
		return  table;
		
		
		
		
		
	
	}

}
