/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mis_applets;

import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 2/08/2021
 *
 */
public class HolaAlumnos extends JApplet { //Heredamos de la clase JApplet

//Un Applet no lleva el método main
    @Override
    public void init() {
        //Creamos el mensaje que queremos que aparezca
        JLabel rotulo=new JLabel("Hola Alumnos", SwingConstants.CENTER); //Utilizamos esta intrucción para centrar nuestro texto 
        
        //Agregamos nuestro mensaje a nuestro applet
        add(rotulo);
        //Esto se ejecutara en nuestro navegador
        
    }
}
