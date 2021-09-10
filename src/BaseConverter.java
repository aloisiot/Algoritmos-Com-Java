import java.util.Stack;

/**
 * Classe para conversão de bases numéricas
 */
public class BaseConverter {

    static final String DIGITS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
    /**
     * Converte um decima para seu equivalente em qualquer base entre 2 e 36.
     * @param num Decimal a ser convertido.
     * @param base Base numérica para a qual o decimal será convertido.
     * @return String contendo o resultado da conversão na base desejada.
     */
    public static String decimalToBaseX(long number, int base){

        double num = (double) number;
        Stack<Integer> stack = new Stack<>();
        String result = "";
        double rem = 0;

        if( base  < 2 || 36 < base){
            return null;
        }

        while(num != 0){

            rem = Math.floor( num % Double.valueOf(base));
            num = Math.floor(num /base);
            stack.push((int) rem);

        }

        while(!stack.isEmpty()){
            result += DIGITS.charAt((int) stack.pop());
        }


        return result;
    }

    /**
     * Converte um número de qualquer base entre base 2 e base 36 para seu decima equivalente.
     * @param number Número representado na base X a ser convertido para decimal.
     * @param base Base em que se aapresenta o número a ser convertido.
     * @return Decimal inteiro resultante da conversão.
     */
    public static long baseXToDecimal(String number, int base){

        long result = 0;
        String num = "";

        if( base  < 2 || 36 < base){
            return 0;
        }

        for(int i = number.length() - 1; i >= 0; i--){
            num += number.charAt(i);
        }


        String.valueOf(number);
        
        for(int importace = 0; importace < num.length();importace++){
            
            for(int decimalValue = 0; decimalValue < DIGITS.length(); decimalValue++){
            
                if(num.charAt(importace) == DIGITS.charAt(decimalValue))
                    result += decimalValue * Math.pow(base, importace);

            }
        }

        return result;
    }

    /**
     * Converte um número representado em uma base X para seu equivalente em uma base Y 
     * (As bases numéricas devem respeitar o intervalo entre 2 e 36).
     * @param number Número inteiro representado em uma base X a ser convertido para o equivalente em uma base Y.
     * @param baseX Base numérica do inteiro a ser convertido.
     * @param baseY Base numérica para a qual o número será convertido.
     * @return String contendo o  resultado da conversão.
     */
    public static String baseXToBaseY(String number, int baseX, int baseY){

        long decimal = baseXToDecimal(number, baseX);
        String result = decimalToBaseX(decimal, baseY);

        if( baseX  < 2 || baseY < 2 || 36 < baseX || 36 < baseY){
            return null;
        }

        return result;
    }
}
