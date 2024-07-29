package com.coen6731.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Define the gRPC service 
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: services2.proto")
public final class QueryService2Grpc {

  private QueryService2Grpc() {}

  public static final String SERVICE_NAME = "QueryService2";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.coen6731.grpc.QueryRequest2,
      com.coen6731.grpc.QueryResponse2> getGetQueryResult2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetQueryResult2",
      requestType = com.coen6731.grpc.QueryRequest2.class,
      responseType = com.coen6731.grpc.QueryResponse2.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.coen6731.grpc.QueryRequest2,
      com.coen6731.grpc.QueryResponse2> getGetQueryResult2Method() {
    io.grpc.MethodDescriptor<com.coen6731.grpc.QueryRequest2, com.coen6731.grpc.QueryResponse2> getGetQueryResult2Method;
    if ((getGetQueryResult2Method = QueryService2Grpc.getGetQueryResult2Method) == null) {
      synchronized (QueryService2Grpc.class) {
        if ((getGetQueryResult2Method = QueryService2Grpc.getGetQueryResult2Method) == null) {
          QueryService2Grpc.getGetQueryResult2Method = getGetQueryResult2Method = 
              io.grpc.MethodDescriptor.<com.coen6731.grpc.QueryRequest2, com.coen6731.grpc.QueryResponse2>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "QueryService2", "GetQueryResult2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coen6731.grpc.QueryRequest2.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coen6731.grpc.QueryResponse2.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryService2MethodDescriptorSupplier("GetQueryResult2"))
                  .build();
          }
        }
     }
     return getGetQueryResult2Method;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueryService2Stub newStub(io.grpc.Channel channel) {
    return new QueryService2Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryService2BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new QueryService2BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryService2FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new QueryService2FutureStub(channel);
  }

  /**
   * <pre>
   * Define the gRPC service 
   * </pre>
   */
  public static abstract class QueryService2ImplBase implements io.grpc.BindableService {

    /**
     */
    public void getQueryResult2(com.coen6731.grpc.QueryRequest2 request,
        io.grpc.stub.StreamObserver<com.coen6731.grpc.QueryResponse2> responseObserver) {
      asyncUnimplementedUnaryCall(getGetQueryResult2Method(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetQueryResult2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                com.coen6731.grpc.QueryRequest2,
                com.coen6731.grpc.QueryResponse2>(
                  this, METHODID_GET_QUERY_RESULT2)))
          .build();
    }
  }

  /**
   * <pre>
   * Define the gRPC service 
   * </pre>
   */
  public static final class QueryService2Stub extends io.grpc.stub.AbstractStub<QueryService2Stub> {
    private QueryService2Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueryService2Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryService2Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueryService2Stub(channel, callOptions);
    }

    /**
     */
    public void getQueryResult2(com.coen6731.grpc.QueryRequest2 request,
        io.grpc.stub.StreamObserver<com.coen6731.grpc.QueryResponse2> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetQueryResult2Method(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Define the gRPC service 
   * </pre>
   */
  public static final class QueryService2BlockingStub extends io.grpc.stub.AbstractStub<QueryService2BlockingStub> {
    private QueryService2BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueryService2BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryService2BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueryService2BlockingStub(channel, callOptions);
    }

    /**
     */
    public com.coen6731.grpc.QueryResponse2 getQueryResult2(com.coen6731.grpc.QueryRequest2 request) {
      return blockingUnaryCall(
          getChannel(), getGetQueryResult2Method(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Define the gRPC service 
   * </pre>
   */
  public static final class QueryService2FutureStub extends io.grpc.stub.AbstractStub<QueryService2FutureStub> {
    private QueryService2FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueryService2FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryService2FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueryService2FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.coen6731.grpc.QueryResponse2> getQueryResult2(
        com.coen6731.grpc.QueryRequest2 request) {
      return futureUnaryCall(
          getChannel().newCall(getGetQueryResult2Method(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_QUERY_RESULT2 = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final QueryService2ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(QueryService2ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_QUERY_RESULT2:
          serviceImpl.getQueryResult2((com.coen6731.grpc.QueryRequest2) request,
              (io.grpc.stub.StreamObserver<com.coen6731.grpc.QueryResponse2>) responseObserver);
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

  private static abstract class QueryService2BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryService2BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.coen6731.grpc.Services2.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("QueryService2");
    }
  }

  private static final class QueryService2FileDescriptorSupplier
      extends QueryService2BaseDescriptorSupplier {
    QueryService2FileDescriptorSupplier() {}
  }

  private static final class QueryService2MethodDescriptorSupplier
      extends QueryService2BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QueryService2MethodDescriptorSupplier(String methodName) {
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
      synchronized (QueryService2Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueryService2FileDescriptorSupplier())
              .addMethod(getGetQueryResult2Method())
              .build();
        }
      }
    }
    return result;
  }
}
