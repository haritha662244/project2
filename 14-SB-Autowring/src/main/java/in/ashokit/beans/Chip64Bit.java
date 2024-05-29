package in.ashokit.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Chip64Bit  implements IChip{
	
	 public Chip64Bit() {
		System.out.println(" chip64Bit ::Constructor"); 
	 }
	
	@Override
	public boolean process() {
		System.out.println("chip64bit processing started....");
		return true;
	}

}
