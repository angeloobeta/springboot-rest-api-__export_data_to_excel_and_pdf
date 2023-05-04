package com.example.springbootrestapi__export_data_to_excel_and_pdf.service;


import com.example.springbootrestapi__export_data_to_excel_and_pdf.repositrory.UserReportRepository;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class UserReportService {

    @Autowired
    UserExportToPdfService userExportToPdfService;

    @Autowired
    UserExportToExcelService userExportToExcelService;

    @Autowired
    UserReportRepository userReportRepository;


    public void exportToPdf(HttpServletRequest response) throws IOException {
        // get all user
        List<UserDTO> data = userReportRepository.getUserList();

        // export to pdf
        userExportToPdfService.exportToPdf(response, data);
    }

    public void exportToExcel(HttpServletRequest response)  throws  IOException{
        // get all user
        List<UserDTO> data = userReportRepository.getUserList();

        // export to excel
        userExportToExcelService.exportToExcel(response, data);
    }
}