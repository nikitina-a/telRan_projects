package process;

import lombok.Getter;

import model.MyData;
import model.UtilDataParser;

import java.io.FileOutputStream;
import java.io.IOException;

@Getter
public class FileWriter {
    private final String outPath = "C:/telRan_projects/invoicePDFgenerator/src/main/resources/invoice.docx";


    public void generateNewDocxFile() throws IOException {
        DocxReader docxReader = new DocxReader();
        var map = new UtilDataParser().getMap(new MyData());

        ReplacingFactory.replacePlaceholders(new ParagraphReplacement(), docxReader, map);
        ReplacingFactory.replacePlaceholders(new TableReplacement(), docxReader, map);

        final FileOutputStream out = new FileOutputStream(outPath);
        docxReader.getDocx().write(out);
        out.close();
        docxReader.getXWPFDocument().close();
    }
}
