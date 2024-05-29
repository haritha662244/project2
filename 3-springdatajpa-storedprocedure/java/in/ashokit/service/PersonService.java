package in.ashokit.service;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;

import in.ashokit.entity.Person;
import in.ashokit.repo.PersonRepository;

public class PersonService {
	
	@Autowired
	private PersonRepository personRepo;

	public PersonService(PersonRepository personRepo) {
		this.personRepo=personRepo;
	}
	
		public void savePerson() {
			
			Person p = new Person();
			p.setId(101);
			p.setName("Haritha");
			p.setGender("female");
            p.setDob(Date.valueOf("2001-06-04"));
            // Set photo and resume data if required
            // person.setPhotoImage(photoImageData);
            byte[] imageData="C:\\Users\\admin\\OneDrive\\Pictures\\Camera Roll\\pics\\RFC.jpg".getBytes();
            p.setPhotoImage(imageData);
            // person.setResumePdf(resumePdfData);
            byte[] pdfData ="E:\\rs\\resume.pdf".getBytes();
            p.setResumePdf(pdfData);
    		personRepo.save(p);

				// inserting record based on given obj
			System.out.println("Record is saved...");
		}
}
