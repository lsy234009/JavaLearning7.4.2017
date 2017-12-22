package com.yonyou.cloud.excelinout;

import java.io.File;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import jxl.Sheet;
import jxl.Workbook;

public class APPUserService {
	/**
	 * 查询app_user表中所有的数据
	 * 
	 * @return
	 */
	public static List<APPUserEntity> getAllByDb() {
		List<APPUserEntity> list = new ArrayList<APPUserEntity>();
		try {
			DBhepler db = new DBhepler();
			String sql = "select * from app_user";
			ResultSet rs = db.Search(sql, null);
			while (rs.next()) {
				String id = rs.getString("id");
				String login_name = rs.getString("login_name");
				String name = rs.getString("name");
				String password = rs.getString("password");
				String salt = rs.getString("salt");
				String roles = rs.getString("roles");
				String states = rs.getString("states");
				String avator = rs.getString("avator");
				String tenant_id = rs.getString("tenant_id");
				String type = rs.getString("type");
				String label = rs.getString("label");
				String phone = rs.getString("phone");
				String email = rs.getString("email");
				String dtype = rs.getString("dtype");
				String img = rs.getString("img");
				String islock = rs.getString("islock");
				String remark = rs.getString("remark");
				Date register_date = rs.getDate("register_date");
				String create_person = rs.getString("create_person");
				String modify_person = rs.getString("modify_person");
				String organization_id = rs.getString("organization_id");
				String organization_name = rs.getString("organization_name");
				Date create_date = rs.getDate("create_date");
				list.add(new APPUserEntity(id, login_name, name, password,
						salt, roles, states, avator, tenant_id, type, label,
						phone, email, dtype, img, islock, remark,
						register_date, create_person, modify_person,
						organization_id, organization_name, create_date));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	/**
	 * 查询指定目录中电子表格中所有的数据
	 * 
	 * @param file
	 *            文件完整路径
	 * @return
	 */
	public static List<APPUserEntity> getAllByExcel(String file) {
		List<APPUserEntity> list = new ArrayList<APPUserEntity>();
		try {
			Workbook rwb = Workbook.getWorkbook(new File(file));
			Sheet rs = rwb.getSheet("Test Shee 1");// 或者rwb.getSheet(0)
			int clos = rs.getColumns();// 得到所有的列
			int rows = rs.getRows();// 得到所有的行

			System.out.println("clos：" + clos + " rows:" + rows);
			for (int i = 1; i < rows; i++) {
				for (int j = 0; j < clos;) {
					// 第一个i是行数，第二个j是列数
					String id = rs.getCell(j++, i).getContents();// 默认最左边编号也算一列
																	// 所以这里得j++
					String name = rs.getCell(j++, i).getContents();
					String login_name = rs.getCell(j++, i).getContents();
					String password = rs.getCell(j++, i).getContents();
					String salt = rs.getCell(j++, i).getContents();
					String roles = rs.getCell(j++, i).getContents();
					String states = rs.getCell(j++, i).getContents();
					String avator = rs.getCell(j++, i).getContents();
					String tenant_id = rs.getCell(j++, i).getContents();
					String type = rs.getCell(j++, i).getContents();
					String label = rs.getCell(j++, i).getContents();
					String phone = rs.getCell(j++, i).getContents();
					String email = rs.getCell(j++, i).getContents();
					String dtype = rs.getCell(j++, i).getContents();
					String img = rs.getCell(j++, i).getContents();
					String islock = rs.getCell(j++, i).getContents();
					String remark = rs.getCell(j++, i).getContents();
					String create_person = rs.getCell(j++, i).getContents();
					String modify_person = rs.getCell(j++, i).getContents();
					String organization_id = rs.getCell(j++, i).getContents();
					String organization_name = rs.getCell(j++, i).getContents();

					SimpleDateFormat sdf = new SimpleDateFormat(
							"yyyy-MM-dd hh:mm:ss");// 小写的mm表示的是分钟

					// Date create_date=new Date(sdf.parse(rs.getCell(j++,
					// i).getContents()).getTime());
					Date create_date = null;
					j++;
					// Date register_date=new Date(sdf.parse(rs.getCell(j++,
					// i).getContents()).getTime());
					Date register_date = null;
					j++;

					list.add(new APPUserEntity(id, login_name, name, password,
							salt, roles, states, avator, tenant_id, type,
							label, phone, email, dtype, img, islock, remark,
							register_date, create_person, modify_person,
							organization_id, organization_name, create_date));
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;

	}

	/**
	 * 通过Id判断是否存在
	 * 
	 * @param id
	 * @return
	 */
	public static boolean isExist(String id) {
		try {
			DBhepler db = new DBhepler();
			ResultSet rs = db.Search("select * from app_user where id=?",
					new String[] { id });
			if (rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
