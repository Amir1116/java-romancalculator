import java.util.Arrays;

public class ArabicNumber extends Number {
    //validation 
    public boolean validationArabicDigits(String [] numbers){
        boolean out = false;
        String[] arabicDigits = {"1","2","3","4","5","6","7","8","9","10"};
        byte countTrue = 0;
        for(String number: numbers){
            boolean arabic = Arrays.stream(arabicDigits).anyMatch(number::equals);
            if(arabic){
                countTrue+=1;
            }
        }
        if(countTrue == numbers.length){
            out = true;
        }
        return out;
    }

    //set int array
    public int[] getIntArray(String[] arr){
        int[] output = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            output[i] = Integer.parseInt(arr[i]);
        }
        return output;
    }
    // convert to roman

    public String convertingArabicToRoman(int res) throws CalculatorException{
        if(res<1){
            throw new CalculatorException("invalid result!");
        }
        String outNum = "";
        String[] romanDigit = {"","I","II","III","IV","V","VI","VII","VIII","IX",
        "","X","XX","XXX","XL","L","LX","LXX","LXXX","XC",
        "","C","CC","CCC","CD","D","DC","DCC","DCCC","CM",
                                }; 
       String[] strNum = Integer.toString(res).split("");   

       int countLoop = 10;
       for(int i = strNum.length-1; i >=0; i--){
            int intOfchar = 10 - Integer.parseInt(strNum[i]);
            int  index = countLoop-intOfchar;
            outNum = romanDigit[index] + outNum; 
            countLoop+=10;
       } 
        return outNum; 
    }
    //convert to string
    static String convertToString(int number){
        String strNum = String.valueOf(number);
        return strNum;
    }
}
