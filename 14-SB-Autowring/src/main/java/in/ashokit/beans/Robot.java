package in.ashokit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
//@Primary

public class Robot {
	@Autowired
	
	//@Qualifier("chip32")
	
	private IChip  chip;
	public Robot() {
		System.out.println("Robot::constructor");
	}
	
	public void dowork () {
		System.out.println("Injected :"+chip.getClass().getName());
		boolean status = chip.process();
		if(status) {
			System.out.println("Robot is working.......");
		}else {
			System.out.println("Robot is having fault.......");
		}
	}

}
