package in.ashokit.service;


import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class FileService {

    private static final String UPLOAD_DIR = "Documents\\my document.docx";
    		

    public void uploadFile(MultipartFile file) throws IOException {
        Path filePath = Paths.get(UPLOAD_DIR, file.getOriginalFilename());
        Files.write(filePath, file.getBytes());
    }

    // Add methods for downloading files if needed
}