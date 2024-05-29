package in.ashokit.controller;


import java.awt.PageAttributes.MediaType;
import java.net.http.HttpHeaders;
import java.util.List;

import javax.xml.crypto.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Spring Boot Controller
@RestController
@RequestMapping("/api")
public class DataController {

 @Autowired
 private DataService dataService;

 @GetMapping("/data")
 public ResponseEntity<List<Data>> getData() {
     List<Data> data = dataService.getDataFromDatabase();
     return ResponseEntity.ok(data);
 }

 @GetMapping("/data/excel")
 public ResponseEntity<byte[]> generateExcel() {
     List<Data> data = dataService.getDataFromDatabase();
     byte[] excelBytes = ExcelGenerator.generateExcel(data);
     HttpHeaders headers = new HttpHeaders();
     headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
     headers.setContentDispositionFormData("attachment", "data.xlsx");
     return new ResponseEntity<>(excelBytes, headers, HttpStatus.OK);
 }

 @GetMapping("/data/pdf")
 public ResponseEntity<byte[]> generatePdf() {
     List<Data> data = dataService.getDataFromDatabase();
     byte[] pdfBytes = PdfGenerator.generatePdf(data);
     HttpHeaders headers = new HttpHeaders();
     headers.setContentType(MediaType.APPLICATION_PDF);
     headers.setContentDispositionFormData("attachment", "data.pdf");
     return new ResponseEntity<>(pdfBytes, headers, HttpStatus.OK);
 }
}
