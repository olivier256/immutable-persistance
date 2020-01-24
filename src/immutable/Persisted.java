package immutable;

public interface Persisted<D extends Draft> {

	D draft();

}
