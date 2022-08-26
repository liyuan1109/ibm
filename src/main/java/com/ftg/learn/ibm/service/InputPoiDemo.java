package com.ftg.learn.ibm.service;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class InputPoiDemo {
    //Excel数据导出
    public static void main(String[] args) {
        //创建文件，并指定路径
        File file=new File("C:\\Excel\\poi_demo.xlsx");
        try {
            //创建该文件的输入流
            FileInputStream stream=new FileInputStream(file);
            //创建工作簿
            XSSFWorkbook workbook=new XSSFWorkbook(stream);
            //获取一个工作表，下标从0开始
            XSSFSheet sheet=workbook.getSheetAt(0);
            //获取表格总行数
            int rowNumber=sheet.getPhysicalNumberOfRows();
            int num=sheet.getRow(1).getLastCellNum();
            System.out.println(num);
            String[] val=new String[num];
            //通过循环，逐层取出表中每行的数据
            for (int i = 0; i <rowNumber ; i++) {
                //获取行中列的数据
                XSSFRow row= sheet.getRow(i);
                for (int j = 0; j < num; j++) {
                    if (row!=null){
                        val[j]=row.getCell(i).getStringCellValue();
                    }
                }

                //循环结束，关闭流

            }
            stream.close();
            for (String s : val) {
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
