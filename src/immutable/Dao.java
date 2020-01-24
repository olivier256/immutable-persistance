package immutable;

import java.util.Collection;

public interface Dao<D extends Draft, P extends Persisted<D>> {

	P findOne(long l);

	Collection<P> findAll();

	long saveOrUpdate(D draft);

}
