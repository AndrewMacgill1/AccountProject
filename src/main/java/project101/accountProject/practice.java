package project101.accountProject;



import java.util.List;

import com.boot.controller.ShipwreckStub;
import com.boot.model.Shipwreck;

public class practice {
	
	public static void main (String [] args) {
		
		List<Shipwreck> shipwrecks = ShipwreckStub.list();
		
		for(Shipwreck a : shipwrecks) {
			System.out.println(a.getDescription());
		}
		
	}

}
