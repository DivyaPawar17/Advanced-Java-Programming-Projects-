package travel;

public class Airline {
	
	
	private String code;
	private String name;
	 private String employeeCount;

	 
	public Airline() {
		// TODO Auto-generated constructor stub
	}


	public Airline(String code, String name, String employeeCount) {
		super();
		this.code = code;
		this.name = name;
		this.employeeCount = employeeCount;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmployeeCount() {
		System.out.println("Getting Employee Count");
		return employeeCount;
		
	}


	public void setEmployeeCount(String employeeCount) {
		this.employeeCount = employeeCount;
		System.out.println("Setting Employee Count");
	}


	@Override
	public String toString() {
		return "Airline [code=" + code + ", name=" + name + ", employeeCount=" + employeeCount + "]";
	}

}
