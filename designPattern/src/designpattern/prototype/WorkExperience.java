/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.prototype;

import java.io.Serializable;

/**
 * @Title WorkExperience
 * @Description：工作经历类，为演示深度拷贝和浅度拷贝而用
 * @Author: ZZZ
 */

public class WorkExperience  implements Serializable {

    private String workDate;
    private String workCompany;

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getWorkCompany() {
        return workCompany;
    }

    public void setWorkCompany(String workCompany) {
        this.workCompany = workCompany;
    }


}
