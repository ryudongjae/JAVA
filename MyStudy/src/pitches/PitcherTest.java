package pitches;

import java.util.ArrayList;

public class PitcherTest {

	public static void main(String[] args) {
		ArrayList<Pitches>pitcherList = new ArrayList<Pitches>(); 
		
		pitcherList.add(new FirstPitcher());
		pitcherList.add(new SecondPitcher());
		pitcherList.add(new ThirdPitcher());
		pitcherList.add(new ClosePitcher());
		
		for(Pitches pitches : pitcherList) {
			pitches.pitch();
		}
		
	}

}
