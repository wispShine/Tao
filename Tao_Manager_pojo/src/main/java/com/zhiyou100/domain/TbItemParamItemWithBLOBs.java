package com.zhiyou100.domain;

public class TbItemParamItemWithBLOBs extends TbItemParamItem {
    private String paramData;

    public String getParamData() {
        return paramData;
    }

    public void setParamData(String paramData) {
        this.paramData = paramData == null ? null : paramData.trim();
    }
}