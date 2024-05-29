package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import in.ashokit.service.FileService;

@Controller
public class FileController {

    @Autowired
    private FileService fileService;

    @GetMapping("/")
    public String index() {
        return "upload"; // HTML template for file upload form
    }

    @PostMapping("/upload")
    public String uploadFile(@RequestParam("file") MultipartFile file, Model model) {
        if (file.isEmpty()) {
            model.addAttribute("message", "Please select a file to upload");
            return "upload"; // Return to upload form with error message
        }
        try {
            fileService.uploadFile(file);
            model.addAttribute("message", "File uploaded successfully: " + file.getOriginalFilename());
        } catch (Exception e) {
            model.addAttribute("message", "Failed to upload file: " + e.getMessage());
        }
        return "upload"; // Return to upload form with success or error message
    }

    @GetMapping("/download")
    public String downloadFile(Model model) {
        // Logic for retrieving file list and passing it to the template
        return "download"; // HTML template for file download form
    }

    @GetMapping("/file")
    public String getFile(@RequestParam("filename") String filename, Model model) {
        // Logic for downloading the selected file
        return "download"; // HTML template for file download form
    }
}