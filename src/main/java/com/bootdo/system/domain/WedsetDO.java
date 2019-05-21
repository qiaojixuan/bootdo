package com.bootdo.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-05-20 16:09:42
 */
public class WedsetDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//网站名称
	private String title;
	//关键字
	private String keyword;
	//描述
	private String describe;
	//客服电话
	private String telephone;
	//邮箱
	private String mailbox;
	//备案号
	private String number;
	//版权
	private String copyright;

	private String viewVersionAndBaknum;

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getViewVersionAndBaknum() {
		return copyright+" 版权所有 "+number;
	}

	public void setViewVersionAndBaknum(String viewVersionAndBaknum) {
		this.viewVersionAndBaknum = viewVersionAndBaknum;
	}

	/**
	 * 设置：
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：网站名称
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 获取：网站名称
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * 设置：关键字
	 */
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	/**
	 * 获取：关键字
	 */
	public String getKeyword() {
		return keyword;
	}
	/**
	 * 设置：描述
	 */
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	/**
	 * 获取：描述
	 */
	public String getDescribe() {
		return describe;
	}
	/**
	 * 设置：客服电话
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	/**
	 * 获取：客服电话
	 */
	public String getTelephone() {
		return telephone;
	}
	/**
	 * 设置：邮箱
	 */
	public void setMailbox(String mailbox) {
		this.mailbox = mailbox;
	}
	/**
	 * 获取：邮箱
	 */
	public String getMailbox() {
		return mailbox;
	}
	/**
	 * 设置：备案号
	 */
	public void setNumber(String number) {
		this.number = number;
	}
	/**
	 * 获取：备案号
	 */
	public String getNumber() {
		return number;
	}
	/**
	 * 设置：版权
	 */
	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}
	/**
	 * 获取：版权
	 */
	public String getCopyright() {
		return copyright;
	}
}
