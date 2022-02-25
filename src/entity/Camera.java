package entity;

public class Camera {
	
	private String name;
	
	Camera(){
		
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString(String stringInput) {
		this.name = stringInput.toString();
		
		return stringInput;
	}
	
}
