package poc.wordtopdf.poi.word;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import poc.wordtopdf.poi.SampleData;

import java.io.*;
import java.nio.file.Path;
import java.util.List;

public class SampleReport {
    public static boolean generate() throws IOException {
        boolean result;
        List<SampleData> sampleDataList=SampleData.generateSampleData();

        XWPFDocument document = new XWPFDocument(new FileInputStream("C:\\Users\\smlin\\IdeaProjects\\poc.wordtopdf.poi\\SampleWordFile.docx"));
        FileOutputStream out = new FileOutputStream(new File("C:\\Users\\smlin\\IdeaProjects\\poc.wordtopdf.poi\\SampleWordFile2.docx"));
        XWPFTable table = document.getTableArray(0);

        XWPFTableRow tableRow=table.getRow(1);

        for(SampleData sampleData : sampleDataList) {
            System.out.println(String.format("Adding file, id: {}", sampleData.getId()));
            XWPFTableRow row=table.createRow();
            row.getCell(0).setText(sampleData.getId());
            row.getCell(1).setText(sampleData.getItemName());
            row.getCell(2).setText(Integer.toString(sampleData.getQuantity()));
            row.getCell(3).setText(Double.toString(sampleData.getPrice()));
            table.addRow(row);
        }
        document.write(out);
        out.close();
        result=true;
        return result;
    }
}
