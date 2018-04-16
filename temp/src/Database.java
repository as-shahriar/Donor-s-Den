

import java.sql.*;

 

public class Database {
    
        String dusername="sql12228686";
        String dpassword="mSChxkvanl";
        String url = "jdbc:mysql://sql12.freemysqlhosting.net/sql12228686";
        
        String query = "SELECT * FROM `info` WHERE 1";
        
        
    
public boolean isLogin(String user,String pass) throws ClassNotFoundException, SQLException{
       Class.forName("com.mysql.jdbc.Driver");
       Connection connection = (Connection)DriverManager.getConnection(url,dusername,dpassword);
       Statement statement = connection.createStatement();
       ResultSet result;
       result = statement.executeQuery(query);
       
       while(result.next()){
            String duser = result.getString("user");
            String dpass = result.getString("pass");
            
            if(user.equals(duser) && pass.equals(dpass)){
                 Home.dname = result.getString("name");
                 Home.dcell = result.getString("cell");
                 Home.dbg = result.getString("bg");
                 Home.dcity = result.getString("city");
                 Home.duser = result.getString("user");
                 Home.dpass = result.getString("pass");
                 Home.ddate = result.getString("day")+" - "+result.getString("month")+" - "+result.getString("year");
                 Home.time=Integer.parseInt(result.getString("day"))+(30*Integer.parseInt(result.getString("month")))+(12*30*Integer.parseInt(result.getString("year")));
                 return true;
            }
       }
       
       statement.close();
       return false;
      
 
    
}

public boolean isUser(String user) throws ClassNotFoundException, SQLException{
     Class.forName("com.mysql.jdbc.Driver");
       Connection connection = (Connection)DriverManager.getConnection(url,dusername,dpassword);
       Statement statement = connection.createStatement();
       ResultSet result;
       result = statement.executeQuery(query);
       
       while(result.next()){
            String duser = result.getString("user");
                      
            if(user.equals(duser)){
                return true;
            }
       }
       
       statement.close();
       return false;
}   

public void reg(String name,String cell,String bg,String city, int day,int month,int year,String user,String pass) throws ClassNotFoundException, SQLException{
       String queryInsert = "INSERT INTO `info` (`name`, `cell`, `bg`, `city`, `day`, `month`, `year`, `user`, `pass`) VALUES ('"+name+"', '"+cell+"', '"+bg+"', '"+city+"', '"+day+"', '"+month+"', '"+year+"', '"+user+"', '"+pass+"');;";
      
       Class.forName("com.mysql.jdbc.Driver");
       Connection connection = (Connection)DriverManager.getConnection(url,dusername,dpassword);
       Statement statement = connection.createStatement();
       int a = statement.executeUpdate(queryInsert);
       statement.close();
        
}


public void edit(String name,String cell,String bg,String city, int day,int month,int year,String user,String pass) throws ClassNotFoundException, SQLException{
   // String queryInsert = " UPDATE `info` SET `name`="+name+", `cell`="+cell+", `bg`"+bg+", `city`"+city+", `day`"+day+", `month`"+month+", `year`"+year+", `user`"+user+", `pass`"+pass+" WHERE user="+Home.duser+";";
      String queryInsert  ="UPDATE info SET name = '"+name+"', cell = '"+cell+"', bg = '"+bg+"',city = '"+city+"', day = '"+day+"',month = '"+month+"',year = '"+year+"', user = '"+user+"',pass = '"+pass+"' WHERE user = '"+Home.duser+"' ;";
       Class.forName("com.mysql.jdbc.Driver");
       Connection connection = (Connection)DriverManager.getConnection(url,dusername,dpassword);
       Statement statement = connection.createStatement();
       statement.executeUpdate(queryInsert);
}

public String showAll() throws ClassNotFoundException, SQLException{
     Class.forName("com.mysql.jdbc.Driver");
       Connection connection = (Connection)DriverManager.getConnection(url,dusername,dpassword);
       Statement statement = connection.createStatement();
       ResultSet result;
       result = statement.executeQuery(query);
       int total=0;
       String show="A+\n";
       boolean value=true;
       while(result.next()){
           if(result.getString("bg").equals("A+")){
                 show = show+"Name: "+result.getString("name")+"\nCell No: "+result.getString("cell")+"\nCity: "+result.getString("city")+"\n\n";
           total++;
           value=false;
           }
       }
       if(value)
           show=show+"Not Available\n\n";
       value=true;
       result = statement.executeQuery(query);
       show=show+"B+\n";
       while(result.next()){
           if(result.getString("bg").equals("B+")){
                 show = show+"Name: "+result.getString("name")+"\nCell No: "+result.getString("cell")+"\nCity: "+result.getString("city")+"\n\n";
            total++;value=false;
           }
       }
       if(value)
           show=show+"Not Available\n\n";
       value=true;
       result = statement.executeQuery(query);
       show=show+"O+\n";
       while(result.next()){
           if(result.getString("bg").equals("O+")){
                 show = show+"Name: "+result.getString("name")+"\nCell No: "+result.getString("cell")+"\nCity: "+result.getString("city")+"\n\n";
            total++;value=false;
           }
       }if(value)
           show=show+"Not Available\n\n";
       value=true;
       result = statement.executeQuery(query);
       show=show+"AB+\n";
       while(result.next()){
           if(result.getString("bg").equals("AB+")){
                 show = show+"Name: "+result.getString("name")+"\nCell No: "+result.getString("cell")+"\nCity: "+result.getString("city")+"\n\n";
            total++;value=false;
           }
       }if(value)
           show=show+"Not Available\n\n";
       value=true;
       result = statement.executeQuery(query);
      show=show+"A-\n";
       while(result.next()){
           if(result.getString("bg").equals("A-")){
                 show = show+"Name: "+result.getString("name")+"\nCell No: "+result.getString("cell")+"\nCity: "+result.getString("city")+"\n\n";
            total++;value=false;
           }
       }if(value)
           show=show+"Not Available\n\n";
       value=true;
       result = statement.executeQuery(query);
       show=show+"B-\n";
       while(result.next()){
           if(result.getString("bg").equals("B-")){
                 show = show+"Name: "+result.getString("name")+"\nCell No: "+result.getString("cell")+"\nCity: "+result.getString("city")+"\n\n";
            total++;value=false;
           }
       }if(value)
           show=show+"Not Available\n\n";
       value=true;
       result = statement.executeQuery(query);
       show=show+"O-\n";
       while(result.next()){
           if(result.getString("bg").equals("O-")){
                 show = show+"Name: "+result.getString("name")+"\nCell No: "+result.getString("cell")+"\nCity: "+result.getString("city")+"\n\n";
            total++;value=false;
           }
       }if(value)
           show=show+"Not Available\n\n";
       value=true;
       result = statement.executeQuery(query);
       
       show=show+"AB-\n";
       while(result.next()){
           if(result.getString("bg").equals("AB-")){
                 show = show+"Name: "+result.getString("name")+"\nCell No: "+result.getString("cell")+"\nCity: "+result.getString("city")+"\n\n";
            total++;value=false;
           }
       }if(value)
           show=show+"Not Available\n\n";
       value=true;
       statement.close();
       Home.total=total;
       return show;
}



