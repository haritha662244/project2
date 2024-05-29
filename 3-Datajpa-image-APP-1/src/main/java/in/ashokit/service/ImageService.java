package in.ashokit.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import in.ashokit.entity.Image;
import in.ashokit.repository.ImageRepository;

@Service
public class ImageService {

	
	@Autowired
	private ImageRepository imageRepository;
	
	public  String  saveImage(MultipartFile file, String name, String decription) throws IOException {
		Image image= new Image();
		image.setName(name);
	    image.setDecription(decription);
		image.setImage(file.getBytes());
		
	 imageRepository.save(image);
	 return "Image saved in DB";
		
	}

	}
	

