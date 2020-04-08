package doze;

public class Metamodel<T> {

	private Class<T> clss;

	public static <T> Metamodel<T> of(Class<T> clss){
		return new Metamodel<>(clss);
	}

	public Metamodel(Class<T> clss){
		this.clss = clss;
	}
}
