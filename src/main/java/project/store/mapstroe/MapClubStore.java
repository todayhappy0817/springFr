package project.store.mapstroe;
import java.util.LinkedHashMap;
import java.util.Map;

import project.aggregate.club.TravelClub;
import project.store.ClubStore;


public class MapClubStore implements ClubStore{
	
	private Map<String,TravelClub> MapClub;

	public MapClubStore() {
		this.MapClub = new LinkedHashMap<>();
	}
	
	public String create(TravelClub club) {
		MapClub.put(club.getId(), club);
		return club.getId();
	}

}
