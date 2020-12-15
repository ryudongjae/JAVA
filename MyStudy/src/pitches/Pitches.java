package pitches;

public abstract class Pitches {
	
	public abstract void Exhibit();
	public abstract void Throw();
	public abstract void Change();
	
	public void pitch() {
		Exhibit();
		Throw();
		Change();
	}

}
