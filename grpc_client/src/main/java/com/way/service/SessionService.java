package com.way.service;

import com.way.pojo.RdmaSessionReq;
import com.way.pojo.RdmaSessionResp;
import com.way.pojo.UdpSessionReq;
import com.way.pojo.UdpSessionResp;
import com.way.proto.switchml.*;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class SessionService {
    //grpc包注解，用来定义一个客户端，当然可以自己指定不同客户端，不过需要在yaml文件配置
    @GrpcClient("switchmlServiceImpl")
    private SessionGrpc.SessionBlockingStub sessionBlockingStub;

    /**
     * RdmaSession
     * @param rdmaSessionReq
     * @return
     */
    public RdmaSessionResp RdmaSession(RdmaSessionReq rdmaSessionReq){
        RdmaSessionRequest rdmaSessionRequest = RdmaSessionRequest.newBuilder()
                .setSessionId(rdmaSessionReq.getSessionId())
                .setRank(rdmaSessionReq.getRank())
                .setNumWorkers(rdmaSessionReq.getNumWrokers())
                .setMac(rdmaSessionReq.getMac())
                .setIpv4(rdmaSessionReq.getIpv4())
                .setRkey(rdmaSessionReq.getRkey())
                .setPacketSize(PacketSize.MTU_1024)
                .setMessageSize(rdmaSessionReq.getMessageSize())
//                该方法对复杂对象处理比较麻烦
//                .addAllQpns()
//                .addAllQpns()
                .build();
        RdmaSessionResponse rdmaSessionResponse = sessionBlockingStub.rdmaSession(rdmaSessionRequest);
        RdmaSessionResp rdmaSessionResp = new RdmaSessionResp();
        rdmaSessionResp.setSessionId(rdmaSessionResponse.getSessionId());
        rdmaSessionResp.setMac(rdmaSessionResponse.getMac());
        rdmaSessionResp.setIpv4(rdmaSessionResponse.getIpv4());
        rdmaSessionResp.setRkey(rdmaSessionResponse.getRkey());
        rdmaSessionResp.setQpns(rdmaSessionResponse.getQpnsList());
        rdmaSessionResp.setPsns(rdmaSessionResponse.getPsnsList());
        return rdmaSessionResp;
    }

    /**
     * UdpSession
     * @param udpSessionReq
     * @return
     */
    public UdpSessionResp UdpSession(UdpSessionReq udpSessionReq){
        UdpSessionRequest udpSessionRequest = UdpSessionRequest.newBuilder()
                .setSessionId(udpSessionReq.getSessionId())
                .setMac(udpSessionReq.getMac())
                .setIpv4(udpSessionReq.getIpv4())
                .setRank(udpSessionReq.getRank())
                .build();
        UdpSessionResponse udpSessionResponse = sessionBlockingStub.udpSession(udpSessionRequest);
        UdpSessionResp udpSessionResp = new UdpSessionResp();
        udpSessionResp.setSessionId(udpSessionResponse.getSessionId());
        udpSessionResp.setMac(udpSessionResponse.getMac());
        udpSessionResp.setIpv4(udpSessionResponse.getIpv4());
        return udpSessionResp;

    }

}
