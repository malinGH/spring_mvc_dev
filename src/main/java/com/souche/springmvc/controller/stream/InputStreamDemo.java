package com.souche.springmvc.controller.stream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @program: spring_mvc_dev
 * @ClassName: InputStreamDemo
 * @description: 流的相关操作示例
 * @author: malin
 * @create: 2019-08-30 16:22
 **/

public class InputStreamDemo {

    public static void main(String[] args) {

        File file = new File("src/main/resources/spring-mvc-servlet.xml");
        streamDemo1(file);
        streamDemo2(file);
    }

    private static void streamDemo1(File file) {
        FileInputStream inputStream = null;
        BufferedInputStream bufferedInputStream = null;
        try {
            inputStream = new FileInputStream(file);
            byte[] bytes = new byte[(int) file.length()];
            bufferedInputStream = new BufferedInputStream(inputStream);
            int len = bufferedInputStream.read(bytes);
            for (byte b : bytes) {
                System.err.print((char) b);
            }
            System.err.println("\nlen: " + len);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bufferedInputStream != null) {
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void streamDemo2(File file) {
        try (FileInputStream inputStream = new FileInputStream(file); BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream)) {
            byte[] bytes = new byte[(int) file.length()];
            int len = bufferedInputStream.read(bytes);
            for (byte b : bytes) {
                System.err.print((char) b);
            }
            System.err.println("\nlen: " + len);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
