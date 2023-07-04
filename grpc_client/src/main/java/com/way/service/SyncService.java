package com.way.service;

import com.way.pojo.BarrierReq;
import com.way.pojo.BarrierResp;
import com.way.pojo.BroadcastReq;
import com.way.pojo.BroadcastResp;
import com.way.proto.switchml.*;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class SyncService {

    @GrpcClient("switchmlServiceImpl")
    private SyncGrpc.SyncBlockingStub syncBlockingStub;

    public BarrierResp Barrier(BarrierReq barrierReq){
        BarrierRequest barrierRequest = BarrierRequest.newBuilder()
                .setNumWorkers(barrierReq.getNumWorkers())
                .build();
        BarrierResponse barrierResponse = syncBlockingStub.barrier(barrierRequest);
        return new BarrierResp();
    }

    public BroadcastResp Broadcast(BroadcastReq broadcastReq){
        BroadcastRequest broadcastRequest = BroadcastRequest.newBuilder()
                .setRoot(broadcastReq.getRoot())
                .setRank(broadcastReq.getRank())
                .setValue(broadcastReq.getValue())
                .build();
        BroadcastResponse broadcastResponse = syncBlockingStub.broadcast(broadcastRequest);
        BroadcastResp broadcastResp = new BroadcastResp();
        broadcastResp.setValue(broadcastResponse.getValue());
        return broadcastResp;
    }
}
