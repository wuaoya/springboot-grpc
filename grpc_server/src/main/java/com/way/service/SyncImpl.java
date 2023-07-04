package com.way.service;

import com.way.proto.switchml.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class SyncImpl extends SyncGrpc.SyncImplBase {
    @Override
    public void barrier(BarrierRequest request, StreamObserver<BarrierResponse> responseObserver) {
        BarrierResponse barrierResponse = BarrierResponse.newBuilder().build();
        responseObserver.onNext(barrierResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void broadcast(BroadcastRequest request, StreamObserver<BroadcastResponse> responseObserver) {
        BroadcastResponse broadcastResponse = BroadcastResponse.newBuilder().setValue(111).build();
        responseObserver.onNext(broadcastResponse);
        responseObserver.onCompleted();
    }
}
