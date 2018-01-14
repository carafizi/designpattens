package test;

public class UserInput {

    public static class TextInput {
        protected String val = "";
        public void add(char input){
            if(Character.isAlphabetic(input)) {
                val = val + input;
            }
        }
        public String getValue(){
            return this.val;
        }
    }

    public static class NumericInput extends TextInput{
        @Override
        public void add(char input){
            if(Character.isDigit(input)) {
                val = val + input;
            }
        }
    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}