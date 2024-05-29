
public class ExcelGenerator {

public static byte[] generateExcel(List<Data> data) throws IOException {
    try (Workbook workbook = new XSSFWorkbook()) {
        Sheet sheet = workbook.createSheet("Data");

        int rowNum = 0;
        for (Data item : data) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(item.getId());
            row.createCell(1).setCellValue(item.getName());
            // Add more columns as needed
        }

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        workbook.write(outputStream);
        return outputStream.toByteArray();
       }
    }
}