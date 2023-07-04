package com.way.service;

import com.way.pojo.RdmaSessionReq;
import com.way.pojo.RdmaSessionResp;
import com.way.proto.switchml.PacketSize;
import com.way.proto.switchml.RdmaSessionRequest;
import com.way.proto.switchml.RdmaSessionResponse;
import com.way.proto.switchml.SessionGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class SessionService {
    @GrpcClient("switchmlServiceImpl")
    private SessionGrpc.SessionBlockingStub sessionBlockingStub;

    public RdmaSessionResp RdmaSession1(RdmaSessionReq rdmaSessionReq){
        RdmaSessionRequest rdmaSessionRequest = RdmaSessionRequest.newBuilder()
                .setSessionId(rdmaSessionReq.getSessionId())
                .setRank(rdmaSessionReq.getRank())
                .setNumWorkers(rdmaSessionReq.getNumWrokers())
                .setMac(rdmaSessionReq.getMac())
                .setIpv4(rdmaSessionReq.getIpv4())
                .setRkey(rdmaSessionReq.getRkey())
                .setPacketSize(PacketSize.MTU_1024)
                .setMessageSize(rdmaSessionReq.getMessageSize())
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

}
