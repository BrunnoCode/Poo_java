package com.mycompany.ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Notification {
  private int idNotification;
  private String notificationMatter;
  private String notification;
  private LocalDate notificationDate;
  private int userIdentified;
  
  private List<String> historyNotification = new ArrayList<>();
  
  public int getIdNotification() {
    return idNotification;
  }
  public void setIdNotification(int idNotification) {
    this.idNotification = idNotification;
  }
  public String getNotificationMatter() {
    return notificationMatter;
  }
  public void setNotificationMatter(String notificationMatter) {
    this.notificationMatter = notificationMatter;
  }
  public String getNotification() {
    return notification;
  }
  public void setNotification(String notification) {
    this.notification = notification;
  }
  public LocalDate getNotificationDate() {
    return notificationDate;
  }
  public void setNotificationDate(LocalDate notificationDate) {
    this.notificationDate = notificationDate;
  }
  public List<String> getHistoryNotification() {
    return historyNotification;
  }
  public void setHistoryNotification(List<String> historyNotification) {
    this.historyNotification = historyNotification;
  }
  
  
  public int getUserIdentified() {
    return userIdentified;
  }
  public void setUserIdentified(int userIdentified) {
    this.userIdentified = userIdentified;
  }

  @Override

  public String toString(){
    return
          "Ref Notificación: "+getIdNotification()+
          "Usuario Notificado"+getUserIdentified()+
          "Asunto Notificación: "+getNotificationMatter()+"\n"+
          "Notifica: \n--------------------------------------------------"+getNotification()+"--------------------------------------------------\n"+
          "Fecha: "+getNotificationDate()+"\n";
  }
}
