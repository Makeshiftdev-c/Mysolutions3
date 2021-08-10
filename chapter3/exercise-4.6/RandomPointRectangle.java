public class RandomPointRectangle {
	public static void main(String[] args) {
		final int LENGTH = 150;
		final int HALF_LENGTH = LENGTH / 2;
		final int WIDTH = 50;
		final int HALF_WIDTH = 50 / 2;

		int randXCoord = (int)  (Math.random() * (Math.random() >= 0.5 ? +HALF_WIDTH : -HALF_WIDTH));
		int randYCoord = (int)  (Math.random() * (Math.random() >= 0.5 ? +HALF_LENGTH : -HALF_LENGTH));

		System.out.println("Random coordinate within rectangle: (" +randXCoord + ", " + randYCoord + ")");
	}
}