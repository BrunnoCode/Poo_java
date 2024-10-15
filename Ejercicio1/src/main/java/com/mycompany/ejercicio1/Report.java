package com.mycompany.ejercicio1;

import java.time.LocalDate;

public class Report {
  private int idReport;
  private int idUserReport;
  private String reportMessage;
  private LocalDate reportDate;


  public int getIdReport() {
    return idReport;
  }
  public void setIdReport(int idReport) {
    this.idReport = idReport;
  }
  public int getIdUserReport() {
    return idUserReport;
  }
  public void setIdUserReport(int idUserReport) {
    this.idUserReport = idUserReport;
  }
  public String getReportMessage() {
    return reportMessage;
  }
  public void setReportMessage(String reportMessage) {
    this.reportMessage = reportMessage;
  }

  public LocalDate getReportDate() {
    return reportDate;
  }
  public void setReportDate(LocalDate reportDate) {
    this.reportDate = reportDate;
  }
  
  
  @Override

  public String toString(){
    return
          "Ref reporte: "+getIdReport()+"\n"+
          "Usuario Emisor: "+getIdUserReport()+"\n"+
          "Fecha reporte: "+getReportDate()+"\n"+
          "Mensaje reportada: "+"\n-------------------------------------"+getReportMessage()+
          "\n-------------------------------------";
  }
  

}
