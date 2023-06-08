package principal;

import javax.swing.JOptionPane;

public class Mascota {

	private String nombre;
    private String especie;
    private int edad;
    private String color;
    private String identificacion;

    public Mascota() {

    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setColor (String color) {
    	this.color=color;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public int getEdad() {
        return edad;
    }
    public String getColor() {
    	return color;
    }
    public String getIdentificacion() {
        return identificacion;
    }
    
    
    public void ingresarDatos() {
        nombre = JOptionPane.showInputDialog("Ingrese el nombre de la mascota:");
        especie = JOptionPane.showInputDialog("Ingrese la especie de la mascota:");
        String edadStr = JOptionPane.showInputDialog("Ingrese la edad de la mascota:");
        edad = Integer.parseInt(edadStr);
        color = JOptionPane.showInputDialog("Ingrese le color tu mascota");
        identificacion = JOptionPane.showInputDialog("Ingrese la identificación de la mascota:");
    }

    public void mostrar() {
         JOptionPane.showInputDialog(null, "Nombre: " + nombre + "\n" +"Especie: " + especie + "\n" +
                "Edad: " + edad + "\n"+"Identificación: " + identificacion);
    }

}
