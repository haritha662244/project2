package in.ashokit.pdf;

//import java.io.IOException;
//import java.sql.Date;
//import java.text.SimpleDateFormat;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import com.lowagie.text.DocumentException;
//
//
//import in.ashokit.entity.User;
//import in.ashokit.service.UserService;
//import jakarta.servlet.http.HttpServletRespo


import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
 
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
 
import com.lowagie.text.DocumentException;

import in.ashokit.service.UserService;

@Controller
public class UserController {
	 @Autowired
	    private UserService service;
	         
	    @GetMapping("/users/export/pdf")
	    public void exportToPDF(HttpServletResponse response) throws DocumentException, IOException {
	        response.setContentType("application/pdf");
	        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
	        String currentDateTime = dateFormatter.format(new Date());
	         
	        String headerKey = "Content-Disposition";
	        String headerValue = "attachment; filename=users_" + currentDateTime + ".pdf";
	        response.setHeader(headerKey, headerValue);
	         
	        List<User> listUsers = service.listAll();
	         
	           
	        UserPdfExporter export = new UserPdfExporter(listUsers);
	        export.export(response);
}
}


//	
//<a th:href="/@{/users/export/pdf}">Export to PDF</a>
//7. Test Export and Download PDF document
//Click the hyperlink Export to PDF, the Spring Boot application will generate an PDF file and the browser will automatically download that file. The file name is something like this: users_2020-09-04_10_47_46.pdf. Open this file using a PDF reader application (or view right in the browser), you would see the following screen:


	    