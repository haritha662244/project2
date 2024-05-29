package in.ashokit.Entity;

import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="UPLOAD_FILES")
@Data
public class UplodaFile {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    
	private Integer fileld;
	private String fileName;
	private byte[] fileData;

	@Lob
	@Column(length=90000)
	
	public Integer getFileld() {
		return fileld;
	}

	public void setFileld(Integer fileld) {
		this.fileld = fileld;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public byte[] getFileData() {
		return fileData;
	}

	public void setFileData(byte[] fileData) {
		this.fileData = fileData;
	}

	@Override
	public String toString() {
		return "UplodaFile [fileld=" + fileld + ", fileName=" + fileName + ", fileData=" + Arrays.toString(fileData)
				+ "]";
	}


}
