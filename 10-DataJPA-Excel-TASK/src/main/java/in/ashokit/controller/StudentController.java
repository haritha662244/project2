package in.ashokit.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.text.DateFormat;
import in.ashokit.entity.Student;
import in.ashokit.service.StudentService;
import in.ashokit.util.ExcelGenerator;
import jakarta.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
@Controller
public class StudentController {
	 @Autowired
	    private StudentService studentService;

	    @GetMapping("/export-to-excel")
	    public void exportIntoExcelFile(HttpServletResponse response) throws IOException {
	        response.setContentType("application/octet-stream");
	        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
	        String currentDateTime = dateFormatter.format(new Date());

	        String headerKey = "Content-Disposition";
	        String headerValue = "attachment; filename=student" + currentDateTime + ".xlsx";
	        response.setHeader(headerKey, headerValue);

	        List <Student> listOfStudents = studentService.getTheListStudent();
	        ExcelGenerator generator = new ExcelGenerator(listOfStudents);
	        generator.generateExcelFile(response);
}
}
