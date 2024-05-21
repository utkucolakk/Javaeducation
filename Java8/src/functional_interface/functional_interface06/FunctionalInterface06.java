package functional_interface.functional_interface06;

public class FunctionalInterface06 {
    public static void main(String[] args) {
        String inputText = "Merhaba Dünya";

        StringTransformer toUpperCaseTransformer = input -> input.toUpperCase();
        String transformedText = toUpperCaseTransformer.transfors(inputText);

        System.out.println("original text : " + inputText);
        System.out.println("Transformed text : " + transformedText);
    }
}
