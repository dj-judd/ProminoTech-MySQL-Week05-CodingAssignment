package entity;

public class Camera {
	
	private String name;
		
	public Camera(String nameInput){
		this.name = nameInput;
	}

	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(Camera getName) {
		String name = getName();
		
		return getName.getClass().getSimpleName() + " | " + name;
	}
	
	public int compare(Camera c1, Camera c2) {

		
		int stringLength1 = c1.getName().length();
        int stringLength2 = c2.getName().length();
		int lengthMin = Math.min(stringLength1, stringLength2);
		
        for (int i = 0; i < lengthMin; i++) {
            int string1CharAt = (int)c1.getName().charAt(i);
            int string2CharAt = (int)c2.getName().charAt(i);
  
            if (string1CharAt != string2CharAt) {
                return string1CharAt - string2CharAt;
            }
        }
  
        // Edge case for alike strings
        if (stringLength1 != stringLength2) {
            return stringLength1 - stringLength2;
        }
  
        else {
            return 0;
        }
		
	}
	
}
