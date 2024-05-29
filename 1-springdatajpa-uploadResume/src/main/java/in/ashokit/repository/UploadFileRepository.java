package in.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import in.ashokit.Entity.UplodaFile;



public interface UploadFileRepository extends JpaRepository<UplodaFile,Integer>{

}
