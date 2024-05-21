package calcgrafi;
import javax.swing.*;
public class CalcGrafi 
{
    String ingresarNum1;
    String ingresarNum2;
    double num1 = 0;
    double num2 = 0;
    double r=0;
    
    public CalcGrafi(double num1, double num2, double r)
    {
        this.num1 = num1;
        this.num2 = num2;
        this.r = r;
    }
    
        public double suma()
    {
          ingresarNum1 = JOptionPane.showInputDialog(null, "Ingrese el primer numero", "Primer Numero", JOptionPane.INFORMATION_MESSAGE);
          this.num1=Double.parseDouble(ingresarNum1);
          ingresarNum2 =JOptionPane.showInputDialog(null, "Ingrese el segundo numero", "Segundo Numero", JOptionPane.INFORMATION_MESSAGE);
          this.num2=Double.parseDouble(ingresarNum2);
          r=num1 + num2;
          return r;
    }
    public double resta() 
    {
         ingresarNum1 = JOptionPane.showInputDialog(null, "Ingrese el primer numero", "Primer Numero", JOptionPane.INFORMATION_MESSAGE);
          this.num1=Double.parseDouble(ingresarNum1);
          ingresarNum2 = JOptionPane.showInputDialog(null, "Ingrese el segundo numero", "Segundo Numero", JOptionPane.INFORMATION_MESSAGE);
          this.num2=Double.parseDouble(ingresarNum2);
          r=num1 - num2;
          return r;
    }
    public double multiplicacion() 
    {
        ingresarNum1 = JOptionPane.showInputDialog(null, "Ingrese el primer numero", "Primer Numero", JOptionPane.INFORMATION_MESSAGE);
          this.num1=Double.parseDouble(ingresarNum1);
          ingresarNum2 = JOptionPane.showInputDialog(null, "Ingrese el segundo numero", "Segundo Numero", JOptionPane.INFORMATION_MESSAGE);
          this.num2=Double.parseDouble(ingresarNum2);
          r=num1 * num2;
          return r;
    }
   public double division() 
    {
        ingresarNum1 = JOptionPane.showInputDialog(null, "Ingrese el primer numero", "Primer Numero", JOptionPane.INFORMATION_MESSAGE);
          this.num1=Double.parseDouble(ingresarNum1);
          ingresarNum2 = JOptionPane.showInputDialog(null, "Ingrese el psegundo numero", "Segundo Numero", JOptionPane.INFORMATION_MESSAGE);
          this.num2=Double.parseDouble(ingresarNum2);
          r=num1 / num2;
          return r;
    }

    public static void main(String[] args) 
    {
        CalcGrafi calcu = new CalcGrafi (0, 0, 0);
        int opciones = Integer.parseInt(JOptionPane.showInputDialog(null,"1. Suma \n2. Resta \n3. Multiplicacion \n4. Division","\nIngrese la opcion que desee",JOptionPane.INFORMATION_MESSAGE));
        switch(opciones)
        {
            case 1:
                calcu.suma();
                JOptionPane.showMessageDialog(null, "El resultado de la suma es " + calcu.r, 
                "Respuesta Suma", JOptionPane.PLAIN_MESSAGE );
            break;
            case 2:
                calcu.resta();
                JOptionPane.showMessageDialog(null, "El resultado de la resta es " + calcu.r, 
                "Respuesta Resta", JOptionPane.PLAIN_MESSAGE );
            break;
            case 3:
                calcu.multiplicacion();
                JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es " + calcu.r, 
                "Respuesta Multiplicacion", JOptionPane.PLAIN_MESSAGE );
            break;
            case 4:
                calcu.division();
                JOptionPane.showMessageDialog(null, "El resultado de la division es " + calcu.r, 
                "Respuesta Division", JOptionPane.PLAIN_MESSAGE );
            break;
        }
    } 
}
