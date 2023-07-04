package com.way.pojo;

public class UdpSessionReq {

    private long sessionId;
    private int rank;
    private int numWorkers;
    private long mac;
    private int ipv4;
    private PacketSize packetSize;

    public long getSessionId() {
        return sessionId;
    }

    public void setSessionId(long sessionId) {
        this.sessionId = sessionId;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getNumWorkers() {
        return numWorkers;
    }

    public void setNumWorkers(int numWorkers) {
        this.numWorkers = numWorkers;
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

    public PacketSize getPacketSize() {
        return packetSize;
    }

    public void setPacketSize(PacketSize packetSize) {
        this.packetSize = packetSize;
    }


}
