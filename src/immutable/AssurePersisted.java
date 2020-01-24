package immutable;

public class AssurePersisted extends AbstractAssure implements Persisted<AssureDraft> {

	private final long id;

	protected AssurePersisted(final long id, final AssureDraft draft) {
		super(draft.getNir());
		this.id = id;
	}

	public long getId() {
		return id;
	}

	@Override
	public AssureDraft draft() {
		return new AssureDraft(this);
	}

	@Override
	public String toString() {
		return "AssurePersisted [id=" + id + ", toString()=" + super.toString() + "]";
	}

}
