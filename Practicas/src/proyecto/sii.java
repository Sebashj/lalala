package proyecto;

public class sii {
String nombre;
String carrera;
int grupo;
String semetres;
double promerio;
public sii() {

}
public sii(String nombre, String carrera, int grupo, String semetres, double promerio) {
super();
this.nombre = nombre;
this.carrera = carrera;
this.grupo = grupo;
this.semetres = semetres;
this.promerio = promerio;
}
public String getNombre() {
return nombre;
}
public void setNombre(String nombre) {
this.nombre = nombre;
}
public String getCarrera() {
return carrera;
}
public void setCarrera(String carrera) {
this.carrera = carrera;
}
public int getGrupo() {
return grupo;
}
public void setGrupo(int grupo) {
this.grupo = grupo;
}
public String getSemetres() {
return semetres;
}
public void setSemetres(String semetres) {
this.semetres = semetres;
}
public double getPromerio() {
return promerio;
}
public void setPromerio(double promerio) {
this.promerio = promerio;
}



}