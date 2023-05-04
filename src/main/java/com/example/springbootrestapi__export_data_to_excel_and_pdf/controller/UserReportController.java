package com.example.springbootrestapi__export_data_to_excel_and_pdf.controller;

import com.example.springbootrestapi__export_data_to_excel_and_pdf.service.UserReportService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/v1/report/user")
public class UserReportController {

    @Autowired
    UserReportService userReportService;

    @GetMapping("/pdf/all")
    public void exportToPdf(HttpServletRequest response) throws IOException{
        this.userReportService.exportToPdf(response);
    }


    @GetMapping("/excel/all")
    public void exportToExcel(HttpServletRequest response) throws IOException{
        this.userReportService.exportToExcel(response);
    }


}