/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jar_firma_I;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JApplet;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 5/08/2021
 *
 */
public class Applet_multimedia extends JApplet {

    @Override
    public void init() {
        logo = getImage(getDocumentBase(), "oso.jpg");
        /*
         Dibujamos nuestra imagen en nuestro applet
        
         */
    }

    public void paint(Graphics g) {
        g.drawImage(logo, 50, 50, this);
    }
    Image logo;

}
