/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.monster.prueba;

import ec.edu.monster.servicio.EurekaService;

/**
 *
 * @author leito
 */
public class PruebaLogin {

    public static void main(String[] args) {
        try {
            // Datos de la prueba
            String usuario = "MONSTER";
            String clave = "MONSTER9";

            // Proceso
            EurekaService service = new EurekaService();
            boolean isValid = service.validarUsuario(usuario, clave);

            // Reporte
            if (isValid) {
                System.out.println("El usuario " + usuario + " ha sido autenticado correctamente.");
            } else {
                System.out.println("La autenticación del usuario " + usuario + " ha fallado.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
