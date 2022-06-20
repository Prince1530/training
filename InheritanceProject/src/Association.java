
public class Association {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machine m = new Machine("SN123");
		PersonalComputer pc = new PersonalComputer("SN123", "192.168.1.2", 16, 1024);
		System.out.println("PC info ==> " + pc);
		
		TechStack techStack = new TechStack( "reactjs", "nodejs");
		Application app = new Application("twitter", techStack);
		
		// passing object as parameters
		String developedApp = pc.develop(app, techStack);
		System.out.println(developedApp);
		
		// returning object from a method
		Application producedApp = pc.produce(app, techStack);
		System.out.println(producedApp);
		
		TechStack s = new TechStack("react", "node");
		Application a = new Application("instagram", s);
//		s.run();
//		s.operate();
//		s.code();
//		s.deploy();
//		a.deploy();
	}
}

interface Running {
	void run();
}

interface Operating {
	void operate();
}

interface Coding {
	void code();
}

interface Deploying {
	void deploy();
}

class Machine implements Running {
	String serialNumber;

	public Machine(String serialNumber) {
		super();
		this.serialNumber = serialNumber;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	@Override
	public String toString() {
		return "Machine [serialNumber=" + serialNumber + "]";
	}
	
	public void run() {
		System.out.println("machine running");
	}
}

class PersonalComputer extends Machine implements Operating {
	String ipAdress;
	CPU cpu; // has a

	public PersonalComputer(String serialNumber, String ipAdress, int memory, int storage) {
		super(serialNumber);
		this.ipAdress = ipAdress;
		this.cpu = new CPU(memory, storage);
	}

	public String getIpAdress() {
		return ipAdress;
	}

	public void setIpAdress(String ipAdress) {
		this.ipAdress = ipAdress;
	}

	@Override
	public String toString() {
		return "PersonalComputer [ipAdress=" + ipAdress + ", serialNumber=" + serialNumber + ", toString()="
				+ super.toString() + "] " + cpu.toString();
	}
	
	String develop(Application app, TechStack techStack) {
		return "Application ==> " + app.appName + " developed using ==> " + techStack;
	}
	
	Application produce(Application app, TechStack techStack) {
		return app;
	}
	
	public void operate() {
		System.out.println("operating pc");
	}
}

class CPU {
	int memory, storage;

	public CPU(int memory, int storage) {
		super();
		this.memory = memory;
		this.storage = storage;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	@Override
	public String toString() {
		return "CPU [memory=" + memory + ", storage=" + storage + ", toString()=" + super.toString() + "]";
	}
}

class Application implements Deploying {
	String appName;
	TechStack tech; // uses
	
	public Application(String appName, TechStack tech) {
		super();
		this.appName = appName;
		this.tech = tech;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public TechStack getTech() {
		return tech;
	}

	public void setTech(TechStack tech) {
		this.tech = tech;
	}

	@Override
	public String toString() {
		return "Application [appName=" + appName + ", toString()=" + super.toString() + "]";
	}
	
	public void deploy() {
		System.out.println("deploying application");
	}
}

class TechStack implements Coding {
	String frontend, backend;

	public TechStack(String frontend, String backend) {
		super();
		this.frontend = frontend;
		this.backend = backend;
	}

	public String getFrontend() {
		return frontend;
	}

	public void setFrontend(String frontend) {
		this.frontend = frontend;
	}

	public String getBackend() {
		return backend;
	}

	public void setBackend(String backend) {
		this.backend = backend;
	}

	@Override
	public String toString() {
		return "TechStack [frontend=" + frontend + ", backend=" + backend + ", toString()=" + super.toString() + "]";
	}
	
	public void code() {
		System.out.println("coding the app");
	}
}
