package com.szh.login.Daos;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.szh.login.beans.UserBean;
import com.szh.login.utils.DBUtil;

/**
 * 用户Dao层
 *
 */
public class UserDao extends DBUtil {

	/**
	 * 通过用户名密码找到用户
	 * @param userName
	 * @param userPass
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public UserBean findOne(String userName,String userPassWord){
		Connection conn=null;
		UserBean user=null;
		try {
			conn=getConn();
			QueryRunner qr=new QueryRunner();
			String sql="select *from t_user where username = ? and password = ? ";
			user=(UserBean)qr.query(conn,sql,new BeanHandler(UserBean.class),userName,userPassWord);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			closeConn(null, conn);
		}
		return user;
	}
	
	/**
	 * 增加一个对象
	 */
	public int addOne(UserBean user){
		Connection conn=null;
		PreparedStatement stat=null;
		int rowCount=0;
		try {
			conn=getConn();
			String sql="insert into t_user(username, password, age) value(?,?,?)";
			stat=conn.prepareStatement(sql);
			//设置值
			stat.setString(1, user.getUserName());
			stat.setString(2, user.getUserPass());
			stat.setInt(3, user.getAge());
			//执行
			rowCount=stat.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			closeConn(stat, conn);
		}
		return rowCount;
	}
}
