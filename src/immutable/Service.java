package immutable;

public interface Service<D extends Draft, P extends Persisted<D>> {

	P persist(D draft);

}
