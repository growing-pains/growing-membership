package com.excel.kgh.download;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class ExcelController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/excel/download")
    public void excelDownload(HttpServletResponse response) throws IOException {
//        Workbook wb = new HSSFWorkbook();
        Workbook wb = new XSSFWorkbook();
        Sheet sheet = wb.createSheet("EXCEL NAME");
        Row row = null;
        Cell cell = null;
        int rowNum = 0;

        for(int i=0; i<3; i++){
            row = sheet.createRow(rowNum++);
            cell = row.createCell(0);
            cell.setCellValue("");

            cell = row.createCell(1);
            cell.setCellValue("");

            cell = row.createCell(2);
            cell.setCellValue("");

            cell = row.createCell(3);
            cell.setCellValue("");
            cell = row.createCell(4);
            cell.setCellValue("");

            cell = row.createCell(5);
            cell.setCellValue("");
            cell = row.createCell(6);
            cell.setCellValue("");

            cell = row.createCell(7);
            cell.setCellValue("");
            cell = row.createCell(8);
            cell.setCellValue("");

            cell = row.createCell(9);
            cell.setCellValue("");

            cell = row.createCell(10);
            cell.setCellValue("");

            cell = row.createCell(11);
            cell.setCellValue("");
            cell = row.createCell(12);
            cell.setCellValue("");

            cell = row.createCell(13);
            cell.setCellValue("");
            cell = row.createCell(14);
            cell.setCellValue("");
        }

        // Header
        row = sheet.createRow(rowNum++);
        cell = row.createCell(0);
        cell.setCellValue("");

        cell = row.createCell(1);
        cell.setCellValue("귀속년월");

        cell = row.createCell(2);
        cell.setCellValue("지급년월일");

        cell = row.createCell(3);
        cell.setCellValue("소득자명");
        cell = row.createCell(4);
        cell.setCellValue("주민등록번호");

        cell = row.createCell(5);
        cell.setCellValue("기본주소");
        cell = row.createCell(6);
        cell.setCellValue("상세주소");

        cell = row.createCell(7);
        cell.setCellValue("소득구분");
        cell = row.createCell(8);
        cell.setCellValue("영수일자");

        cell = row.createCell(9);
        cell.setCellValue("지급총액");

        cell = row.createCell(10);
        cell.setCellValue("세율(%)");

        cell = row.createCell(11);
        cell.setCellValue("소득세");
        cell = row.createCell(12);
        cell.setCellValue("지방소득세(%)");

        cell = row.createCell(13);
        cell.setCellValue("내.외국인구분");
        cell = row.createCell(14);
        cell.setCellValue("연말정산");
        // Body

        for (int i=0; i<10; i++) {
            row = sheet.createRow(rowNum++);

            for(int j=0; j<15; j++){
                cell = row.createCell(j);
                if(j==0){
                    cell.setCellValue(i+1);
                }else {
                    cell.setCellValue(i + " ");
                }

            }

        }

        // 컨텐츠 타입과 파일명 지정
        response.setContentType("ms-vnd/excel");
//        response.setHeader("Content-Disposition", "attachment;filename=example.xls");
        response.setHeader("Content-Disposition", "attachment;filename=example.xlsx");

        // Excel File Output
        wb.write(response.getOutputStream());
        wb.close();
    }
}
