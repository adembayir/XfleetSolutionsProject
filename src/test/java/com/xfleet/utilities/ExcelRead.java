package com.xfleet.utilities;

import com.github.javafaker.Faker;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class ExcelRead {


    public static String getRandomValidUsername() {

        Faker faker = new Faker();
        String result = null;

        String path = "XFleetTestData.xlsx";
        XSSFWorkbook workbook = null;
        try {
            workbook = new XSSFWorkbook(path);
            XSSFSheet sheet = workbook.getSheet("Sayfa1");

            int rowNum = faker.number().numberBetween(3, 27);
            int cellNum = faker.number().numberBetween(2, 11);

            XSSFCell cell = sheet.getRow(rowNum).getCell(cellNum);

            result =  "" + cell;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;

    }
}
