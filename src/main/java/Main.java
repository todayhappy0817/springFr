
import project.*;
import project.Service.logic.ClubServiceLogic;
import project.Service.sdo.TravelClubCdo;


public class Main {

	public static void main(String[] args) {
		ClubServiceLogic t1 = new ClubServiceLogic();
		t1.registerClub(new TravelClubCdo("kk","k"));
	}

}
