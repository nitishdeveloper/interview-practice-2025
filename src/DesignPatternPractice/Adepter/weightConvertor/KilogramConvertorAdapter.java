package DesignPatternPractice.Adepter.weightConvertor;

public class KilogramConvertorAdapter implements KilogramConvertor {
    private final PoundConvertorAdaptee poundConvertorAdaptee;

    public KilogramConvertorAdapter(PoundConvertorAdaptee poundConvertorAdaptee) {
        this.poundConvertorAdaptee = poundConvertorAdaptee;
    }

    @Override
    public double convertToKilogram(double weightInPounds) {
        return weightInPounds / poundConvertorAdaptee.getPoundToKgConversionFactor();
    }
}
