package aplicacion;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Coche implements Serializable,Comparable{
	private String Mat;
	private String marca;
	private String modelo;
	private String color;
	private Integer kms;
	private LocalDate fechaMat;
	
	@Override
	public boolean equals(Object obj) {
		return Mat.equals(((Coche)obj).Mat);
	}
	public Coche(String mat, String marca, String modelo, String color, Integer kms, String fechaMat) {
		Mat = mat;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.kms = kms;
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.fechaMat = LocalDate.parse(fechaMat,f);
	}
	public Coche(String mat2) {
		this.Mat=mat2;
	}
	@Override
	public String toString() {
		return "Coche [Mat=" + Mat + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", kilometraje=" + kms
				+ ", fechaMatriculacion=" + fechaMat + "]\n";
	}
	public String getMat() {
		return Mat;
	}
	public void setMat(String mat) {
		Mat = mat;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getKms() {
		return kms;
	}
	public void setKms(Integer kms) {
		this.kms = kms;
	}
	public LocalDate getFechaMat() {
		return fechaMat;
	}
	public void setFechaMat(LocalDate fechaMat) {
		this.fechaMat = fechaMat;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return this.Mat.compareTo(((Coche)o).Mat);
	}
	
	
}
