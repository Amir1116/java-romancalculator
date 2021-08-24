public class Number {
    // get string array of number's values  
    public String[] getNumber(String input) throws CalculatorException{
        
        String sep = "[\\+\\-\\*\\/]";        
        String[] numbersInput = input.split(sep);
        if(numbersInput.length != 2){
            throw new CalculatorException("invalid input!");
        } else {
            String[] numbersOut = new String [2]; 
            for(int i = 0;i<numbersInput.length;i++){
            numbersOut[i] = numbersInput[i].trim();
            }
            return numbersOut;
        }
    };
     
}
