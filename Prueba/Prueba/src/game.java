import javax.swing.*;

public class game  {
    public static void main(String[] args) {

        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.setTitle("After the journey");

        Configuraciones configuraciones = new Configuraciones();
        ventana.add(configuraciones);

        ventana.pack();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);

        configuraciones.HiloJuego();



    }
    }



