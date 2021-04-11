/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import ATM_System.DAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {
    public static void main(String[] args) throws Exception{
        DAO dao = new DAO();
        Connection con = dao.connect();
        System.out.println(con);
//        Statement st = con.createStatement();
//
//        ResultSet rs = st.executeQuery("select * from studen");
//
//        System.out.println("sn  Name     password  email");
//        System.out.println(rs.next());
//        while(rs.next()){
//            
//            System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getString(3)+"   "+rs.getString(4));
//        }
//        st.close();
//        con.close();
    }
    
}
