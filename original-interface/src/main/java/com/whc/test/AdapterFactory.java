package com.whc.test;

public class AdapterFactory {

    public static CommonAdapter createInstance(String enumType) {
        CommonAdapter commonAdapter = null;
        try {
            Class<?> cl = Class.forName("com.whc.test." + CommonEnum.getAdapterName(enumType));
            commonAdapter = (CommonAdapter) cl.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return commonAdapter;
    }
}
