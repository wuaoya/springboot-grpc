package com.way.service;

import com.way.proto.switchml.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class SessionImpl extends SessionGrpc.SessionImplBase {
    @Override
    public void rdmaSession(RdmaSessionRequest request, StreamObserver<RdmaSessionResponse> responseObserver) {
        //简单构建一下返回参数
        RdmaSessionResponse rdmaSessionResponse = RdmaSessionResponse.newBuilder().setSessionId(1).build();
        responseObserver.onNext(rdmaSessionResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void udpSession(UdpSessionRequest request, StreamObserver<UdpSessionResponse> responseObserver) {
        UdpSessionResponse udpSessionResponse = UdpSessionResponse.newBuilder().setSessionId(11).build();
        responseObserver.onNext(udpSessionResponse);
        responseObserver.onCompleted();
    }
}
