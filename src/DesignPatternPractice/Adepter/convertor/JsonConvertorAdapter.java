package DesignPatternPractice.Adepter.convertor;

public class JsonConvertorAdapter implements FileConvertor {
    private final JsonConvertor jsonConvertor;

    public JsonConvertorAdapter(JsonConvertor jsonConvertor) {
        this.jsonConvertor = jsonConvertor;
    }

    @Override
    public void convert(String inputPath, String outputPath) {
        jsonConvertor.convertJsonToXML(inputPath, outputPath);
    }
}

