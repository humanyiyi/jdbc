package com.muhanyiyi.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by root on 2016/10/9.
 */
public class JdbcTest {
    public static void main(String args[]) {


        Properties ps = new Properties();
        try {
            FileInputStream in = new FileInputStream("src/jdbc.properties");
            ps.load(in);
            String url = ps.getProperty("url");
            System.out.print(url);
//            age=Integer.parseInt(ps.getProperty("age"));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
