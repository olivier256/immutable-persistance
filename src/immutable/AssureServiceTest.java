package immutable;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class AssureServiceTest {

	public static void main(final String[] args) {
		AssureDao assureDao = new AssureDao() {

			Map<Long, AssurePersisted> map = new HashMap<>();

			@Override
			public AssurePersisted findOne(final long l) {
				return map.get(l);
			}

			@Override
			public Collection<AssurePersisted> findAll() {
				return map.values();
			}

			@Override
			public long saveOrUpdate(final AssureDraft draft) {
				long id = getMax();
				id++;
				AssurePersisted assure = new AssurePersisted(id, draft);
				map.put(id, assure);
				return id;
			}

			private long getMax() {
				long max = 0;
				for (Long l : map.keySet()) {
					if (l > max) {
						max = l;
					}
				}
				return max;
			}

			@Override
			public List<AssurePersisted> findByNir(final String nir) {
				List<AssurePersisted> list = new LinkedList<>();
				for (AssurePersisted assure : map.values()) {
					if (assure.getNir().equals(nir)) {
						list.add(assure);
					}
				}
				return list;
			}

		};

		AssureService assureService = new AssureService(assureDao);

		AssureDraft draft = new AssureDraft.Builder().withNir("1770184123456").build();
		System.out.println(draft);
		AssurePersisted persisted = assureService.persist(draft);
		System.out.println(persisted);

	}
}
