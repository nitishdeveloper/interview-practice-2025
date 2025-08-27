package DesignPatternPractice.Adepter.weightConvertor;

public class WeightConvertorMachine {
    public static void main(String[] args) {
        KilogramConvertorAdapter kilogramConvertorAdapter = new KilogramConvertorAdapter(new PoundConvertorAdaptee());
        System.out.println(kilogramConvertorAdapter.convertToKilogram(180));
    }
}
