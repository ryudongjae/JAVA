package pitches;

public class ClosePitcher extends Pitches {

	@Override
	public void Exhibit() {
		System.out.println("마무리 투수가 등판합니다.");
	}

	@Override
	public void Throw() {
		System.out.println("1구,직구.152KM");
		System.out.println("2구,포크.140KM");
		System.out.println("3구,직구.156KM");
		System.out.println("4구,슬라이더.149KM");
		System.out.println("5구,직구.157KM");
	}

	@Override
	public void Change() {
		System.out.println("경기가 종료됩니다.");
		
	}

}
