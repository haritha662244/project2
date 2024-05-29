package in.ashokit.service;

import java.util.List;

import org.hibernate.boot.registry.classloading.spi.ClassLoaderService.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Course;
import in.ashokit.repo.CourseRepository;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletResponse;

@Service
public class ReportService<HSSWorkBook> {
	
	@Autowired
	private CourseRepository courseRepo;
	
	 public void generateExcel(HttpServletResponse response) {
		 
		 List<Course> course = courseRepo.findAll();
		 
		HSSWorkBook workbook =  new  HSSWorkBook();
	   Sheet sheet = workbook.createSheet("Book Info");
		HSSFRow row =sheet.createRow(0);
		
		 row.createCell(0).setCellValue("Id");
		 row.createCell(1).setCellValue("name");
		 row.createCell(2).setCellValue("price");
		 
		 int dataRowIndex=1;
		 for(Course Book: course) {
			  HSSFRow dataRow =sheet.createRow(dataRowIndex);
			  dataRow.createCell(0).setCellValue(course.getbid());
			  dataRow.createCell(1).setCellValue(course.getcname());
			  dataRow.createCell(2).setCellValue(course.getprice());
			  
			  
			  dataRowIndex ++;
		 
		 }
		  
		 ServletOutputStream ops = response.getOutputStream();
         workbook.write(ops);
	 }

}
