package com.way.proto.switchml;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: switchml.proto")
public final class SyncGrpc {

  private SyncGrpc() {}

  public static final String SERVICE_NAME = "com.way.proto.switchml.Sync";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.way.proto.switchml.BarrierRequest,
      com.way.proto.switchml.BarrierResponse> getBarrierMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Barrier",
      requestType = com.way.proto.switchml.BarrierRequest.class,
      responseType = com.way.proto.switchml.BarrierResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.way.proto.switchml.BarrierRequest,
      com.way.proto.switchml.BarrierResponse> getBarrierMethod() {
    io.grpc.MethodDescriptor<com.way.proto.switchml.BarrierRequest, com.way.proto.switchml.BarrierResponse> getBarrierMethod;
    if ((getBarrierMethod = SyncGrpc.getBarrierMethod) == null) {
      synchronized (SyncGrpc.class) {
        if ((getBarrierMethod = SyncGrpc.getBarrierMethod) == null) {
          SyncGrpc.getBarrierMethod = getBarrierMethod =
              io.grpc.MethodDescriptor.<com.way.proto.switchml.BarrierRequest, com.way.proto.switchml.BarrierResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Barrier"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.way.proto.switchml.BarrierRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.way.proto.switchml.BarrierResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SyncMethodDescriptorSupplier("Barrier"))
              .build();
        }
      }
    }
    return getBarrierMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.way.proto.switchml.BroadcastRequest,
      com.way.proto.switchml.BroadcastResponse> getBroadcastMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Broadcast",
      requestType = com.way.proto.switchml.BroadcastRequest.class,
      responseType = com.way.proto.switchml.BroadcastResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.way.proto.switchml.BroadcastRequest,
      com.way.proto.switchml.BroadcastResponse> getBroadcastMethod() {
    io.grpc.MethodDescriptor<com.way.proto.switchml.BroadcastRequest, com.way.proto.switchml.BroadcastResponse> getBroadcastMethod;
    if ((getBroadcastMethod = SyncGrpc.getBroadcastMethod) == null) {
      synchronized (SyncGrpc.class) {
        if ((getBroadcastMethod = SyncGrpc.getBroadcastMethod) == null) {
          SyncGrpc.getBroadcastMethod = getBroadcastMethod =
              io.grpc.MethodDescriptor.<com.way.proto.switchml.BroadcastRequest, com.way.proto.switchml.BroadcastResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Broadcast"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.way.proto.switchml.BroadcastRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.way.proto.switchml.BroadcastResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SyncMethodDescriptorSupplier("Broadcast"))
              .build();
        }
      }
    }
    return getBroadcastMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SyncStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SyncStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SyncStub>() {
        @java.lang.Override
        public SyncStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SyncStub(channel, callOptions);
        }
      };
    return SyncStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SyncBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SyncBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SyncBlockingStub>() {
        @java.lang.Override
        public SyncBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SyncBlockingStub(channel, callOptions);
        }
      };
    return SyncBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SyncFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SyncFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SyncFutureStub>() {
        @java.lang.Override
        public SyncFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SyncFutureStub(channel, callOptions);
        }
      };
    return SyncFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SyncImplBase implements io.grpc.BindableService {

    /**
     */
    public void barrier(com.way.proto.switchml.BarrierRequest request,
        io.grpc.stub.StreamObserver<com.way.proto.switchml.BarrierResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBarrierMethod(), responseObserver);
    }

    /**
     */
    public void broadcast(com.way.proto.switchml.BroadcastRequest request,
        io.grpc.stub.StreamObserver<com.way.proto.switchml.BroadcastResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBroadcastMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getBarrierMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.way.proto.switchml.BarrierRequest,
                com.way.proto.switchml.BarrierResponse>(
                  this, METHODID_BARRIER)))
          .addMethod(
            getBroadcastMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.way.proto.switchml.BroadcastRequest,
                com.way.proto.switchml.BroadcastResponse>(
                  this, METHODID_BROADCAST)))
          .build();
    }
  }

  /**
   */
  public static final class SyncStub extends io.grpc.stub.AbstractAsyncStub<SyncStub> {
    private SyncStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SyncStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SyncStub(channel, callOptions);
    }

    /**
     */
    public void barrier(com.way.proto.switchml.BarrierRequest request,
        io.grpc.stub.StreamObserver<com.way.proto.switchml.BarrierResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBarrierMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void broadcast(com.way.proto.switchml.BroadcastRequest request,
        io.grpc.stub.StreamObserver<com.way.proto.switchml.BroadcastResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBroadcastMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SyncBlockingStub extends io.grpc.stub.AbstractBlockingStub<SyncBlockingStub> {
    private SyncBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SyncBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SyncBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.way.proto.switchml.BarrierResponse barrier(com.way.proto.switchml.BarrierRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBarrierMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.way.proto.switchml.BroadcastResponse broadcast(com.way.proto.switchml.BroadcastRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBroadcastMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SyncFutureStub extends io.grpc.stub.AbstractFutureStub<SyncFutureStub> {
    private SyncFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SyncFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SyncFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.way.proto.switchml.BarrierResponse> barrier(
        com.way.proto.switchml.BarrierRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBarrierMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.way.proto.switchml.BroadcastResponse> broadcast(
        com.way.proto.switchml.BroadcastRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBroadcastMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BARRIER = 0;
  private static final int METHODID_BROADCAST = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SyncImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SyncImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BARRIER:
          serviceImpl.barrier((com.way.proto.switchml.BarrierRequest) request,
              (io.grpc.stub.StreamObserver<com.way.proto.switchml.BarrierResponse>) responseObserver);
          break;
        case METHODID_BROADCAST:
          serviceImpl.broadcast((com.way.proto.switchml.BroadcastRequest) request,
              (io.grpc.stub.StreamObserver<com.way.proto.switchml.BroadcastResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SyncBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SyncBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.way.proto.switchml.switchmlProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Sync");
    }
  }

  private static final class SyncFileDescriptorSupplier
      extends SyncBaseDescriptorSupplier {
    SyncFileDescriptorSupplier() {}
  }

  private static final class SyncMethodDescriptorSupplier
      extends SyncBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SyncMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SyncGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SyncFileDescriptorSupplier())
              .addMethod(getBarrierMethod())
              .addMethod(getBroadcastMethod())
              .build();
        }
      }
    }
    return result;
  }
}
