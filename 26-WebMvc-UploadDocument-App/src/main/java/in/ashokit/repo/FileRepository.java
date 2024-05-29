package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.File;

@Repository
public interface FileRepository  extends JpaRepository<File,Long>{



}