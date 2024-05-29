package in.ashokit.beans;
////28-2-2024
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("chip32")
@Primary
public class Chip32Bit implements IChip {
	
	public Chip32Bit() {
		System.out.println("32bit chip :: constructor");
	}

	@Override
	public boolean process() {
		System.out.println("chip32bit processing started.....");
		return true;

	}

}
