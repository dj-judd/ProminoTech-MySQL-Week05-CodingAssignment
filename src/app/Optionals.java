package app;

import java.util.NoSuchElementException;
import java.util.Optional;

import entity.Camera;

public class Optionals {

	public static void main(String[] args) {

		new Optionals().methodB();
	
	
	}
	
	private void methodB() {
		Camera camera = methodA(Optional.of(new Camera("Pentax")));
		System.out.println(camera.getName());
		
		try {
			methodA(Optional.empty());
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	private Camera methodA(Optional<Camera> optionalCamera) {
		return optionalCamera.orElseThrow(() -> new NoSuchElementException("No camera object here!"));
	}
}