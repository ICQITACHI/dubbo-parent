package com.jin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 高山仰之可及，深渊度之可测
 */
public class TestDubboProvider {

    public static void main(String[] args) throws Exception{

        ApplicationContext app = new ClassPathXmlApplicationContext("dubbo-provider.xml");

        System.in.read();//等待一个键盘输入

                }
      }
