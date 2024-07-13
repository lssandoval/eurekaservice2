/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.monster.db;

import org.mindrot.jbcrypt.BCrypt;

public class CrearUsuario {
    public static void main(String[] args) {
        String claveEnTextoPlano = "MONSTER9";
        String claveEncriptada = BCrypt.hashpw(claveEnTextoPlano, BCrypt.gensalt());
        
        System.out.println("Clave encriptada: " + claveEncriptada);
    }
}

