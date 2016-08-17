/**
 * 
 */
package excel;

import jxl.*;
import jxl.write.*;
import jxl.write.biff.LabelRecord;
import jxl.write.biff.RowsExceededException;
import jxl.format.*;

import java.text.SimpleDateFormat;
import java.util.*;
import java.awt.Color;
import java.io.FileInputStream;
import java.io.InputStream;

import jxl.write.Number;
import jxl.write.Boolean;

/** * @author  作者 E-mail: nswdtssroeydh@163.com
 * @date 创建时间：2016-8-16 上午11:49:17 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  */
/**
 * @author HuangKai
 * 
 */
public class Excel {

	public static ArrayList<Salary> salaries = new ArrayList<Salary>();
	
	public static void readExcel(String filePath) {
		String data2 = "";
		// DateTime tem=new DateTime("");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			InputStream is = new FileInputStream(filePath);
			Workbook rwb = Workbook.getWorkbook(is);
			// Sheet st = rwb.getSheet("0")这里有两种方法获取sheet表,1为名字，而为下标，从0开始
			Sheet st = rwb.getSheet("Sheet1");
			int rs = st.getColumns();
			int rows = st.getRows();
			System.out.println("列数===>" + rs + "行数：" + rows);

			for (int k = 0; k < rows; k++) {// 行
				
				if(k < 2)
					continue;
				
				Salary salary = new Salary();
				
				String id = st.getCell(0, k).getContents();
				String name = st.getCell(1, k).getContents();
				String timeStr = st.getCell(2, k).getContents();
				String salaryStr = st.getCell(3, k).getContents();
				String otherStr = st.getCell(4, k).getContents();
				String totalSalaryStr = st.getCell(5, k).getContents();
				String supplementStr = st.getCell(6, k).getContents();
				String supplement1Str = st.getCell(7, k).getContents();
				String feesStr = st.getCell(8, k).getContents();
				String withHoldingStr = st.getCell(9, k).getContents();
				String healthStr = st.getCell(10, k).getContents();
				String medicalSecurityStr = st.getCell(11, k).getContents();
				String fundStr = st.getCell(12, k).getContents();
				String otherWithHoldingStr = st.getCell(13, k).getContents();
				String totalWithHoldingStr = st.getCell(14, k).getContents();
				String totalGainStr = st.getCell(15, k).getContents();
				String signature = st.getCell(16, k).getContents();
				
				salary.setId(id);
				salary.setName(name);
				salary.setTime(Integer.parseInt(timeStr));
				salary.setSalary(Double.parseDouble(salaryStr));
				salary.setOther(Double.parseDouble(otherStr));
				salary.setTotalSalary(Double.parseDouble(totalSalaryStr));
				salary.setSupplement(Double.parseDouble(supplementStr));
				salary.setSupplement1(Double.parseDouble(supplement1Str));
				salary.setFees(Double.parseDouble(feesStr));
				salary.setWithHolding(Double.parseDouble(withHoldingStr));
				salary.setHealth(Double.parseDouble(healthStr));
				salary.setMedicalSecurity(Double.parseDouble(medicalSecurityStr));
				salary.setFund(Double.parseDouble(fundStr));
				salary.setOtherWithHolding(Double.parseDouble(otherWithHoldingStr));
				salary.setTotalWithHolding(Double.parseDouble(totalWithHoldingStr));
				salary.setTotalGain(Double.parseDouble(totalGainStr));
				salary.setSignature(signature);
				
				salaries.add(salary);
			}

			// 关闭
			rwb.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args)
	{
		readExcel("C:\\Users\\Administrator\\Desktop\\大牛推荐表及岗位需求\\2016年44所离退休人员工资表.xls");
		
		for(int i = 0; i < salaries.size(); i++)
			System.out.println(salaries.get(i));
	}
}
