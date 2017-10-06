package niit.model;

import java.io.Serializable;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Product implements Serializable{
@Id
int pId,stock,price,cId;
String pName,pDesc;
public int getpId() {
	return pId;
}
public void setpId(int pId) {
	this.pId = pId;
}
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getcId() {
	return cId;
}
public void setcId(int cId) {
	this.cId = cId;
}
public String getpName() {
	return pName;
}
public void setpName(String pName) {
	this.pName = pName;
}
public String getpDesc() {
	return pDesc;
}
public void setpDesc(String pDesc) {
	this.pDesc = pDesc;
}

}
