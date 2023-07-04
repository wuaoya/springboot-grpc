package com.way.pojo;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RdmaSessionReq {

    private int sessionId;
    private int rank;
    private int numWrokers;
    private long mac;
    private int ipv4;
    private int rkey;
    private PacketSize packetSize;
    private int messageSize;
    private List<? extends Object> qpns;
    private List<? extends Object> psns;

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



    public int getSessionId() {
        return sessionId;
    }

    public void setSessionId(int sessionId) {
        this.sessionId = sessionId;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getNumWrokers() {
        return numWrokers;
    }

    public void setNumWrokers(int numWrokers) {
        this.numWrokers = numWrokers;
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

    public PacketSize getPacketSize() {
        return packetSize;
    }

    public void setPacketSize(PacketSize packetSize) {
        this.packetSize = packetSize;
    }

    public int getMessageSize() {
        return messageSize;
    }

    public void setMessageSize(int messageSize) {
        this.messageSize = messageSize;
    }

}
