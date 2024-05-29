package in.ashokit.controller;

import java.io.IOException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.service.PDFGeneratorService;
import jakarta.servlet.http.HttpServletResponse;

@RestController
public class PDFExportController {
	
	
	@Autowired
	private PDFGeneratorService pdfGeneratorService;
	
	@GetMapping("/pdf/generate")
	public void generatePDF(HttpServletResponse response) throws IOException{
		
		response.setContentType("application/pdf");	
		DateFormat dateFormatter= new SimpleDateFormat("yyyy-MM-DD:hh:mm:ss");
		String currentDateTime=dateFormatter.format( new Date());
		
		
		String headerKey= "Content -Disposition";
		String headerValue="attechment"; filename = pdf_" + currentDateTime + ".pdf";
		response.setHeader(headerKey, headerValue);
		
		
		
		pdfGenerationService.export(response);
		
		
	}
	

}
