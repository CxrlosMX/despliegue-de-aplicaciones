/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mis_applets.calculadora;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 23/05/2021
 *
 */
public class Lamina extends JPanel {

    private String ultimaOp;
    private double resultado;
    private JPanel miLamina;
    private JButton pantalla;
    private boolean principio;

    public Lamina() {
        principio = true;
        setLayout(new BorderLayout());
        pantalla = new JButton("0");
        miLamina = new JPanel();
        add(pantalla, BorderLayout.NORTH);
        pantalla.setEnabled(false);
        ActionListener insertar = new insertaNumero();
        ActionListener op = new AccionOrden();
        ponerBoton("7", insertar);
        ponerBoton("8", insertar);
        ponerBoton("9", insertar);
        ponerBoton("/", op);
        ponerBoton("4", insertar);
        ponerBoton("5", insertar);
        ponerBoton("6", insertar);
        ponerBoton("*", op);
        ponerBoton("1", insertar);
        ponerBoton("2", insertar);
        ponerBoton("3", insertar);
        ponerBoton("-", op);
        ponerBoton("0", insertar);
        ponerBoton(".", op);
        ponerBoton("=", op);
        ponerBoton("+", op);
        miLamina.setLayout(new GridLayout(4, 4)); //Con esto indicamos que va a tener 4 filas y 4 columnas
        add(miLamina, BorderLayout.CENTER);
        ultimaOp = "=";
    }

    //Crearemos un metodo para agregar botones
    private void ponerBoton(String rotulo, ActionListener oyente) {
        JButton boton = new JButton(rotulo);
        boton.addActionListener(oyente);
        miLamina.add(boton);
    }

    //Clase que gestionara los eventos de la calculadora
    private class insertaNumero implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String entrada = e.getActionCommand();
            if (principio) {
                pantalla.setText("");
                principio = false;
            }
            pantalla.setText(pantalla.getText() + entrada); //Le mandamos nuestro valor de entrada a nuestro boton que se usara para representar los numeros
        }

    }

    //Crearemos una clase interna donde contendra los metodos para realizar las operaciones basicas
    private class AccionOrden implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String operacion = e.getActionCommand();
           // System.out.println(operacion);

            calcular(Double.parseDouble(pantalla.getText())); //Con este metodo rescatamos lo que tenemos en pantalla
            ultimaOp = operacion;
            principio = true;

        }

        public void calcular(double n) {
            if (ultimaOp.equals("+")) {
                resultado += n;
               // System.out.println(resultado);
            }
            else if(ultimaOp.equals("-")){
            resultado-=n;
            }
            else if(ultimaOp.equals("*")){
            resultado*=n;
            }
            else if(ultimaOp.equals("/")){
            resultado/=n;
            }
            else if (ultimaOp.equals("=")) {
                resultado = n;
                
              
            }
              pantalla.setText(""+resultado); //Con esto convertimos nuestro valor Double a String

        }
    }
}
