package org.example;

import org.example.dao.StudentDAO;
import org.example.dao.impl.StudentDAOImpl;
import org.example.pojo.Student;

import java.util.Date;

/** pojo 实体类 ORM object relation model
 * DAO接口
 * @author liufuze
 * @date 2024/7/22 上午8:34
 */
public class Test {
    //驱动加载
    public static void main(String[] args) {
//        try{
//            Class.forName("com.mysql.jdbc.Driver");
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//        System.out.println("驱动加载成功");
//        //获取JDBC的连接
//        String url = "jdbc:mysql://localhost:3306/nuist?characterEncoding=utf8";
//        String user = "root";
//        String password = "a12345";
//        Connection connection = null;
//        try {
//            connection = DriverManager.getConnection(url,user,password);
//        }catch (SQLException e) {
//            e.printStackTrace();
//        }
//        System.out.println("获取连接成功");
//        try {
//            Statement s = connection.createStatement();
//            String sql = "insert into stu" +
//                    "(name,gender,birthday,addr,qqnumber)"+
//                            "values"+
//                    "('刘赋泽','男','2003-02-15','江苏宿迁',3124076825)";
//            s.execute(sql);
//        }catch (SQLException e) {
//            e.printStackTrace();
//        }
        StudentDAO studentDAO = new StudentDAOImpl();
        //插入一个学生信息
//        Student s1 = new Student(0,"aaa","男",new Date(0),"南京",110);
//        studentDAO.insert(s1);
        //根据学生的id修改学生的所有信息
//        Student s2 = new Student(6,"lfz","女",new Date(0),"南京",110);
//        studentDAO.update(s2);
        //根据主键删除学生信息
//        studentDAO.delete(4);
        //统计表记录总数
        studentDAO.count();
        //根据id查找对应的学生信息

        //获取所有学生信息

        //根据名字模糊查询学生

        //根据学生名进行模糊分页的查询

        //分页查询学生

    }
}
