/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.prototype;

import java.io.*;

/**
 * @Title Resume
 * @Description：简历
 * @Author: ZZZ
 */

public class Resume implements Cloneable , Serializable{
    private String name;
    private String gender;
    private int age;

    private WorkExperience workExperience;

    public Resume() {

        // 在“简历”类实例化时，同时实例化“工作经历”类
        workExperience = new WorkExperience();
    }

    public void display() {
        System.out.println(this.getName() + " " + this.getGender() + " "
                + this.getAge() + "\n工作经历： "
                + this.getWorkExperience().getWorkDate() + " "
                + this.getWorkExperience().getWorkCompany());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // 通过对象序列化，实现深度拷贝
    public Object deepClone() throws  IOException, ClassNotFoundException {
              //先序列化，写入到流里
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(bo);
        oo.writeObject(this);
        //然后反序列化，从流里读取出来，即完成复制
        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi = new ObjectInputStream(bi);
        return oi.readObject();

    }

//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        WorkExperience workExperience = (WorkExperience) super.clone();
//        workExperience.setWorkDate(workExperience.getWorkDate());
//                workExperience.workCompany =this.workCompany.clone();
//        return workExperience;
//    }

    public String getName() {
        return name;
    }

    public Resume setName(String name) {
        this.name = name;

        return this;
    }

    public String getGender() {
        return gender;
    }

    public Resume setGender(String gender) {
        this.gender = gender;

        return this;
    }

    public int getAge() {
        return age;
    }

    public Resume setAge(int age) {
        this.age = age;

        return this;
    }

    public WorkExperience getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workDate, String workCompany) {
        workExperience.setWorkDate(workDate);
        workExperience.setWorkCompany(workCompany);
    }
}
