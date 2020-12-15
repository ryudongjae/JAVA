package game;

public abstract class Character {
	
		public abstract void run();
		public abstract void jump();
		public abstract void turn();
		
		final public void play() {
			
			run();
			jump();
			turn();
			
		}

}
