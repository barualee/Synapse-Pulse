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
    comments = "Source: services.proto")
public final class QueryService1Grpc {

  private QueryService1Grpc() {}

  public static final String SERVICE_NAME = "QueryService1";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.coen6731.grpc.QueryRequest1,
      com.coen6731.grpc.QueryResponse1> getGetQueryResult1Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetQueryResult1",
      requestType = com.coen6731.grpc.QueryRequest1.class,
      responseType = com.coen6731.grpc.QueryResponse1.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.coen6731.grpc.QueryRequest1,
      com.coen6731.grpc.QueryResponse1> getGetQueryResult1Method() {
    io.grpc.MethodDescriptor<com.coen6731.grpc.QueryRequest1, com.coen6731.grpc.QueryResponse1> getGetQueryResult1Method;
    if ((getGetQueryResult1Method = QueryService1Grpc.getGetQueryResult1Method) == null) {
      synchronized (QueryService1Grpc.class) {
        if ((getGetQueryResult1Method = QueryService1Grpc.getGetQueryResult1Method) == null) {
          QueryService1Grpc.getGetQueryResult1Method = getGetQueryResult1Method = 
              io.grpc.MethodDescriptor.<com.coen6731.grpc.QueryRequest1, com.coen6731.grpc.QueryResponse1>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "QueryService1", "GetQueryResult1"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coen6731.grpc.QueryRequest1.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coen6731.grpc.QueryResponse1.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryService1MethodDescriptorSupplier("GetQueryResult1"))
                  .build();
          }
        }
     }
     return getGetQueryResult1Method;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueryService1Stub newStub(io.grpc.Channel channel) {
    return new QueryService1Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryService1BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new QueryService1BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryService1FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new QueryService1FutureStub(channel);
  }

  /**
   * <pre>
   * Define the gRPC service 
   * </pre>
   */
  public static abstract class QueryService1ImplBase implements io.grpc.BindableService {

    /**
     */
    public void getQueryResult1(com.coen6731.grpc.QueryRequest1 request,
        io.grpc.stub.StreamObserver<com.coen6731.grpc.QueryResponse1> responseObserver) {
      asyncUnimplementedUnaryCall(getGetQueryResult1Method(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetQueryResult1Method(),
            asyncUnaryCall(
              new MethodHandlers<
                com.coen6731.grpc.QueryRequest1,
                com.coen6731.grpc.QueryResponse1>(
                  this, METHODID_GET_QUERY_RESULT1)))
          .build();
    }
  }

  /**
   * <pre>
   * Define the gRPC service 
   * </pre>
   */
  public static final class QueryService1Stub extends io.grpc.stub.AbstractStub<QueryService1Stub> {
    private QueryService1Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueryService1Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryService1Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueryService1Stub(channel, callOptions);
    }

    /**
     */
    public void getQueryResult1(com.coen6731.grpc.QueryRequest1 request,
        io.grpc.stub.StreamObserver<com.coen6731.grpc.QueryResponse1> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetQueryResult1Method(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Define the gRPC service 
   * </pre>
   */
  public static final class QueryService1BlockingStub extends io.grpc.stub.AbstractStub<QueryService1BlockingStub> {
    private QueryService1BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueryService1BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryService1BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueryService1BlockingStub(channel, callOptions);
    }

    /**
     */
    public com.coen6731.grpc.QueryResponse1 getQueryResult1(com.coen6731.grpc.QueryRequest1 request) {
      return blockingUnaryCall(
          getChannel(), getGetQueryResult1Method(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Define the gRPC service 
   * </pre>
   */
  public static final class QueryService1FutureStub extends io.grpc.stub.AbstractStub<QueryService1FutureStub> {
    private QueryService1FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueryService1FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryService1FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueryService1FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.coen6731.grpc.QueryResponse1> getQueryResult1(
        com.coen6731.grpc.QueryRequest1 request) {
      return futureUnaryCall(
          getChannel().newCall(getGetQueryResult1Method(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_QUERY_RESULT1 = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final QueryService1ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(QueryService1ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_QUERY_RESULT1:
          serviceImpl.getQueryResult1((com.coen6731.grpc.QueryRequest1) request,
              (io.grpc.stub.StreamObserver<com.coen6731.grpc.QueryResponse1>) responseObserver);
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

  private static abstract class QueryService1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryService1BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.coen6731.grpc.Services.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("QueryService1");
    }
  }

  private static final class QueryService1FileDescriptorSupplier
      extends QueryService1BaseDescriptorSupplier {
    QueryService1FileDescriptorSupplier() {}
  }

  private static final class QueryService1MethodDescriptorSupplier
      extends QueryService1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QueryService1MethodDescriptorSupplier(String methodName) {
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
      synchronized (QueryService1Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueryService1FileDescriptorSupplier())
              .addMethod(getGetQueryResult1Method())
              .build();
        }
      }
    }
    return result;
  }
}