    public String searchbg(long time, String bg, String city) throws ClassNotFoundException, SQLException {
       Class.forName("com.mysql.jdbc.Driver");
       Connection connection = (Connection)DriverManager.getConnection(url,dusername,dpassword);
       Statement statement = connection.createStatement();
       ResultSet result;
       result = statement.executeQuery(query);
       String show="";
       int total=0;
       while(result.next()){
           long dtime = Integer.parseInt(result.getString("day"))+(30*Integer.parseInt(result.getString("month")))+(30*12*Integer.parseInt(result.getString("year")));
           //System.out.println("Out time: "+time+"\nminus: "dtime-time);
           if(result.getString("bg").equals(bg) && result.getString("city").equals(city) && time-dtime>=120)
           {
               show = show+"Name: "+result.getString("name")+"\nCell No: "+result.getString("cell")+"\n\n";
               total++;
           }
       }
       Home.total=total;
       statement.close();
        return show;
    }

public void deleteAc(String user,String pass) throws ClassNotFoundException, SQLException{
    String query2 ="DELETE FROM `info` WHERE user = '"+user+"'";
       Class.forName("com.mysql.jdbc.Driver");
       Connection connection = (Connection)DriverManager.getConnection(url,dusername,dpassword);
       Statement statement = connection.createStatement();
       
       int a = statement.executeUpdate(query2);
        
      
       statement.close();
}
}