package process;

import lombok.Getter;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@Getter

public class DocxReader {
    private final String filePath = "src/main/resources/invoice_telran.docx";
    private XWPFDocument docx;

    public DocxReader() {
        docx = getXWPFDocument();
    }


    public XWPFDocument getXWPFDocument() {
        try {
            File file = new File(filePath);
            FileInputStream fis = new FileInputStream(file.getAbsolutePath());
            docx = new XWPFDocument(fis);
            return docx;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
