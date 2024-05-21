import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcGraf extends javax.swing.JFrame 
{
    private JTextField display;
    private double num1, num2;
    private char operacion;

    public CalcGraf() 
    {
        initComponents();
        setTitle("Calculadora");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        display = new JTextField();
        display.setPreferredSize(new Dimension(display.getWidth(), 100));
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel(new GridLayout(4, 4));
        String[] botones = {"7", "8", "9", "/", "C",
                            "4", "5", "6", "*", "<-",
                            "1", "2", "3", "-","%",
                            " ", "0", ".", "+", "="};

        for (String boton : botones) 
        {
            JButton btn = new JButton(boton);
            if (boton.matches("[0-9., ]")) {
                btn.setBackground(Color.DARK_GRAY);
                btn.setForeground(Color.WHITE);
            } else {
                btn.setBackground(Color.LIGHT_GRAY);
                btn.setForeground(Color.BLACK); // Color del texto en blanco
            }
            btn.addActionListener((ActionEvent e) -> {
                String texto = display.getText();
                if (e.getActionCommand().equals("=")) 
                {
                    num2 = Double.parseDouble(texto);
                    double resultado = calcular(); 
                    display.setText(String.valueOf(resultado));
                } else if (e.getActionCommand().equals("<-"))
                {
                    if (!texto.isEmpty())
                    {
                        display.setText(texto.substring(0, texto.length() - 1));
                    }
                }else if (e.getActionCommand().equals("C"))
                {
                    display.setText("");
                } else if (e.getActionCommand().matches("[0-9.]"))
                {
                    display.setText(texto + e.getActionCommand());
                } else
                {
                    num1 = Double.parseDouble(texto);
                    operacion = e.getActionCommand().charAt(0);
                    display.setText("");
                }
            });
            panel.add(btn);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
   }
    private double calcular() 
    {
          switch (operacion) 
          {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            case '%':
                return (num1 * num2)/100;
            default:
                return 0;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        
    public static void main(String args[]) 
    {
        SwingUtilities.invokeLater(() -> new CalcGraf());
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new CalcGraf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    // End of variables declaration                   
}
