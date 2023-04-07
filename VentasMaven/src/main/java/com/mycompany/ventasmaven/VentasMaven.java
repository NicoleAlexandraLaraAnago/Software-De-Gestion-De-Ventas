/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ventasmaven;

import Vista.Login;
import java.time.LocalDate;
import org.joda.time.DateTime;
import org.joda.time.Months;

/**
 *
 * @author Lana
 */
public class VentasMaven {

    public static void main(String[] args) {
        Login lg = new Login();
        lg.setVisible(true);
         // Fecha de caducidad
       /* LocalDate today = LocalDate.now();
        LocalDate expirationDate = LocalDate.of(2024, 3, 7);

        if (today.isBefore(expirationDate)) {
            int daysLeft = today.until(expirationDate).getDays();
            System.out.println("El programa está en el período de prueba. Quedan " + daysLeft + " días.");
            // Aquí iría el código para ejecutar el programa normalmente
        } else {
            System.out.println("El período de prueba ha expirado. Por favor, compre una licencia para seguir usando el programa.");
           System.exit(0); // Aquí iría el código para mostrar un mensaje informando al usuario que debe comprar una licencia para seguir usando el programa
        }*/
    }
}
