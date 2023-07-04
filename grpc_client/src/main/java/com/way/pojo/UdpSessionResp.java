package com.way.pojo;

public class UdpSessionResp {

    private long sessionId;
    private long mac;
    private int ipv4;

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
}
