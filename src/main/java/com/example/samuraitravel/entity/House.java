package com.example.samuraitravel.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "houses")//対応づけるテーブル名を指定
@Data//ゲッターやセッターなどを自動生成
public class House {
	@Id//フィールドを主キーに指定
	@GeneratedValue(strategy = GenerationType.IDENTITY)//主キーにつける、データの作成時や更新時にidが自動採番される
	@Column(name = "id")//対応づけるカラム名を指定
	private Integer id;

	@Column(name = "name")
	private String name;

	@Column(name = "image_name")
	private String imageName;

	@Column(name = "description")
	private String description;

	@Column(name = "price")
	private Integer price;

	@Column(name = "capacity")
	private Integer capacity;

	@Column(name = "postal_code")
	private String postalCode;

	@Column(name = "address")
	private String address;

	@Column(name = "phone_number")
	private String phoneNumber;

	@Column(name = "created_at", insertable = false, updatable = false)//falseに設定で、カラムに挿入or更新する値の管理をDB側に任せられる
	private Timestamp createdAt;

	@Column(name = "updated_at", insertable = false, updatable = false)//falseに設定で、カラムに挿入or更新する値の管理をDB側に任せられる
	private Timestamp updatedAt;
}
