import java.util.Stack;

/**
 * Classe para conversão de bases numéricas
 */
public class BaseConverter {
    
    /**
     * Converte um decima para qualquer base entre 2 e 36
     * @param num Decimal a ser convertido
     * @param base Base numérica para a qual o decimal será convertido
     * @return String contendo o resultado da conversão na base desejada
     */
    public static String decimalToBaseX(int num, int base){

        double number = (double) num;
        Stack<Integer> stack = new Stack<>();
        String result = "";
        double rem = 0;
        String digits = "0123456789ABCDEFGHJKLMNOPQRSTUVWXYZ";

        if( base  < 2 || 36 < base){
            return null;
        }

        while(number != 0){

            rem = Math.floor( number % Double.valueOf(base));
            number = Math.floor(number /base);
            stack.push((int) rem);

        }

        while(!stack.isEmpty()){
            result += digits.charAt((int) stack.pop());
        }


        return result;
    }
}
