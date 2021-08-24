public class Operand {
         
        public String setSing(String str) throws CalculatorException{
            String operand = str.replaceAll("[^\\+\\-\\*\\/]","").trim();
            if(operand.isEmpty()){
                throw new CalculatorException("invalid operator!");
            }
            return operand;
        };
            
};

