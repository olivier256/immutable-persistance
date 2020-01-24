package immutable;

public class AssureDraft extends AbstractAssure implements Draft {

	private AssureDraft(final String nir) {
		super(nir);
	}

	protected AssureDraft(final AbstractAssure assure) {
		super(assure.getNir());
	}

	static class Builder {
		private String nir;

		public Builder withNir(final String nir) {
			this.nir = nir;
			return this;
		}

		public AssureDraft build() {
			return new AssureDraft(nir);
		}
	}

	@Override
	public String toString() {
		return "AssureDraft [toString()=" + super.toString() + "]";
	}

}
