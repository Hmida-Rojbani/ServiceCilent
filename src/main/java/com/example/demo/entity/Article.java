package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor @NoArgsConstructor @ToString
public class Article {
   /* 
    private String id;
    private String name;
    private double price;
    private String pathImage ;
    */
	private String idArt;
	private String imageName ;
	private String designtationArt;
	private String descriptionArt;
	private  double prixArt;
	private int qteStockArt;
	private double tauxRemiseArt;

}
