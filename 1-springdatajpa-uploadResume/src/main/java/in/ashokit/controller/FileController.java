package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import in.ashokit.service.FileStorageService;

@RestController
public class FileController {
	
	@Autowired
	private FileStorageService storage;
	
	@PostMapping("/uploadFiles12")
	
	public ResponseEntity<String>saveFile1(@RequestParam("files") MultipartFile[]files){
		  
		for(MultipartFile file:files) {
			
			storage.save(file);
		}
		
		return new ResponseEntity<String >("Upload Successfully",HttpStatus.ACCEPTED);
	}

}
