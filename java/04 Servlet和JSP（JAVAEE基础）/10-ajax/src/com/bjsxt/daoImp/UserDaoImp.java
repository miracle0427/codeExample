package com.bjsxt.daoImp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bjsxt.dao.UserDao;
import com.bjsxt.vo.Area;
import com.bjsxt.vo.User;

public class UserDaoImp implements UserDao{

	@Override
	public User getUserInfo(String name) {
		//声明存储对象
		User u=null;
		try {
			//加载驱动
			Class.forName("oracle.jdbc.OracleDriver");
			//获取连接对象
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","oracle");
			//创建sql命令
			String sql="select * from users where uname=?";
			//创建sql命令对象
			PreparedStatement ps=conn.prepareStatement(sql);
			//给占位符赋值
			ps.setString(1,name);
			//遍历查询
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				u=new User();
				u.setUid(rs.getInt("unum"));
				u.setUname(rs.getString("uname"));
				u.setPrice(rs.getDouble("price"));
				u.setLoc(rs.getString("loc"));
				u.setDesc(rs.getString("des"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return u;
	}
	//获取所有的地区信息
	@Override
	public List<Area> getAreaInfo(String pid) {
			//声明存储对象
				List<Area> list=null;
				try {
					//加载驱动
					Class.forName("oracle.jdbc.OracleDriver");
					//获取连接对象
					Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","oracle");
					//创建sql命令
					String sql="select * from area where parentid=? order by areaid";
					//创建sql命令对象
					PreparedStatement ps=conn.prepareStatement(sql);
					//给占位符赋值
					ps.setString(1,pid);
					//遍历查询
					ResultSet rs=ps.executeQuery();
					list=new ArrayList<Area>();
					while(rs.next()){
						Area area=new Area();
						area.setAreaid(rs.getInt("areaid"));
						area.setAreaname(rs.getString("areaname"));
						area.setParentid(rs.getInt("parentid"));
						list.add(area);
					}
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				
				return list;
	}

}
