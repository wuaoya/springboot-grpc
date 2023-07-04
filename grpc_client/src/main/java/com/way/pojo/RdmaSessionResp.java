package com.way.pojo;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RdmaSessionResp {
    @Override
    public String toString() {
        return "RdmaSessionResp{" +
                "sessionId=" + sessionId +
                ", mac=" + mac +
                ", ipv4=" + ipv4 +
                ", rkey=" + rkey +
                ", qpns=" + qpns +
                ", psns=" + psns +
                '}';
    }

    private long sessionId;
    private long mac;
    private int ipv4;
    private int rkey;
    private List<? extends Object> qpns;
    private List<? extends Object> psns;

    public long getSessionId() {
        return sessionId;
    }

    public void setSessionId(long sessionId) {
        this.sessionId = sessionId;
    }

    public long getMac() {
        return mac;
    }

    public void setMac(long mac) {
        this.mac = mac;
    }

    public int getIpv4() {
        return ipv4;
    }

    public void setIpv4(int ipv4) {
        this.ipv4 = ipv4;
    }

    public int getRkey() {
        return rkey;
    }

    public void setRkey(int rkey) {
        this.rkey = rkey;
    }

    public List<? extends Object> getQpns() {
        return qpns;
    }

    public void setQpns(List<? extends Object> qpns) {
        this.qpns = qpns;
    }

    public List<? extends Object> getPsns() {
        return psns;
    }

    public void setPsns(List<? extends Object> psns) {
        this.psns = psns;
    }
}
