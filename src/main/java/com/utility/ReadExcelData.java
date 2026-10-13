package com.utility;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;

public class ReadExcelData {

    public static String getParticularData(int rowIndex, int cellIndex) {

        String data = null;
        try {
            File file = new File("C:\\Users\\NARESH\\Downloads\\DataDriven_IPT.xlsx");
            Workbook book = new XSSFWorkbook(file);
            Sheet sheet = book.getSheet("Sheet1");
            Row row = sheet.getRow(rowIndex);
            Cell cell = row.getCell(cellIndex);
            //DataFormater is used to convert values of data in string format.
            DataFormatter dataFormatter = new DataFormatter();
            data = dataFormatter.formatCellValue(cell);
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return data;
    }

    public static void getAllData(){
        try {
            File file = new File("C:\\Users\\NARESH\\Downloads\\DataDriven_IPT.xlsx");
            Workbook book = new XSSFWorkbook(file);
            Sheet sheet = book.getSheet("Sheet1");

            int lastRowCount = sheet.getLastRowNum();
            System.out.println("Last Row Number: " + lastRowCount);

            short lastCellCount = sheet.getRow(0).getLastCellNum();
            System.out.println("Last Row Count: " + lastCellCount);

            for(int i=0; i<=lastRowCount; i++){
                Row row = sheet.getRow(i);
                for(int j=0; j<lastCellCount; j++){
                    Cell cell = row.getCell(j);
                    DataFormatter dataFormatter = new DataFormatter();
                    String data = dataFormatter.formatCellValue(cell);
                    System.out.println(data);
                }
                System.out.println();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        getAllData();
    }
}
