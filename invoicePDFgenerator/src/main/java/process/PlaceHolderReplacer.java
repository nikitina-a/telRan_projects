package process;

import process.DocxReader;

import java.io.FileNotFoundException;
import java.util.Map;

public interface PlaceHolderReplacer {

    void replacePlaceholders(Map<String, String> map, DocxReader docxReader) throws FileNotFoundException;

}
