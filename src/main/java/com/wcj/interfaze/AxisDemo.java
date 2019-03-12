package com.wcj.interfaze;

import java.lang.reflect.InvocationTargetException;

public interface AxisDemo {
    public String doService(String HeaderInParm, String BodyInParm) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException;
}
