package com.bitrix.Test;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class ExcelRead {
    public static void main(String[] args) throws Exception, NullPointerException  {

        File file = new File("src/Bank.xlsx");
        System.out.println(file.exists());
//TODO: create a logic
        FileInputStream fileInputStream = new FileInputStream(file);
        XSSFWorkbook workbook =new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("qwerty");
        System.out.println(sheet.getRow(2).getCell(1));
    }
}
