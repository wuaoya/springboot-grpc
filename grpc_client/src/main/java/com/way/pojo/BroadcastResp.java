package com.way.pojo;

import org.springframework.stereotype.Component;

@Component
public class BroadcastResp {
    private long value;

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }
}
