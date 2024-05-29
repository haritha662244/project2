package in.ashokit.pdf;

import java.util.List;

import javax.xml.crypto.Data;

public class PdfGenerator {
public static byte[] generatePdf(List<Data> data) throws DocumentException {
    Document document = new Document();
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PdfWriter.getInstance(document, outputStream);
    document.open();

    for (Data item : data) {
        document.add(new Paragraph("ID: " + item.getId()));
        document.add(new Paragraph("Name: " + item.getName()));
        // Add more fields as needed
        document.add(new Paragraph("\n")); // Add some space between entries
    }

    document.close();
    return outputStream.toByteArray();
    }
}