package com.mycompany.ejercicio1;

import java.time.LocalDate;

public class Product {
  private int idProducto;
  private String productName;
  private Category category;
  private LocalDate expirationDate;
  private float price;
  private Supplier supplier;
  
  public Product(int idProducto, String productName, Category category, LocalDate expirationDate, float price,
      Supplier supplier) {
    this.idProducto = idProducto;
    this.productName = productName;
    this.category = category;
    this.expirationDate = expirationDate;
    this.price = price;
    this.supplier = supplier;
    System.out.println("Producto creado!");
  }

  public int getIdProducto() {
    return idProducto;
  }

  public void setIdProducto(int idProducto) {
    this.idProducto = idProducto;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }

  public LocalDate getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(LocalDate expirationDate) {
    this.expirationDate = expirationDate;
  }

  public float getPrice() {
    return price;
  }

  public void setPrice(float price) {
    this.price = price;
  }

  public Supplier getSupplier() {
    return supplier;
  }

  public void setSupplier(Supplier supplier) {
    this.supplier = supplier;
  }
@Override

public String toString(){
  return 
        "Ref: "+getIdProducto()+
        "Producto: "+getProductName()+"\n"+
        "Fecha Caducidad: "+getExpirationDate()+"\n"+
        "Precio: "+getPrice()+"€"+"\n"+
        "Proveedor: "+getSupplier()+"\n";
}
  
}
