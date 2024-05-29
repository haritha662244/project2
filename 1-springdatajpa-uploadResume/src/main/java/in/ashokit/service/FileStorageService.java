package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import in.ashokit.Entity.UplodaFile;
import in.ashokit.repository.UploadFileRepository;


@Service
public class FileStorageService {
	
	@Autowired
	private UploadFileRepository uploadRepo;
	
	public  UplodaFile save(MultipartFile file) {
		
		String fileName=file.getOriginalFilename();
		
		try {
			UplodaFile uf= new UplodaFile();
			uf.setFileName(fileName);
			uf.setFileName(file.getContentType());
			uf.setFileData(file.getBytes());
			
			return uploadRepo.save(uf);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
	
	}
	}



