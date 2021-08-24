import java.util.*;

public class Calculator {
    public static void main(String[] args) throws CalculatorException {
        System.out.println("enter your example");
        String value = getInputValue();
        String[] arrNumbers = new Number().getNumber(value);
        Operand operand = new Operand();
        ArabicNumber arabic = new ArabicNumber();
        RomanNumber roman = new RomanNumber();
        boolean isArabic = arabic.validationArabicDigits(arrNumbers);
        boolean isRoman = roman.validationRomanDigits(arrNumbers);
        String sign = operand.setSing(value);
        if(isArabic){
            int[] inArr = arabic.getIntArray(arrNumbers);
            int res = getResult(inArr,sign);
            String resString = arabic.convertToString(res);
            printResult(resString);
        };
        if(isRoman){
            int[] romanInt = roman.convertRomanToArabic(arrNumbers);
            int res = getResult(romanInt, sign);
            String resString = arabic.convertingArabicToRoman(res);
            printResult(resString); 
        }
        if(!isArabic&&!isRoman){
            throw new CalculatorException("invalid input!");
              
    }
    
    }
    //get input value class Calculator
    static String getInputValue(){
        Scanner scanner = new Scanner(System.in);
        String inputValue = scanner.nextLine();
        scanner.close();
        return inputValue;
    }

    // math operations class Calculator
    static int getSum(int num1, int num2){
        int res = num1+num2;
        return res;
    } 

    static int getSubraction(int num1, int num2){
        int res = num1 - num2;
        return res;
    }

    static int getMultiple(int num1, int num2){
        int res = num1*num2;
        return res;
    }
    
    static int getDivide(int num1, int num2){
        int res = num1/num2;
        return res;
    }

    // get result class Calculator
    static int getResult(int[] digits, String operand){
        double res = 0;

        switch(operand){
            case "+":res = getSum(digits[0], digits[1]);
            break;
            case "-":res = getSubraction(digits[0], digits[1]);
            break;
            case "*": res = getMultiple(digits[0], digits[1]);
            break;
            case "/": res = getDivide(digits[0], digits[1]);
            break;
            default: res=0;
        }

        int out = (int)res;
        return out;
    }

    static void printResult(String out){
        System.out.println("your result");
        System.out.println(out);
    }

}
