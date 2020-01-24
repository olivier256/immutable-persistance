package immutable;

public class AssureService implements Service<AssureDraft, AssurePersisted> {

	private final AssureDao assureDao;

	protected AssureService(final AssureDao assureDao) {
		this.assureDao = assureDao;
	}

	@Override
	public AssurePersisted persist(final AssureDraft draft) {
		long id = assureDao.saveOrUpdate(draft);
		return assureDao.findOne(id);
	}
}
