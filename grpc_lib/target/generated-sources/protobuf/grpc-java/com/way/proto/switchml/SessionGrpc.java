package com.way.proto.switchml;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: switchml.proto")
public final class SessionGrpc {

  private SessionGrpc() {}

  public static final String SERVICE_NAME = "com.way.proto.switchml.Session";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.way.proto.switchml.RdmaSessionRequest,
      com.way.proto.switchml.RdmaSessionResponse> getRdmaSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RdmaSession",
      requestType = com.way.proto.switchml.RdmaSessionRequest.class,
      responseType = com.way.proto.switchml.RdmaSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.way.proto.switchml.RdmaSessionRequest,
      com.way.proto.switchml.RdmaSessionResponse> getRdmaSessionMethod() {
    io.grpc.MethodDescriptor<com.way.proto.switchml.RdmaSessionRequest, com.way.proto.switchml.RdmaSessionResponse> getRdmaSessionMethod;
    if ((getRdmaSessionMethod = SessionGrpc.getRdmaSessionMethod) == null) {
      synchronized (SessionGrpc.class) {
        if ((getRdmaSessionMethod = SessionGrpc.getRdmaSessionMethod) == null) {
          SessionGrpc.getRdmaSessionMethod = getRdmaSessionMethod =
              io.grpc.MethodDescriptor.<com.way.proto.switchml.RdmaSessionRequest, com.way.proto.switchml.RdmaSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RdmaSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.way.proto.switchml.RdmaSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.way.proto.switchml.RdmaSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionMethodDescriptorSupplier("RdmaSession"))
              .build();
        }
      }
    }
    return getRdmaSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.way.proto.switchml.UdpSessionRequest,
      com.way.proto.switchml.UdpSessionResponse> getUdpSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UdpSession",
      requestType = com.way.proto.switchml.UdpSessionRequest.class,
      responseType = com.way.proto.switchml.UdpSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.way.proto.switchml.UdpSessionRequest,
      com.way.proto.switchml.UdpSessionResponse> getUdpSessionMethod() {
    io.grpc.MethodDescriptor<com.way.proto.switchml.UdpSessionRequest, com.way.proto.switchml.UdpSessionResponse> getUdpSessionMethod;
    if ((getUdpSessionMethod = SessionGrpc.getUdpSessionMethod) == null) {
      synchronized (SessionGrpc.class) {
        if ((getUdpSessionMethod = SessionGrpc.getUdpSessionMethod) == null) {
          SessionGrpc.getUdpSessionMethod = getUdpSessionMethod =
              io.grpc.MethodDescriptor.<com.way.proto.switchml.UdpSessionRequest, com.way.proto.switchml.UdpSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UdpSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.way.proto.switchml.UdpSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.way.proto.switchml.UdpSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SessionMethodDescriptorSupplier("UdpSession"))
              .build();
        }
      }
    }
    return getUdpSessionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SessionStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SessionStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SessionStub>() {
        @java.lang.Override
        public SessionStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SessionStub(channel, callOptions);
        }
      };
    return SessionStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SessionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SessionBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SessionBlockingStub>() {
        @java.lang.Override
        public SessionBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SessionBlockingStub(channel, callOptions);
        }
      };
    return SessionBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SessionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SessionFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SessionFutureStub>() {
        @java.lang.Override
        public SessionFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SessionFutureStub(channel, callOptions);
        }
      };
    return SessionFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SessionImplBase implements io.grpc.BindableService {

    /**
     */
    public void rdmaSession(com.way.proto.switchml.RdmaSessionRequest request,
        io.grpc.stub.StreamObserver<com.way.proto.switchml.RdmaSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRdmaSessionMethod(), responseObserver);
    }

    /**
     */
    public void udpSession(com.way.proto.switchml.UdpSessionRequest request,
        io.grpc.stub.StreamObserver<com.way.proto.switchml.UdpSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUdpSessionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRdmaSessionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.way.proto.switchml.RdmaSessionRequest,
                com.way.proto.switchml.RdmaSessionResponse>(
                  this, METHODID_RDMA_SESSION)))
          .addMethod(
            getUdpSessionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.way.proto.switchml.UdpSessionRequest,
                com.way.proto.switchml.UdpSessionResponse>(
                  this, METHODID_UDP_SESSION)))
          .build();
    }
  }

  /**
   */
  public static final class SessionStub extends io.grpc.stub.AbstractAsyncStub<SessionStub> {
    private SessionStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SessionStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SessionStub(channel, callOptions);
    }

    /**
     */
    public void rdmaSession(com.way.proto.switchml.RdmaSessionRequest request,
        io.grpc.stub.StreamObserver<com.way.proto.switchml.RdmaSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRdmaSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void udpSession(com.way.proto.switchml.UdpSessionRequest request,
        io.grpc.stub.StreamObserver<com.way.proto.switchml.UdpSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUdpSessionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SessionBlockingStub extends io.grpc.stub.AbstractBlockingStub<SessionBlockingStub> {
    private SessionBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SessionBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SessionBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.way.proto.switchml.RdmaSessionResponse rdmaSession(com.way.proto.switchml.RdmaSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRdmaSessionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.way.proto.switchml.UdpSessionResponse udpSession(com.way.proto.switchml.UdpSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUdpSessionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SessionFutureStub extends io.grpc.stub.AbstractFutureStub<SessionFutureStub> {
    private SessionFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SessionFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SessionFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.way.proto.switchml.RdmaSessionResponse> rdmaSession(
        com.way.proto.switchml.RdmaSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRdmaSessionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.way.proto.switchml.UdpSessionResponse> udpSession(
        com.way.proto.switchml.UdpSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUdpSessionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RDMA_SESSION = 0;
  private static final int METHODID_UDP_SESSION = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SessionImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SessionImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RDMA_SESSION:
          serviceImpl.rdmaSession((com.way.proto.switchml.RdmaSessionRequest) request,
              (io.grpc.stub.StreamObserver<com.way.proto.switchml.RdmaSessionResponse>) responseObserver);
          break;
        case METHODID_UDP_SESSION:
          serviceImpl.udpSession((com.way.proto.switchml.UdpSessionRequest) request,
              (io.grpc.stub.StreamObserver<com.way.proto.switchml.UdpSessionResponse>) responseObserver);
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

  private static abstract class SessionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SessionBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.way.proto.switchml.switchmlProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Session");
    }
  }

  private static final class SessionFileDescriptorSupplier
      extends SessionBaseDescriptorSupplier {
    SessionFileDescriptorSupplier() {}
  }

  private static final class SessionMethodDescriptorSupplier
      extends SessionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SessionMethodDescriptorSupplier(String methodName) {
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
      synchronized (SessionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SessionFileDescriptorSupplier())
              .addMethod(getRdmaSessionMethod())
              .addMethod(getUdpSessionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
