import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Connection conn = null;
		 try{
	        	
	           Class.forName("com.mysql.jdbc.Driver");

	             String url = "jdbc:mysql://localhost/a2";

	             conn = DriverManager.getConnection(url, "root", "");
	            System.out.println("연결 성공");

	        }
	        catch(ClassNotFoundException e){
	            System.out.println("드라이버 로딩 실패");
	        }
	        catch(SQLException e){
	            System.out.println("에러: " + e);
	        }
	        finally{
	            try{
	                if( conn != null && !conn.isClosed()){
	                    conn.close();
	                }
	            }
	            catch( SQLException e){
	                e.printStackTrace();
	            }
	        }
	}
}
