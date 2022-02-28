package app;

import java.util.List;
import entity.Camera;

public class LambdaSorting {

	public static void main(String[] args) {

		System.out.println("There are " + Camera.getCameras().size() + " cameras in the list:");
		//Initial Order -- Lambda for Printing
		Camera.getCameras().forEach((s) -> System.out.println(s.toString(s)));

		
		List<Camera> lambdaCameras = sortByLambda();
		System.out.println("\nAfter sorting by Name with Lambda:");
		//Sorting with Lambda & Lambda for Printing
		lambdaCameras.forEach((s) -> System.out.println(s.toString(s)));

		
		List<Camera> methodReferenceCameras = sortByMethodReference();
		System.out.println("\nAfter sorting by Name with Method Reference:");
		methodReferenceCameras.forEach((s) -> System.out.println(s.toString(s)));
		//Sorting with Method Reference & Method Reference for printing
		
	}
	
	private static List<Camera> sortByLambda() {
		List<Camera> cameraListByLambda = Camera.getCameras();
		cameraListByLambda.sort(Camera::compare);
		return cameraListByLambda;
	}
	
	private static List<Camera> sortByMethodReference() {
		List<Camera> cameraListByMethodReference = Camera.getCameras();
		cameraListByMethodReference.sort((c1, c2) -> Camera.compare(c1, c2));
		return cameraListByMethodReference;
	}
	
	
	
}
