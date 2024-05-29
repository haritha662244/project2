package in.ashokit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.service.ReportService;
import jakarta.servlet.http.HttpServletResponse;

@RestController
public class ReportServiceController {
	
	@Autowired
	private ReportService reportService;
	
	
	@GetMapping("/excel")
	public void generateExcelReport(HttpServletResponse response) throws Exception {
		
   response.setContentType("application/octet-stream");
   
    String herderkey="Content-Disposition";
    String herdValue="attachment;filename=course.xls";
    
    response.setHeader(herderkey, herdValue);
		
		
	reportService.generateExcel(response);	
	}

}
