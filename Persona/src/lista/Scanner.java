
package lista;

import persona.Persona;
import java.util.ArrayList;
import java.util.List;

public class Scanner {
    

    public static void main(String[] args) {
        List<Persona> listaPersonas = new ArrayList<Persona>();
        listaPersonas.add(new Persona("Nicol", "Benavides", 24, "Femenino", 1.71, 66));
        listaPersonas.add(new Persona("Alejandro", "Morales", 34, "Masculino", 1.83, 69));
        listaPersonas.add(new Persona("Anderson", "Martinez", 23, "Masculino", 1.77, 71));
        listaPersonas.add(new Persona("Elena", "Pantoja", 42, "Femenino", 1.62, 64));
        
        // Imprimir los datos de las personas
        
        for (int i=0; i<listaPersonas.size(); i++) {
            System.out.println("Nombre: " + listaPersonas.get(i).getNombre() + ", Apellido: " + listaPersonas.get(i).getApellido() + ", Edad: " + listaPersonas.get(i).getEdad() + ", Genero: " + listaPersonas.get(i).getGenero() + ", Estatura: " + listaPersonas.get(i).getEstatura() + ", Peso: " + listaPersonas.get(i).getPeso());
        
        // Imprimir la persona con mayor peso
        }
        Persona pesoMayor = listaPersonas.get(0);
        for (Persona persona : listaPersonas) {
            if (persona.peso > pesoMayor.peso) {
                pesoMayor = persona;
            }
            
        }
        System.out.println("La persona con mayor peso es: " + pesoMayor);
        
        // Imprimir la persona con menor estatura
        
        Persona estaturaMenor = listaPersonas.get(0);
        for (Persona persona : listaPersonas) {
            if (persona.estatura < estaturaMenor.estatura) {
                estaturaMenor = persona;
            }
            
        }
        System.out.println("La persona con menor estatura es: " + estaturaMenor);
        
        //imprimir el promedio de las edades de las personas
        
        int suma = 0;
        for (Persona persona : listaPersonas){
            suma += persona.edad;
        }
        int promedio = suma / listaPersonas.size();
        System.out.println("El promedio de las edades es: " + promedio);
        
        //imprimir cuantas personas son de genero masculino y cuantas de genero masculino
        
        int masculino = 0;
        int femenino = 0;
        
        System.out.println("\nPersonas de genero masculino: ");
        for (Persona persona : listaPersonas) {
            if (persona.genero.equalsIgnoreCase("masculino")) {
                masculino++;
        System.out.println(persona);
            }
        }
        
        System.out.println("\nPersonas de genero femenino: ");
        for (Persona persona : listaPersonas) {
            if (persona.genero.equalsIgnoreCase("femenino")) {
                femenino++;
        System.out.println(persona);
            }
        }
        
    }
        
}