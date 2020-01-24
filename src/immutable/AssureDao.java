package immutable;

import java.util.List;

public interface AssureDao extends Dao<AssureDraft, AssurePersisted> {

	List<AssurePersisted> findByNir(String nir);

}
