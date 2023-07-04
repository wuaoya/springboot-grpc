package com.way.pojo;

import org.springframework.stereotype.Component;

@Component
public class BarrierReq {
    private int numWorkers;

    public int getNumWorkers() {
        return numWorkers;
    }

    public void setNumWorkers(int numWorkers) {
        this.numWorkers = numWorkers;
    }
}
