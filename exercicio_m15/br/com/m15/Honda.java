public class Honda extends Carro {

    @Override
	public String getNome() {
		return "Honda";
	}

	@Override
	public String getModelo() {
		return "Civic";
	}

	@Override
	public String toString() {
		return "Fabricante = " + getNome() + ", Modelo = " + getModelo();
	}
}
