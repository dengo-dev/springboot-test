package com.apple.shop;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Work {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  public int id;
  public String 글제목;
  public String 날짜;


}
