package com.zhiyou100.domain;

public class TbItemDescWithBLOBs extends TbItemDesc {
    private String itemDesc;

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc == null ? null : itemDesc.trim();
    }
}