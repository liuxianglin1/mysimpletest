package com.company.eventlistener;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * @author liuxianglin
 * @datetime 2024/4/15
 * @description
 */
public class PersonPropertyListener implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent event) {
        System.out.println("propertyName:" + event.getPropertyName() + ",\n oldeValue:" + event.getOldValue() + "\n newValue:" + event.getNewValue());
        if ("weight".equals(event.getPropertyName())) {//
            int oldValue = (int) event.getOldValue();
            int newValue = (int) event.getNewValue();
            if (oldValue > newValue) {//体重变轻
                System.out.println("请注意增加营养!");
            } else if (oldValue < newValue) {//变重
                System.out.println("该减肥了,请加强锻炼!");
            } else if (oldValue == newValue) {
                System.out.println("身材保持不错,加油!");
            }

        }

    }
}
