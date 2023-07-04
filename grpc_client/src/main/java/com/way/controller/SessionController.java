package com.way.controller;

import com.way.pojo.RdmaSessionReq;
import com.way.pojo.RdmaSessionResp;
import com.way.pojo.UdpSessionReq;
import com.way.pojo.UdpSessionResp;
import com.way.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/session")
public class SessionController {

    @Autowired
    private SessionService sessionService;

    @GetMapping("/rdmaSession")
    public void rdmaSession(){
        RdmaSessionReq rdmaSessionReq = new RdmaSessionReq();
        rdmaSessionReq.setSessionId(1);
        rdmaSessionReq.setMac(1);
        rdmaSessionReq.setMessageSize(1);
        rdmaSessionReq.setIpv4(1);
        rdmaSessionReq.setNumWrokers(1);
        rdmaSessionReq.setRank(1);
        rdmaSessionReq.setRkey(1);
        RdmaSessionResp rdmaSessionResp = sessionService.RdmaSession(rdmaSessionReq);
        System.out.println("rdmaSessionResp:" + rdmaSessionResp.toString());
    }

    @GetMapping("/udpSession")
    public UdpSessionResp udpSession(){
        UdpSessionReq udpSessionReq = new UdpSessionReq();
        udpSessionReq.setIpv4(1);
        udpSessionReq.setMac(1);
        udpSessionReq.setRank(1);
        udpSessionReq.setSessionId(1);
        udpSessionReq.setNumWorkers(1);
        UdpSessionResp udpSessionResp = sessionService.UdpSession(udpSessionReq);
        System.out.println("udpSessionResp:" + udpSessionResp.toString());
        return udpSessionResp;
    }

}
