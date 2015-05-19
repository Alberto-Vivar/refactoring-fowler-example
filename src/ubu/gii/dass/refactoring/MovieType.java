package ubu.gii.dass.refactoring;

public abstract class MovieType {

	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;

	public static MovieType newType(int type) {
		switch (type) {
		case REGULAR:
			return new RegularMovieType();
		case NEW_RELEASE:
			return new NewReleaseMovieType();
		case CHILDRENS:
			return new ChildrenMovieType();
		default:
			throw new IllegalArgumentException(
					"This code isn't a supported movie type");
		}
	}
	
	abstract public int getCode();

}
