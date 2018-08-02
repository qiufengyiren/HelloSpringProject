package com.dzq;

import static org.junit.Assert.assertTrue;

import com.dzq.dao.HelloSpring;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Unit test for simple App.
 */
public class HelloSpringtest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    //测试
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
 //测试
    @Test
    public void test(){
        //ClassPathXmlApplicationContext读取配置文件
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        HelloSpring helloSpring=(HelloSpring)applicationContext.getBean("helloSpring");
        helloSpring.print();
        }
    }

