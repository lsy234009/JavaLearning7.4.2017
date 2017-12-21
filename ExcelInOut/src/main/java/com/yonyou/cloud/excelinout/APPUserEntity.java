package com.yonyou.cloud.excelinout;

import java.sql.Date;

public class APPUserEntity {
	// 23 filds
	private String id;
	private String login_name;
	private String name;
	private String password;
	private String salt;
	private String roles;
	private String states;
	private String avator;
	private String tenant_id;
	private String type;
	private String label;
	private String phone;
	private String email;
	private String dtype;
	private String img;
	private String islock;
	private String remark;
	private String organization_id;
	private String organization_name;
	private Date create_date;
	private Date register_date;
	private String create_person;
	private String modify_person;

	@Override
	public String toString() {
		return "APPUserEntity [id=" + id + ", login_name=" + login_name
				+ ", name=" + name + ", password=" + password + ", salt="
				+ salt + ", roles=" + roles + ", states=" + states
				+ ", avator=" + avator + ", tenant_id=" + tenant_id + ", type="
				+ type + ", label=" + label + ", phone=" + phone + ", email="
				+ email + ", dtype=" + dtype + ", img=" + img + ", islock="
				+ islock + ", remark=" + remark + ", register_date="
				+ register_date + ", create_person=" + create_person
				+ ", modify_person=" + modify_person + ", organization_id="
				+ organization_id + ", organization_name=" + organization_name
				+ ", create_date=" + create_date + "]";
	}

	public APPUserEntity(String id, String login_name, String name,
			String password, String salt, String roles, String states,
			String avator, String tenant_id, String type, String label,
			String phone, String email, String dtype, String img,
			String islock, String remark, Date register_date,
			String create_person, String modify_person, String organization_id,
			String organization_name, Date create_date) {
		super();
		this.id = id;
		this.login_name = login_name;
		this.name = name;
		this.password = password;
		this.salt = salt;
		this.roles = roles;
		this.states = states;
		this.avator = avator;
		this.tenant_id = tenant_id;
		this.type = type;
		this.label = label;
		this.phone = phone;
		this.email = email;
		this.dtype = dtype;
		this.img = img;
		this.islock = islock;
		this.remark = remark;
		this.register_date = register_date;
		this.create_person = create_person;
		this.modify_person = modify_person;
		this.organization_id = organization_id;
		this.organization_name = organization_name;
		this.create_date = create_date;
	}

	public String getCreate_person() {
		return create_person;
	}

	public void setCreate_person(String create_person) {
		this.create_person = create_person;
	}

	public String getModify_person() {
		return modify_person;
	}

	public void setModify_person(String modify_person) {
		this.modify_person = modify_person;
	}

	public String getOrganization_id() {
		return organization_id;
	}

	public void setOrganization_id(String organization_id) {
		this.organization_id = organization_id;
	}

	public String getOrganization_name() {
		return organization_name;
	}

	public void setOrganization_name(String organization_name) {
		this.organization_name = organization_name;
	}

	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

	public APPUserEntity() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLogin_name() {
		return login_name;
	}

	public void setLogin_name(String login_name) {
		this.login_name = login_name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public String getStates() {
		return states;
	}

	public void setStates(String states) {
		this.states = states;
	}

	public String getAvator() {
		return avator;
	}

	public void setAvator(String avator) {
		this.avator = avator;
	}

	public String getTenant_id() {
		return tenant_id;
	}

	public void setTenant_id(String tenant_id) {
		this.tenant_id = tenant_id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDtype() {
		return dtype;
	}

	public void setDtype(String dtype) {
		this.dtype = dtype;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getIslock() {
		return islock;
	}

	public void setIslock(String islock) {
		this.islock = islock;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getRegister_date() {
		return register_date;
	}

	public void setRegister_date(Date register_date) {
		this.register_date = register_date;
	}

}
