import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        // String result = null;
        // int b = 0;

        // String num = JOptionPane.showInputDialog("Insira um número decimal (inteiro) para que seja convertido:");
        // int n = Integer.parseInt(num);
        
        // while(result == null){
        //     String base = JOptionPane.showInputDialog("Insira a base (inetiro entre 2 e 36) para qual o número será convertido:");
        //     b = Integer.parseInt(base);
        //     result = BaseConverter.decimalToBaseX(n, b);

        //     if(result == null)
        //         JOptionPane.showMessageDialog(null, "Opção invalálida");
        // }
        
        // result = String.format("O número %d convertido para a base %d reulta em: %s", n, b, result);
        // JOptionPane.showMessageDialog(null, result);

        String n = "10000";

        String enc = BaseConverter.baseXToBaseY(n, 10, 36);
        System.out.println(enc);
        String des = BaseConverter.baseXToBaseY(enc, 36, 10);
        System.out.println(des); 
       
    }
}
