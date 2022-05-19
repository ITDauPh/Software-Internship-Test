/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connect;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author blemb
 */
public class submit {
    MyConnect msql = new MyConnect();
    static Connection conn = null;
    Statement st = null;
    ResultSet rs = null;
    public submit(){
            if(conn == null){
                try{
                    conn = msql.open();
                } catch (SQLException ex) {
                    Logger.getLogger(submit.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    public void them(String ten, String email, String sdt, String nd){
        try{
            String query = "INSERT INTO `thongtinlienhe`(`hoten`, `email`, `SDT`, `ND`) VALUES ('"+ten+"','"+email+"','"+sdt+"','"+nd+"')";  
            st = conn.createStatement();
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Thêm thông tin thành công");
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Lỗi ghi thông tin sinh viên");
        }
    }
}
