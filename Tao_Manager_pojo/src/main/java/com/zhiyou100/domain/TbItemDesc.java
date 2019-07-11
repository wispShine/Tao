package com.zhiyou100.domain;

import java.util.Date;

public class TbItemDesc extends TbItemDescKey {
    private Date created;

    private Date updated;

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}