package com.company.entity;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * @author liuxianglin
 * @datetime 2024/4/15
 * @description
 */
public class Person {

    private int weight;//kg

    public Person(int weight) {
        super();
        this.weight = weight;
    }

    //创建当前对象的事件监听管理器

    PropertyChangeSupport listeners = new PropertyChangeSupport(this);

    public int getWeight() {
        return weight;
    }

    /**

     * 设置属性的时候触发监听器

     *

     * @param weight

     */

    public void setWeight(int weight) {

        listeners.firePropertyChange("weight", this.weight, weight);

        //this.weight = weight;//为了测试,只触发不实际修改

    }

    /**
     * 监听管理器为当前对象添加监听
     *
     * @param listener
     */

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        this.listeners.addPropertyChangeListener(listener);
    }

    /**
     * 管理器当前对象的管理器
     *
     * @param listener
     */

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        this.listeners.removePropertyChangeListener(listener);
    }

}
