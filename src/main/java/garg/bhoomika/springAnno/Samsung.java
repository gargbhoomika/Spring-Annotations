package garg.bhoomika.springAnno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Samsung {
	@Autowired
	MobileProcessor cpu;
	
	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}

	public void config()
	{
		System.out.println("Ocya Core, 4GB RAM, 12MP Camera");
		cpu.process();
	}

}
