package proyecto;

public class Main {

	public static void main(String[] args) {
		Celular Iphone = new Celular();
	    Iphone.setMarca("Xiaomi");
	    Iphone.setModelo("M2102K7AG");
	    Iphone.setCamara("12Mp");
	    Iphone.setPantalla(6.7);
	    Iphone.setProcesador("Octa-Core Max 2.20GHz");
	    Iphone.setRam(6);
	    Iphone.setRom(256);
		Celular x4 = new Celular("Xiaomi","M2101K7AG","Octa-Core Max 2.20GHz","108Mp", 8, 6.7, 256);
		System.out.println(Iphone.toString());
		System.out.println(x4.toString());

	}

}

