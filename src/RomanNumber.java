import java.util.Arrays;

public class RomanNumber {
    // validation
    public boolean validationRomanDigits(String[] romNum){
        boolean out = false;
        String[] romanDigits = {"I", "II", "III","IV","V","VI","VII","VIII","IX","X"};
        byte countTrue = 0;
        for(String digit: romNum){
            boolean roman = Arrays.stream(romanDigits).anyMatch(digit::equals);
            if(roman){
                countTrue+=1;
            }
        }
        if(countTrue == romNum.length){
            out = true;
        }
        return out;
    }
    //convert to arabic
    public int[] convertRomanToArabic(String[] roman)throws CalculatorException{
        String[] romanDigits = {"","I","II","III","IV","V","VI","VII","VIII","IX","x"};
        int[] intRoman = {0,0};
        for(int i = 0; i<roman.length;i++){
        
            String digit = roman[i];
            if(Arrays.stream(romanDigits).anyMatch(digit::equals)&& digit!=""){
                intRoman[i] = Arrays.asList(romanDigits).indexOf(digit);                 
            }else{
                throw new CalculatorException("invalid romanNumeric!");
            }

        } 
        return intRoman;
    } 
}
