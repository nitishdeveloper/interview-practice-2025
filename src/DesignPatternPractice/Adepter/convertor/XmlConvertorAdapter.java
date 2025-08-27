package DesignPatternPractice.Adepter.convertor;

public class XmlConvertorAdapter implements FileConvertor {
    private final XmlConvertor xmlConvertor;

    public XmlConvertorAdapter(XmlConvertor xmlConvertor) {
        this.xmlConvertor = xmlConvertor;
    }

    @Override
    public void convert(String inputPath, String outputPath) {
        xmlConvertor.convertXmlToJson(inputPath, outputPath);
    }
}
