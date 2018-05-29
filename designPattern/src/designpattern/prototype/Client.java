/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.prototype;

import java.io.IOException;

/**
 * @Title Client
 * @Description：
 * @Author: ZZZ
 */

public class Client {
    public static void shallowCopy() throws CloneNotSupportedException {
        Resume aResume = new Resume();
        aResume.setName("大鸟 ").setGender("男 ").setAge(25);
        aResume.setWorkExperience("1999-2002, ", "XX公司");

        Resume bResume = (Resume) aResume.clone();
        bResume.setWorkExperience("1999-2002, ", "YY公司");

        Resume cResume = (Resume) aResume.clone();
        cResume.setWorkExperience("1999-2002, ", "ZZ公司");

        System.out.println(">>>>>>浅度拷贝:");
        aResume.display();
        bResume.display();
        cResume.display();
    }

    public static void deepCopy() throws
            ClassNotFoundException, IOException {
        Resume aResume = new Resume();
        aResume.setName("大鸟 ").setGender("男 ").setAge(25);
        aResume.setWorkExperience("1999-2002, ", "XX公司");

        Resume bResume = (Resume) aResume.deepClone();
        bResume.setWorkExperience("1999-2002, ", "YY公司");

        Resume cResume = (Resume) aResume.deepClone();
        cResume.setWorkExperience("1999-2002, ", "ZZ公司");

        System.out.println(">>>>>>深度拷贝:");
        aResume.display();
        bResume.display();
        cResume.display();

    }

    public static void main(String[] args) throws CloneNotSupportedException,
            ClassNotFoundException, IOException {

        // 浅度拷贝
        shallowCopy();

        System.out.println("==================================");

        // 深度拷贝
        deepCopy();

    }
}
