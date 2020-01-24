package immutable;

public abstract class AbstractAssure {

	protected final String nir;

	protected AbstractAssure(final String nir) {
		this.nir = nir;
	}

	public String getNir() {
		return nir;
	}

	@Override
	public String toString() {
		return "AbstractAssure [nir=" + nir + "]";
	}

}
