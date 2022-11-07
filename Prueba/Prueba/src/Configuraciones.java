import javax.swing.*;
import java.awt.*;

public class Configuraciones extends JPanel implements Runnable {
    //Configuraciones de la pantalla}
    final int ajustes= 16; //16*16
    final int escala = 3;

    final int tamaño = ajustes*escala;
    final int MaxCol = 16;    //Maximas columnas en la pantalla
    final int MaxFila= 12;    //Fila maxima

    final int anchoPantalla = tamaño*MaxCol;
    final int alturaPantalla= tamaño*MaxFila;
     Thread HiloJuego;

    public Configuraciones (){
        //vamos a establecer el tamaño del panel

        this.setPreferredSize(new Dimension(anchoPantalla,alturaPantalla));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);     //debe establecerse en verdadero.


    }
    public void HiloJuego (){
        HiloJuego = new Thread(this);
        HiloJuego.start();


    }  //El contrato general del método run es que puede realizar cualquier acción.
        ////podemos ejecutar dos o mas procesos al mismo tiempo, sin tener que esperar a que finalice un proceso
    @Override
    public void run() {
        while (HiloJuego != null) Thread.onSpinWait();

    }
    public void update () {

    }
    public void paintComponent (Graphics ChacaChacaLaMachaca){
        super.paintComponent(ChacaChacaLaMachaca);
        Graphics2D ChacaChacaLaMachaca2 = (Graphics2D) ChacaChacaLaMachaca;
        //La clase Graphics2D funciona como una extension mas sofisticada "perfecta para juegos 2D"
        ChacaChacaLaMachaca2.setColor(Color.white);  //generamos el color del primer atributo del juego
        ChacaChacaLaMachaca2.fillRect(100,100,tamaño,tamaño); //tamaño del atributo
        ChacaChacaLaMachaca2.dispose(); //Libera manualmente los recursos asociados, es decir, finaliza el proceso.



    }



}
