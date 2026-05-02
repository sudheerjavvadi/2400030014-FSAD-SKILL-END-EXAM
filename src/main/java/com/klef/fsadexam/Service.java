package com.klef.fsadexam;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="service")
public class Service{

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;

private String name;

private String status;

@Temporal(TemporalType.DATE)
private Date date;

public Service(){}

public Service(String name,String status,Date date){
this.name=name;
this.status=status;
this.date=date;
}



public int getId(){
return id;
}

public void setId(int id){
this.id=id;
}

public String getName(){
return name;
}

public void setName(String name){
this.name=name;
}

public String getStatus(){
return status;
}

public void setStatus(String status){
this.status=status;
}

public Date getDate(){
return date;
}

public void setDate(Date date){
this.date=date;
}

}