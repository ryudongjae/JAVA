package pitches;

public class SecondPitcher extends Pitches{

	@Override
	public void Exhibit() {
		System.out.println("두번쨰 투수가 등판합니다.");
	}

	@Override
	public void Throw() {
		System.out.println("1구,직구.142KM");
		System.out.println("2구,직구.143KM");
		System.out.println("3구,커브.133KM");
		System.out.println("4구,슬라이더.140KM");
	}

	@Override
	public void Change() {
		System.out.println("두번쨰 투수가 다음투수로 교체됩니다.");
		System.out.println("******교체중******");
	}

}
