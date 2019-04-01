package com.bootcamp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_BIODATA")
public class Biodata {
	
	@Id
	@Column(name="NIM", length=10, nullable=false)
	private String nim;
	
	@Column(name="NAMA", length=100, nullable=false)
	private String nama;
	
	@Column(name="ALAMAT", length=100)
	private String alamat;
	
	@Column(name="JURUSAN", length=100)
	private String jurusan;
	
	@Column(name="DOB")
	@Temporal(TemporalType.DATE)
	private Date tanggalLahir;
	
	@Column(name="TELP", length=20)
	private String telp;
	
	@Column(name="EMAIL", length=50)
	private String email;
	
	public String getNim() {
		return nim;
	}
	public void setNim(String nim) {
		this.nim = nim;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public String getJurusan() {
		return jurusan;
	}
	public void setJurusan(String jurusan) {
		this.jurusan = jurusan;
	}
	public Date getTanggalLahir() {
		return tanggalLahir;
	}
	public void setTanggalLahir(Date tanggalLahir) {
		this.tanggalLahir = tanggalLahir;
	}
	public String getTelp() {
		return telp;
	}
	public void setTelp(String telp) {
		this.telp = telp;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
