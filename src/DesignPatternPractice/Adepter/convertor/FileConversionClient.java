package DesignPatternPractice.Adepter.convertor;

public class FileConversionClient {
    public static void main(String[] args) {
        XmlConvertorAdapter xmlConvertorAdapter = new XmlConvertorAdapter(new XmlConvertor());
        xmlConvertorAdapter.convert("dummy.xml", "newJson.json");
    }
}
