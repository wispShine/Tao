package com.zhiyou100.domain;

public class TbContentWithBLOBs extends TbContent {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}