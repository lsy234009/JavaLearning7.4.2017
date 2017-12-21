package com.yonyou.cloud.excelinout;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

public class TestExcelToDbUser {
	public static void main(String[] args) {
		// 得到表格中所有的数据
		List<APPUserEntity> listExcel = APPUserService
				.getAllByExcel("d://AppUser.xls");
		/*
		 * //得到数据库表中所有的数据 List<StuEntity> listDb=StuService.getAllByDb();
		 */

		DBhepler db = new DBhepler();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

		for (APPUserEntity appuserEntity : listExcel) {
			String id = appuserEntity.getId();
			if (!APPUserService.isExist(id)) {
				// 不存在就添加
				String sql = "insert into app_user (id,login_name,	name,	password,	salt,	roles,	states,"
						+ "avator,	tenant_id,	type,	label,	phone,	email,	dtype,	img,	islock,	remark,	"
						+ "organization_id,	organization_name,	create_date,	register_date,	create_person,	modify_person) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				String[] str = new String[] {
						id,
						appuserEntity.getLogin_name(),
						appuserEntity.getName(),
						appuserEntity.getPassword(),
						appuserEntity.getSalt(),
						appuserEntity.getRoles(),
						appuserEntity.getStates(),
						appuserEntity.getAvator(),
						appuserEntity.getTenant_id(),
						appuserEntity.getType(),
						appuserEntity.getLabel(),
						appuserEntity.getPhone(),
						appuserEntity.getEmail(),
						appuserEntity.getDtype(),
						appuserEntity.getImg(),
						appuserEntity.getIslock(),
						appuserEntity.getRemark(),
						appuserEntity.getOrganization_id(),
						appuserEntity.getOrganization_name(),
						sdf.format(new java.util.Date(isDateEmpty(
								appuserEntity.getCreate_date()).getTime())),
						sdf.format(new java.util.Date(isDateEmpty(
								appuserEntity.getRegister_date()).getTime())),
						appuserEntity.getCreate_person(),
						appuserEntity.getModify_person() };
				db.AddU(sql, str);

			} else {
				// 存在就更新
				String sql = "update app_user set login_name=?,	name=?,	password=?,	salt=?,	roles=?,	states=?,"
						+ "avator=?,	tenant_id=?,	type=?,	label=?,	phone=?,	email=?,	dtype=?,	img=?,	islock=?,	remark=?,	"
						+ "organization_id=?,	organization_name=?,	create_date=?,	register_date=?,	create_person=?,	modify_person = ? where id=?";
				String[] str = new String[] {
						appuserEntity.getLogin_name(),
						appuserEntity.getName(),
						appuserEntity.getPassword(),
						appuserEntity.getSalt(),
						appuserEntity.getRoles(),
						appuserEntity.getStates(),
						appuserEntity.getAvator(),
						appuserEntity.getTenant_id(),
						appuserEntity.getType(),
						appuserEntity.getLabel(),
						appuserEntity.getPhone(),
						appuserEntity.getEmail(),
						appuserEntity.getDtype(),
						appuserEntity.getImg(),
						appuserEntity.getIslock(),
						appuserEntity.getRemark(),
						appuserEntity.getOrganization_id(),
						appuserEntity.getOrganization_name(),
						sdf.format(new java.util.Date(isDateEmpty(
								appuserEntity.getCreate_date()).getTime())),
						sdf.format(new java.util.Date(isDateEmpty(
								appuserEntity.getRegister_date()).getTime())),
						appuserEntity.getCreate_person(),
						appuserEntity.getModify_person(), id };
				db.AddU(sql, str);
			}
		}
	}

	public static Date isDateEmpty(Date d) {
		if (d == null || "".equals(d)) {
			return new Date(System.currentTimeMillis());
		}
		return d;
	}
}
