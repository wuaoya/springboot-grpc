package com.way.controller;

import com.way.pojo.BarrierReq;
import com.way.pojo.BarrierResp;
import com.way.pojo.BroadcastReq;
import com.way.pojo.BroadcastResp;
import com.way.proto.switchml.BarrierRequest;
import com.way.service.SyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sync")
public class SyncController {
    @Autowired
    private SyncService syncService;

    @GetMapping("/barrier")
    public BarrierResp barrier(){
        BarrierReq barrierReq = new BarrierReq();
        barrierReq.setNumWorkers(1);
        BarrierResp barrierResp = syncService.Barrier(barrierReq);
        System.out.println("barrierResp:" + barrierResp.toString());
        return barrierResp;
    }

    @GetMapping("/broadcast")
    public BroadcastResp broadcast(){
        BroadcastReq broadcastReq = new BroadcastReq();
        broadcastReq.setNumWorkers(broadcastReq.getNumWorkers());
        broadcastReq.setRank(broadcastReq.getRank());
        broadcastReq.setRoot(broadcastReq.getRoot());
        broadcastReq.setValue(broadcastReq.getValue());
        BroadcastResp broadcastResp = syncService.Broadcast(broadcastReq);
        System.out.println("broadcastResp:" + broadcastResp.toString());
        return broadcastResp;
    }
}
