/*
 * Copyright (C) HAND Enterprise Solutions Company Ltd.
 * All Rights Reserved
 */
package designpattern.Builder;

/**
 * @Title builder
 * @Description：
 * @Author: ZZZ
 */

public abstract class Builder {

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract Product getBuildResult();


}
