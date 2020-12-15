package pitches;

public class FirstPitcher extends Pitches{

	@Override
	public void Exhibit() {
		System.out.println("첫번쨰 투수가 등판합니다.");
	}

	@Override
	public void Throw() {
		System.out.println("1구 ,직구.149KM");
		System.out.println("2구 ,슬라이더.141KM");
		System.out.println("3구 ,직구.151KM");
		System.out.println("4구 ,커브.132KM");
		System.out.println("5구 체인지업.139KM");
	}

	@Override
	public void Change() {
		System.out.println("첫번쨰 투수가 다음투수로 교체됩니다.");
		System.out.println("******교체중******");
	}

}
