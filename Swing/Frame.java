/*
 * Author:  Lunix
 * Created: 
*/
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 * Clase parcial
 * Muestra la estructuta que deberia tener una ventana en Java con la libreria
 * Swing, contiene una etiqueta, un caja de texto y 2 botones, uno que tiene la
 * accion de mostrar si texto en la caja es un numero Positivo, Negativo, Neutro
 * o es una cadena por medio de una ventana de mensaje.
 * @author Arturo Daza Cortez (lunix) 21 de marzo de 2019
 */
public class Frame extends JFrame implements ActionListener {

  private JLabel texto;            // etiqueta o texto no editable
  private JTextField caja;         // caja de texto, para insertar datos que seran comparados
  private JButton boton_aceptar;   // boton para determinar q se introdujo en la caja de texto
  private JButton boton_cancelar;  // boton para terminar la app

  public parcial() {
    super();                    // usamos el contructor de la clase padre JFrame
    configurarVentana();        // configuramos la ventana
    inicializarComponentes();   // inicializamos los atributos o componentes
  }

  private void configurarVentana() {
    this.setTitle("Tercer parcial, Programacion estructurada");// colocamos titulo a la ventana
    this.setSize(450, 260);                                 // colocamos tamanio a la ventana (ancho, alto)
    this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
    this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
    this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
  }

  private void inicializarComponentes() {
    // creamos los componentes q se visualizaran
    texto = new JLabel();
    caja = new JTextField();
    boton_aceptar = new JButton();
    boton_cancelar = new JButton();

    // configuramos los componentes
    texto.setText("Ingrese numero entero:");    // colocamos un texto a la etiqueta
    texto.setBounds(20, 70, 300, 25);           // colocamos posicion y tamanio al texto (x, y, ancho, alto)
    caja.setBounds(200, 70, 200, 25);           // colocamos posicion y tamanio a la caja (x, y, ancho, alto)
    boton_aceptar.setText("Aceptar");           // colocamos un texto al boton aceptar
    boton_aceptar.setBounds(50, 150, 150, 30);  // colocamos posicion y tamanio al boton cancelar(x, y, ancho, alto)
    boton_aceptar.addActionListener(this);      // hacemos q el boton aceptar tenga una accion y esa accion estara en esta clase
    boton_cancelar.setText("Cancelar");         // colocamos un texto al boton cancelar
    boton_cancelar.setBounds(250, 150, 150, 30);//colocamos posicion y tamanio al boton aceptar(x, y, ancho, alto)
    boton_cancelar.addActionListener(this);     // hacemos q el boton cancelar apunte a la accion cerrar la app

    // introducimos los componentes creados a la ventana
    this.add(texto);
    this.add(caja);
    this.add(boton_aceptar);
    this.add(boton_cancelar);
  }

  //@Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource()==boton_cancelar){       // preguntamos si se presiono el boton cancelar
      System.exit(0);                         // si se presiono ejecutamos la salida de la app
    }
    try {
      String nombre = caja.getText();               // obtenemos el contenido de la caja de texto
      int result = Integer.parseInt(nombre);        // lo obtenido se convierte en integer
      if (result==0){                               // preguntamos si es igual a cero
        JOptionPane.showMessageDialog(this, "Este es un numero neutro."); // mostramos un mensaje (numero neutro)
      } else{
        if (result>0){                              // preguntamos se es mayor a cero
          JOptionPane.showMessageDialog(this, "Este es un numero positivo."); // mostramos un mensaje (numero positivo)
        } else {
          JOptionPane.showMessageDialog(this, "Este es un numero negativo."); // mostramos un mensaje (numero negativo)
        }
      }
    }
    catch (Exception x){                      // capturamos el ultimo error lanzado por la app
      JOptionPane.showMessageDialog(this, "Esto es un texto.");         // mostramos un mensaje (texto)
    }
  }
  public static void main(String[] args) {
    parcial V = new parcial();      // creamos un objeto de la clase principal llamado V por ventana
    V.setVisible(true);             // hacemos visible la ventana creada
  }
}
