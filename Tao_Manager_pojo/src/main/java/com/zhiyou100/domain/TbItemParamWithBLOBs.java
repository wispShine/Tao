package com.zhiyou100.domain;

public class TbItemParamWithBLOBs extends TbItemParam {
    private String paramData;

    public String getParamData() {
        return paramData;
    }

    public void setParamData(String paramData) {
        this.paramData = paramData == null ? null : paramData.trim();
    }
}