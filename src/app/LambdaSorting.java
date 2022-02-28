package app;


import java.util.ArrayList;
import java.util.List;

import entity.Camera;

public class LambdaSorting {

	public static void main(String[] args) {

		String[] cameraNames = {"Canon", "Nikon", "Sony", "Panasonic", "Red", "BlackMagic", "Sigma"};
		List<Camera> cameraList = new ArrayList<Camera>();

		for (int i = 0; i < cameraNames.length; i++) {
			cameraList.add(new Camera(cameraNames[i]));
		}
		
		//Printing -- Initial Order
		System.out.println("There are " + cameraNames.length + " cameras in the list.");
		//Lambda for Printing
		cameraList.forEach((s) -> System.out.println(s.toString(s)));

		System.out.println("\nAfter sorting by Name with Lambda:");
		//Sorting with Lambda
		cameraList.sort((Camera c1, Camera c2) -> c1.compare(c1, c2));
		//Lambda for Printing
		cameraList.forEach((s) -> System.out.println(s.toString(s)));

//		System.out.println("\nAfter sorting by Name with Method Reference");
//		//Sorting with methodReference
//		cameraList.sort(Camera::methodReferenceCompare);
//		//Lambda for Printing
//		cameraList.forEach((s) -> System.out.println(s.toString(s)));
		
	}
}
