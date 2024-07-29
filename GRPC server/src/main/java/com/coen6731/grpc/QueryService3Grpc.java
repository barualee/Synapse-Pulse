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
    comments = "Source: services3.proto")
public final class QueryService3Grpc {

  private QueryService3Grpc() {}

  public static final String SERVICE_NAME = "QueryService3";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.coen6731.grpc.QueryRequest3,
      com.coen6731.grpc.QueryResponse3> getGetQueryResult3Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetQueryResult3",
      requestType = com.coen6731.grpc.QueryRequest3.class,
      responseType = com.coen6731.grpc.QueryResponse3.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.coen6731.grpc.QueryRequest3,
      com.coen6731.grpc.QueryResponse3> getGetQueryResult3Method() {
    io.grpc.MethodDescriptor<com.coen6731.grpc.QueryRequest3, com.coen6731.grpc.QueryResponse3> getGetQueryResult3Method;
    if ((getGetQueryResult3Method = QueryService3Grpc.getGetQueryResult3Method) == null) {
      synchronized (QueryService3Grpc.class) {
        if ((getGetQueryResult3Method = QueryService3Grpc.getGetQueryResult3Method) == null) {
          QueryService3Grpc.getGetQueryResult3Method = getGetQueryResult3Method = 
              io.grpc.MethodDescriptor.<com.coen6731.grpc.QueryRequest3, com.coen6731.grpc.QueryResponse3>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "QueryService3", "GetQueryResult3"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coen6731.grpc.QueryRequest3.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coen6731.grpc.QueryResponse3.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryService3MethodDescriptorSupplier("GetQueryResult3"))
                  .build();
          }
        }
     }
     return getGetQueryResult3Method;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueryService3Stub newStub(io.grpc.Channel channel) {
    return new QueryService3Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryService3BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new QueryService3BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryService3FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new QueryService3FutureStub(channel);
  }

  /**
   * <pre>
   * Define the gRPC service 
   * </pre>
   */
  public static abstract class QueryService3ImplBase implements io.grpc.BindableService {

    /**
     */
    public void getQueryResult3(com.coen6731.grpc.QueryRequest3 request,
        io.grpc.stub.StreamObserver<com.coen6731.grpc.QueryResponse3> responseObserver) {
      asyncUnimplementedUnaryCall(getGetQueryResult3Method(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetQueryResult3Method(),
            asyncUnaryCall(
              new MethodHandlers<
                com.coen6731.grpc.QueryRequest3,
                com.coen6731.grpc.QueryResponse3>(
                  this, METHODID_GET_QUERY_RESULT3)))
          .build();
    }
  }

  /**
   * <pre>
   * Define the gRPC service 
   * </pre>
   */
  public static final class QueryService3Stub extends io.grpc.stub.AbstractStub<QueryService3Stub> {
    private QueryService3Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueryService3Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryService3Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueryService3Stub(channel, callOptions);
    }

    /**
     */
    public void getQueryResult3(com.coen6731.grpc.QueryRequest3 request,
        io.grpc.stub.StreamObserver<com.coen6731.grpc.QueryResponse3> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetQueryResult3Method(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Define the gRPC service 
   * </pre>
   */
  public static final class QueryService3BlockingStub extends io.grpc.stub.AbstractStub<QueryService3BlockingStub> {
    private QueryService3BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueryService3BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryService3BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueryService3BlockingStub(channel, callOptions);
    }

    /**
     */
    public com.coen6731.grpc.QueryResponse3 getQueryResult3(com.coen6731.grpc.QueryRequest3 request) {
      return blockingUnaryCall(
          getChannel(), getGetQueryResult3Method(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Define the gRPC service 
   * </pre>
   */
  public static final class QueryService3FutureStub extends io.grpc.stub.AbstractStub<QueryService3FutureStub> {
    private QueryService3FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueryService3FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryService3FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueryService3FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.coen6731.grpc.QueryResponse3> getQueryResult3(
        com.coen6731.grpc.QueryRequest3 request) {
      return futureUnaryCall(
          getChannel().newCall(getGetQueryResult3Method(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_QUERY_RESULT3 = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final QueryService3ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(QueryService3ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_QUERY_RESULT3:
          serviceImpl.getQueryResult3((com.coen6731.grpc.QueryRequest3) request,
              (io.grpc.stub.StreamObserver<com.coen6731.grpc.QueryResponse3>) responseObserver);
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

  private static abstract class QueryService3BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryService3BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.coen6731.grpc.Services3.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("QueryService3");
    }
  }

  private static final class QueryService3FileDescriptorSupplier
      extends QueryService3BaseDescriptorSupplier {
    QueryService3FileDescriptorSupplier() {}
  }

  private static final class QueryService3MethodDescriptorSupplier
      extends QueryService3BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QueryService3MethodDescriptorSupplier(String methodName) {
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
      synchronized (QueryService3Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueryService3FileDescriptorSupplier())
              .addMethod(getGetQueryResult3Method())
              .build();
        }
      }
    }
    return result;
  }
}
