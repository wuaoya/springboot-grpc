package com.way.service;


import com.way.proto.test.HelloServiceGrpc;
import com.way.proto.test.StringReq;
import com.way.proto.test.StringResp;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

/**
 * grpc服务端，整合netty服务器
 */
@GrpcService
public class HelloServiceImpl extends HelloServiceGrpc.HelloServiceImplBase {
    @Override
    public void helloMethod(StringReq request, StreamObserver<StringResp> responseObserver) {
        StringResp stringResp = StringResp.newBuilder().setResult("grpc server: " + request.getName()).build();
        responseObserver.onNext(stringResp);
        responseObserver.onCompleted();
    }
}
