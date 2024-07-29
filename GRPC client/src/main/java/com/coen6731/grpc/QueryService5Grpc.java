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
    comments = "Source: services5.proto")
public final class QueryService5Grpc {

  private QueryService5Grpc() {}

  public static final String SERVICE_NAME = "QueryService5";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.coen6731.grpc.QueryRequest5,
      com.coen6731.grpc.QueryResponse5> getGetQueryResult5Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetQueryResult5",
      requestType = com.coen6731.grpc.QueryRequest5.class,
      responseType = com.coen6731.grpc.QueryResponse5.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.coen6731.grpc.QueryRequest5,
      com.coen6731.grpc.QueryResponse5> getGetQueryResult5Method() {
    io.grpc.MethodDescriptor<com.coen6731.grpc.QueryRequest5, com.coen6731.grpc.QueryResponse5> getGetQueryResult5Method;
    if ((getGetQueryResult5Method = QueryService5Grpc.getGetQueryResult5Method) == null) {
      synchronized (QueryService5Grpc.class) {
        if ((getGetQueryResult5Method = QueryService5Grpc.getGetQueryResult5Method) == null) {
          QueryService5Grpc.getGetQueryResult5Method = getGetQueryResult5Method = 
              io.grpc.MethodDescriptor.<com.coen6731.grpc.QueryRequest5, com.coen6731.grpc.QueryResponse5>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "QueryService5", "GetQueryResult5"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coen6731.grpc.QueryRequest5.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coen6731.grpc.QueryResponse5.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryService5MethodDescriptorSupplier("GetQueryResult5"))
                  .build();
          }
        }
     }
     return getGetQueryResult5Method;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueryService5Stub newStub(io.grpc.Channel channel) {
    return new QueryService5Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryService5BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new QueryService5BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryService5FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new QueryService5FutureStub(channel);
  }

  /**
   * <pre>
   * Define the gRPC service 
   * </pre>
   */
  public static abstract class QueryService5ImplBase implements io.grpc.BindableService {

    /**
     */
    public void getQueryResult5(com.coen6731.grpc.QueryRequest5 request,
        io.grpc.stub.StreamObserver<com.coen6731.grpc.QueryResponse5> responseObserver) {
      asyncUnimplementedUnaryCall(getGetQueryResult5Method(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetQueryResult5Method(),
            asyncUnaryCall(
              new MethodHandlers<
                com.coen6731.grpc.QueryRequest5,
                com.coen6731.grpc.QueryResponse5>(
                  this, METHODID_GET_QUERY_RESULT5)))
          .build();
    }
  }

  /**
   * <pre>
   * Define the gRPC service 
   * </pre>
   */
  public static final class QueryService5Stub extends io.grpc.stub.AbstractStub<QueryService5Stub> {
    private QueryService5Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueryService5Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryService5Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueryService5Stub(channel, callOptions);
    }

    /**
     */
    public void getQueryResult5(com.coen6731.grpc.QueryRequest5 request,
        io.grpc.stub.StreamObserver<com.coen6731.grpc.QueryResponse5> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetQueryResult5Method(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Define the gRPC service 
   * </pre>
   */
  public static final class QueryService5BlockingStub extends io.grpc.stub.AbstractStub<QueryService5BlockingStub> {
    private QueryService5BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueryService5BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryService5BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueryService5BlockingStub(channel, callOptions);
    }

    /**
     */
    public com.coen6731.grpc.QueryResponse5 getQueryResult5(com.coen6731.grpc.QueryRequest5 request) {
      return blockingUnaryCall(
          getChannel(), getGetQueryResult5Method(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Define the gRPC service 
   * </pre>
   */
  public static final class QueryService5FutureStub extends io.grpc.stub.AbstractStub<QueryService5FutureStub> {
    private QueryService5FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueryService5FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryService5FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueryService5FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.coen6731.grpc.QueryResponse5> getQueryResult5(
        com.coen6731.grpc.QueryRequest5 request) {
      return futureUnaryCall(
          getChannel().newCall(getGetQueryResult5Method(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_QUERY_RESULT5 = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final QueryService5ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(QueryService5ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_QUERY_RESULT5:
          serviceImpl.getQueryResult5((com.coen6731.grpc.QueryRequest5) request,
              (io.grpc.stub.StreamObserver<com.coen6731.grpc.QueryResponse5>) responseObserver);
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

  private static abstract class QueryService5BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryService5BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.coen6731.grpc.Services5.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("QueryService5");
    }
  }

  private static final class QueryService5FileDescriptorSupplier
      extends QueryService5BaseDescriptorSupplier {
    QueryService5FileDescriptorSupplier() {}
  }

  private static final class QueryService5MethodDescriptorSupplier
      extends QueryService5BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QueryService5MethodDescriptorSupplier(String methodName) {
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
      synchronized (QueryService5Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueryService5FileDescriptorSupplier())
              .addMethod(getGetQueryResult5Method())
              .build();
        }
      }
    }
    return result;
  }
}
