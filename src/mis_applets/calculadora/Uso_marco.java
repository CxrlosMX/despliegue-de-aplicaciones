/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mis_applets.calculadora;

import java.awt.Color;
import javax.swing.JApplet;
import javax.swing.JFrame;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 23/05/2021
 *
 */
public class Uso_marco extends JApplet{

    @Override
    public void init() {
        /*
        Cuando queremos crear un Applet con nuestra aplicación
        la clase que hereda del JFrame queda obsoleta, debido a que 
        el tamaño, titulo, etc, ya estara declarado dentro de nuestro navegador
        */
       
         
    Lamina lamina=new Lamina();
    lamina.setBackground(new Color(34,76,98));
    add(lamina);
    }

}
