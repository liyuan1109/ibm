package com.ftg.learn.ibm.service;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutPoidemo {
    //Excel数据导出
    public static void main(String[] args) {
        //创建工作簿类
        XSSFWorkbook workbook=new XSSFWorkbook();
        //创建工作表并设置表名
        XSSFSheet sheet=workbook.createSheet("学生信息");
        //创建行，下标从0开始
        XSSFRow row=sheet.createRow(0);
        //在行中创建列并赋值，下标从0开始
        row.createCell(0).setCellValue("学号");
        row.createCell(1).setCellValue("姓名");
        row.createCell(2).setCellValue("专业");
        row.createCell(3).setCellValue("班级");

        row=sheet.createRow(1);
        row.createCell(0).setCellValue("201905240129");
        row.createCell(1).setCellValue("李元");
        row.createCell(2).setCellValue("电信");
        row.createCell(3).setCellValue("电信1901");

        //设置Excel文件路径
        File file=new File("C:\\Excel\\poi_demo.xlsx");


        try {
            //创建指向该路径的输出流
            FileOutputStream stream=new FileOutputStream(file);
            //将数据导出到Excel表格
            workbook.write(stream);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
