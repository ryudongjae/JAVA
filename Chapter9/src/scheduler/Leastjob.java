package scheduler;

public class Leastjob implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("상담전화를 순서대로 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("현재 상담업무가 없거나 상담기 가장 적은 상담원에게 할당합니다.");
	}

}
