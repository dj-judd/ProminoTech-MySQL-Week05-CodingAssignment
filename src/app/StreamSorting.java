package app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entity.Camera;

public class StreamSorting {
	
	public static void main(String[] args) {
	
		String[] cameraNames = {"Canon", "Nikon", "Sony", "Panasonic", "Red", "BlackMagic", "Sigma"};
		List<Camera> cameraList = new ArrayList<Camera>();

		for (int i = 0; i < cameraNames.length; i++) {
			cameraList.add(new Camera(cameraNames[i]));
		}
		
		String streamSorted = cameraList.stream().map(c -> c.getName()).sorted().collect(Collectors.joining(", "));
		
		System.out.println("Cameras sorted by name:\n" + streamSorted);	
	}
}
