import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        String result = null;
        
        String num = JOptionPane.showInputDialog("Insira um número decimal (inteiro) para que seja convertido:");
        int n = Integer.parseInt(num);
        
        String base = JOptionPane.showInputDialog("Insira a base (inetiro) para qual o número será convertido:");
        int b = Integer.parseInt(base);

        while(result == null){
            result = BaseConverter.decimalToBaseX(n, b);
        }
        
        result = String.format("O número %d convertido para a base %d reulta em: %s", n, b, result);
        JOptionPane.showMessageDialog(null, result);                            
    }
}
