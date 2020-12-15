package pitches;

public class ThirdPitcher extends Pitches{

	@Override
	public void Exhibit() {
		System.out.println("세번째 투수가 등판합니다.");
	}

	@Override
	public void Throw() {
		System.out.println("1구,직구.156KM");
		System.out.println("2구,직구.157KM");
		System.out.println("3구,커브.139KM");
		
	}

	@Override
	public void Change() {
		System.out.println("세번째 투수가 다음투수로 교체됩니다.");
		System.out.println("******교체중******");
		
	}

}
