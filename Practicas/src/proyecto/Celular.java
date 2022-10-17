package proyecto;

public class Celular {
	String marca;
	String modelo;
	String procesador;
	String camara;
	int ram;
	double pantalla;
	int rom;
	
	public Celular() {
		System.out.println("Se creo celular");
	}

	public Celular(String marca, String modelo, String procesador, String camara, int ram, double pantalla, int rom) {
		this.marca = marca;
		this.modelo = modelo;
		this.procesador = procesador;
		this.camara = camara;
		this.ram = ram;
		this.pantalla = pantalla;
		this.rom = rom;
	}
	
	

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public String getCamara() {
		return camara;
	}

	public void setCamara(String camara) {
		this.camara = camara;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public double getPantalla() {
		return pantalla;
	}

	public void setPantalla(double pantalla) {
		this.pantalla = pantalla;
	}

	public int getRom() {
		return rom;
	}

	public void setRom(int rom) {
		this.rom = rom;
	}

	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", modelo=" + modelo + ", procesador=" + procesador + ", camara=" + camara
				+ ", ram=" + ram + ", pantalla=" + pantalla + ", rom=" + rom + "]";
	}
	
	 
}