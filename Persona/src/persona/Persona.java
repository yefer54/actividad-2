
package persona;


public class Persona {
    
    public String nombre;
    public String apellido;
    public int edad;
    public String genero;
    public Double estatura;
    public int peso;
    
    public Persona (String nombre, String apellido, int edad, String genero, Double estatura, int peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.estatura = estatura;
        this.peso = peso;      
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Double getEstatura() {
        return estatura;
    }

    public void setEstatura(Double estatura) {
        this.estatura = estatura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    @Override
    public String toString() {
        return nombre + " " + apellido +" (Edad: " + edad + ", Genero: " + genero + ", Estatura: " + estatura + "m, Peso: "+ peso + "kg)";
    }
    
    
}

