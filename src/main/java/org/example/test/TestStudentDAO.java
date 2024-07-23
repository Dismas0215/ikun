package org.example.test;

import org.example.dao.StudentDAO;
import org.example.dao.impl.StudentDAOImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * 测试类 用于DAO接口测试
 *  @Test 将指定方法标记为测试方法 可以不依赖于main方法直接运行
 *  @Before 在所有测试方法运行之前运行的代码 一般用于环境的初始化
 *  @After 在所有测试方法运行之后运行的代码 一般用于资源的回收
 *  @BeforeClass
 *  @AfterClass
 * @author liufuze
 * @date 2024/7/23 上午11:03
 */
public class TestStudentDAO {
    private StudentDAO studentDAO;
    @Before
    public void init(){
        studentDAO = new StudentDAOImpl();
    }
    @Test
    public void testFindByid(){
        //用于验证结果和预期是否一致
        Assert.assertNotNull(studentDAO.findById(1));
//        Assert.assertNotNull(null);
    }
    @Test
    public void testCount(){
        Assert.assertEquals(11l,(long)studentDAO.count());
    }
    @Test
    public void testFindAll(){
        Assert.assertNotNull(studentDAO.findAll());
    }
//    @Test
//    public void testUpdate(){
//        Assert.assertEquals(studentDAO.update());
//    }
//    @Test
//    public void testDelete(){
//        Assert.assertEquals(studentDAO.delete());
//    }
//    @Test
//    public void testInsert(){
//        Assert.assertEquals(studentDAO.insert());
//    }
    @Test
    public void testFindByNameLike(){
        Assert.assertNotNull(studentDAO.findByNameLike("刘"));
    }
    @Test
    public void testFindWithLimit(){
        Assert.assertNotNull(studentDAO.findWithLimit(0,1));
    }
    @Test
    //测试名字以“刘”开头的 且在0-9范围内的是否存在
    public void testFindByNameLikeWithLimit(){
        Assert.assertNotNull(studentDAO.findByNameLikeWithLimit("刘",0,9));
    }
}
