package project.aggregate.club;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import project.aggregate.Entity;

@Getter
@Setter
@NoArgsConstructor
public class TravelClub extends Entity{
	
	private String name;
	private String intro;
	private long foundationTime;
	
	public TravelClub(String id) {
		super(id);
	}
	
	public TravelClub(String name, String intro) {
		//
		super();
		this.name = name;
		this.intro = intro;
		this.foundationTime = System.currentTimeMillis();
	}

	@Override
	public String toString() {
		//
		StringBuilder builder = new StringBuilder();

		builder.append("Travel Club Id:").append(id);
		builder.append(", name:").append(name);
		builder.append(", intro:").append(intro);
		builder.append(", foundation day:").append(foundationTime);

		return builder.toString();
	}



}
