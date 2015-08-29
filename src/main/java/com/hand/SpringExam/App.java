package com.hand.SpringExam;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hand.SpringExam.FilmJDBCTemplate;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = 
                new ClassPathXmlApplicationContext("ApplicationContext.xml");
         FilmJDBCTemplate filmJDBCTemplate = 
         (FilmJDBCTemplate)context.getBean("filmJDBCTemplate");    
         System.out.println("请输入电影名称(title):" );
         Scanner scan1 = new Scanner(System.in);
         String tit=scan1.nextLine();
         
         System.out.println("请输入电影描述(description):" );
         Scanner scan2 = new Scanner(System.in);
         String des=scan2.nextLine();
         
         System.out.println("请输入语言ID(language_id):" );
         Scanner scan3 = new Scanner(System.in);
         int lang=scan3.nextInt();
         
         filmJDBCTemplate.create(tit, des, lang);
         
         scan1.close();
         scan2.close();
         scan3.close();
         System.out.println("Context Stop");
         
    }

}
