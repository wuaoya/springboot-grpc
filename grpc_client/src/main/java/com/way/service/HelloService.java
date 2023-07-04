package com.way.service;

import com.way.proto.test.HelloServiceGrpc.HelloServiceBlockingStub;
import com.way.proto.test.StringReq;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    //注入存根
    @GrpcClient("helloServiceImpl")
    private HelloServiceBlockingStub helloServiceStub;

    public String hello(String name){
        StringReq stringReq = StringReq.newBuilder().setName(name).build();
        return helloServiceStub.helloMethod(stringReq).getResult();
    }
}
