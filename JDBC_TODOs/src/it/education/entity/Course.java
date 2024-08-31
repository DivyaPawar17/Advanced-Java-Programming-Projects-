package it.education.entity;

public class Course {
	private int courseid;
	private String name;
	private String provider;
	private int duration;
	private int fees;
	
	public Course(int courseid, String name, String provider, int duration, int fees) {
		super();
		this.courseid = courseid;
		this.name = name;
		this.provider = provider;
		this.duration = duration;
		this.fees = fees;
	}

	public int getCourseid() {
		return courseid;
	}

	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Course [courseid=" + courseid + ", name=" + name + ", provider=" + provider + ", duration=" + duration
				+ ", fees=" + fees + "]";
	}
	
	


	}


