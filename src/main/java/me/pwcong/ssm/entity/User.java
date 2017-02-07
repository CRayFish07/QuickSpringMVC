package me.pwcong.ssm.entity;

import java.util.Date;

public class User extends BaseEntity{

	private Integer id;
	private String uid;
	private String pwd;
	private Date createdAt;
	private Date updatedAt;

	public User(Integer id, String uid, String pwd, Date createdAt, Date updatedAt) {
		this.id = id;
		this.uid = uid;
		this.pwd = pwd;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public User(){}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", uid='" + uid + '\'' +
				", pwd='" + pwd + '\'' +
				", createdAt=" + createdAt +
				", updatedAt=" + updatedAt +
				'}';
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
}
