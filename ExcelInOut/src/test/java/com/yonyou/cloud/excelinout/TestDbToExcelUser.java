package com.yonyou.cloud.excelinout;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.List;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class TestDbToExcelUser {
	public static void main(String[] args) {
		try {
			WritableWorkbook wwb = null;

			// 创建可写入的Excel工作簿
			String fileName = "D://AppUser.xls";
			File file = new File(fileName);
			if (!file.exists()) {
				file.createNewFile();
			}
			// 以fileName为文件名来创建一个Workbook
			wwb = Workbook.createWorkbook(file);

			// 创建工作表
			WritableSheet ws = wwb.createSheet("Test Shee 1", 0);

			// 查询数据库中所有的数据
			List<APPUserEntity> list = APPUserService.getAllByDb();
			// 要插入到的Excel表格的行号，默认从0开始
			Label labelId = new Label(0, 0, "编号(id)");// 表示第
			Label labelName = new Label(1, 0, "name");
			Label labelLogin_name = new Label(2, 0, "login_name");
			Label labelPassword = new Label(3, 0, "password");
			Label labelSalt = new Label(4, 0, "salt");
			Label labelRoles = new Label(5, 0, "roles");
			Label labelStates = new Label(6, 0, "states");
			Label labelAvator = new Label(7, 0, "avator");
			Label labelTenant_id = new Label(8, 0, "tenant_id");
			Label labelType = new Label(9, 0, "type");
			Label labelLabel = new Label(10, 0, "label");
			Label labelPhone = new Label(11, 0, "phone");
			Label labelEmail = new Label(12, 0, "email");
			Label labelDtype = new Label(13, 0, "dtype");
			Label labelImg = new Label(14, 0, "img");
			Label labelIslock = new Label(15, 0, "islock");
			Label labelRemark = new Label(16, 0, "remark");
			Label labelCreate_person = new Label(17, 0, "create_person");
			Label labelModify_person = new Label(18, 0, "modify_person");
			Label labelOrganization_id = new Label(19, 0, "organization_id");
			Label labelOrganization_name = new Label(20, 0, "organization_name");
			// datetime
			Label labelCreate_date = new Label(21, 0, "create_date");
			// datetime
			Label labelRegister_date = new Label(22, 0, "register_date");

			ws.addCell(labelId);
			ws.addCell(labelName);
			ws.addCell(labelRegister_date);
			ws.addCell(labelCreate_date);
			ws.addCell(labelOrganization_name);
			ws.addCell(labelOrganization_id);
			ws.addCell(labelModify_person);
			ws.addCell(labelCreate_person);
			ws.addCell(labelRemark);
			ws.addCell(labelIslock);
			ws.addCell(labelImg);
			ws.addCell(labelDtype);
			ws.addCell(labelEmail);
			ws.addCell(labelPhone);
			ws.addCell(labelLabel);
			ws.addCell(labelType);
			ws.addCell(labelTenant_id);
			ws.addCell(labelAvator);
			ws.addCell(labelRoles);
			ws.addCell(labelStates);
			ws.addCell(labelSalt);
			ws.addCell(labelPassword);
			ws.addCell(labelLogin_name);

			for (int i = 0; i < list.size(); i++) {

				Label labelId_i = new Label(0, i + 1, list.get(i).getId());
				Label labelName_i = new Label(1, i + 1, list.get(i).getName());
				Label labelLogin_name_i = new Label(2, i + 1, list.get(i)
						.getLogin_name());
				Label labelPassword_i = new Label(3, i + 1, list.get(i)
						.getPassword());
				Label labelSalt_i = new Label(4, i + 1, list.get(i).getSalt());
				Label labelRoles_i = new Label(5, i + 1, list.get(i).getRoles());
				Label labelStates_i = new Label(6, i + 1, list.get(i)
						.getStates());
				Label labelAvator_i = new Label(7, i + 1, list.get(i)
						.getAvator());
				Label labelTenant_id_i = new Label(8, i + 1, list.get(i)
						.getTenant_id());
				Label labelType_i = new Label(9, i + 1, list.get(i).getType());
				Label labelLabel_i = new Label(10, i + 1, list.get(i)
						.getLabel());
				Label labelPhone_i = new Label(11, i + 1, list.get(i)
						.getPhone());
				Label labelEmail_i = new Label(12, i + 1, list.get(i)
						.getEmail());
				/*
				 * Label labelDtype_i= new Label(13, i+1,
				 * list.get(i).getDtype()); Label labelImg_i= new Label(14, i+1,
				 * list.get(i).getImg());
				 */
				Label labelDtype_i = new Label(13, i + 1, "");
				Label labelImg_i = new Label(14, i + 1, "");
				Label labelIslock_i = new Label(15, i + 1, list.get(i)
						.getIslock());
				Label labelRemark_i = new Label(16, i + 1, list.get(i)
						.getRemark());
				/*
				 * Label labelCreate_person_i= new Label(17, i+1,
				 * list.get(i).getCreate_person()); Label labelModify_person_i=
				 * new Label(18, i+1, list.get(i).getModify_person());
				 */
				Label labelCreate_person_i = new Label(17, i + 1, "");
				Label labelModify_person_i = new Label(18, i + 1, "");
				/*
				 * Label labelOrganization_id_i= new Label(19, i+1,
				 * list.get(i).getOrganization_id()); Label
				 * labelOrganization_name_i= new Label(20, i+1,
				 * list.get(i).getOrganization_name());
				 */
				Label labelOrganization_id_i = new Label(19, i + 1, "11");
				Label labelOrganization_name_i = new Label(20, i + 1, "ww");
				SimpleDateFormat sdf = new SimpleDateFormat(
						"yyyy-MM-dd hh:mm:ss");
				/*
				 * Label labelCreate_date_i= new Label(21, i+1, sdf.
				 * format(list.get(i).getCreate_date()));
				 */
				Label labelCreate_date_i = new Label(21, i + 1, "");
				Label labelRegister_date_i = new Label(22, i + 1,
						sdf.format(list.get(i).getRegister_date()));

				ws.addCell(labelId_i);
				ws.addCell(labelName_i);
				ws.addCell(labelLogin_name_i);
				ws.addCell(labelPassword_i);
				ws.addCell(labelSalt_i);
				ws.addCell(labelRoles_i);
				ws.addCell(labelStates_i);
				ws.addCell(labelAvator_i);
				ws.addCell(labelTenant_id_i);
				ws.addCell(labelType_i);
				ws.addCell(labelLabel_i);
				ws.addCell(labelPhone_i);
				ws.addCell(labelEmail_i);
				ws.addCell(labelDtype_i);
				ws.addCell(labelImg_i);
				ws.addCell(labelIslock_i);
				ws.addCell(labelRemark_i);
				ws.addCell(labelCreate_person_i);
				ws.addCell(labelModify_person_i);
				ws.addCell(labelOrganization_id_i);
				ws.addCell(labelOrganization_name_i);
				ws.addCell(labelCreate_date_i);
				ws.addCell(labelRegister_date_i);
			}

			// 写进文档
			wwb.write();
			// 关闭Excel工作簿对象
			wwb.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
