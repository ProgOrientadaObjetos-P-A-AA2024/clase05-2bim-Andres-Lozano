/*
 * L — Liskov substitution principle (Principio de sustitución de Liskov) 
 */
package paquete06l;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        Banco ban = new Banco();
        TargetaCredito tar = new TargetaCredito();
        tar.establecerNombre(("Visa"));
        tar.establecerNumero("110101111");
        
        MayorEdad representante = new MayorEdad("José", tar);
        
        MenorEdad menor = new MenorEdad("Felipe", representante);
        ban.establecerNombre("Pichincha");
        
        
        System.out.printf("Nombre:%s - Tarjeta:%s- Banco:%s\n",
                menor.obtenerNombre(), 
                menor.obtenerRepresentante().obtenerTarjeta().obtenerNumero(),
                menor.obtenerRepresentante().obtenerTarjeta().obtenerBanco());
                
        
    }
}
