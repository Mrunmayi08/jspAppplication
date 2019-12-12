package com.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.Model.Register;
import com.Model.login;
//import com.model.Login;

import sun.rmi.runtime.Log;
//import com.model.login;
//import com.model.Register;

public class RegisterDao {
	private static Connection con;
	private PreparedStatement ps;
	private String driver="oracle.jdbc.OracleDriver";
	private String url="jdbc:oracle:thin:@localhost:1521:XE";
	private String userName="system";
	private String password="Mrunmayi";
	public Connection getConnection(){
		try{
			Class.forName(driver);
			con=DriverManager.getConnection(url,userName,password);
			System.out.println("COnnection :"+con);
		}
		catch(Exception e){
			System.out.println(e);
		}
		return con;
	}
	public int saveData(List<Register> lst){
		int i=0;
		System.out.println("save..1");
		con=getConnection();
		Register r=(Register)lst.get(0);
		try{
			ps=con.prepareStatement("insert into reg values(?,?,?,?,?)");
			ps.setInt(1,r.getReg_no());
			ps.setString(2,r.getFirstName());
			ps.setString(3,r.getLastName());
			ps.setString(4,r.getUserName());
			ps.setString(5,r.getPass());
			System.out.println("hi");
			i=ps.executeUpdate();
			System.out.println(i);
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return i;
	}
		public boolean validate(List<login> lst){
			getConnection();
			boolean b=false;
			login l=(login)lst.get(0);
			try
			{
				ps=con.prepareStatement("select * from reg where USERNAME=? AND PASSWORD=?");
				ps.setString(1,l.getUname());
				ps.setString(2,l.getPass());
				ResultSet rs=ps.executeQuery();
				if(rs.next()){
				System.out.println("result set");
					b=true;
				}
				else
				{
					System.out.println("no result..");
				}
			}
			catch(Exception e){
				System.out.println(e);
			}
			return b;
		}

		
	
		
	


}
