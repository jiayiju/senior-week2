package com.jiayiju.senior.week2.domain;
/**
 * 
 * @ClassName: Goods 
 * @Description: Goods实体类
 * @author:jyj 
 * @date: 2019年10月14日 上午8:44:19
 */

import java.math.BigDecimal;

public class Goods {

	private Integer id;// 商品id
	private String name;// 商品名称
	private BigDecimal price;// 商品价格
	private String baifen;// 已售百分比

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getBaifen() {
		return baifen;
	}

	public void setBaifen(String baifen) {
		this.baifen = baifen;
	}

}
