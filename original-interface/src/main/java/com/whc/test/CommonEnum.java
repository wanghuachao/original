package com.whc.test;

import java.util.List;

public enum CommonEnum {
    A("1", "FirstAdapter"), B("2", "FirstAdapter"), C("3", "SecondAdapter");

    private String applyType;
    private String value;

    private CommonEnum(String applyType, String value) {
        this.applyType = applyType;
        this.value = value;
    }

    public static String getAdapterName(String applyType) {
        CommonEnum[] commonEnums = CommonEnum.values();
        String adapterName = "";
        for (CommonEnum c : commonEnums) {
            if (c.applyType.equals(applyType)) {
                adapterName = c.value;
                break;
            }
        }
        return adapterName;
    }
}
