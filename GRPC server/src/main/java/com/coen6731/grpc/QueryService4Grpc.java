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
    comments = "Source: services4.proto")
public final class QueryService4Grpc {

  private QueryService4Grpc() {}

  public static final String SERVICE_NAME = "QueryService4";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.coen6731.grpc.QueryRequest4,
      com.coen6731.grpc.QueryResponse4> getGetQueryResult4Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetQueryResult4",
      requestType = com.coen6731.grpc.QueryRequest4.class,
      responseType = com.coen6731.grpc.QueryResponse4.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.coen6731.grpc.QueryRequest4,
      com.coen6731.grpc.QueryResponse4> getGetQueryResult4Method() {
    io.grpc.MethodDescriptor<com.coen6731.grpc.QueryRequest4, com.coen6731.grpc.QueryResponse4> getGetQueryResult4Method;
    if ((getGetQueryResult4Method = QueryService4Grpc.getGetQueryResult4Method) == null) {
      synchronized (QueryService4Grpc.class) {
        if ((getGetQueryResult4Method = QueryService4Grpc.getGetQueryResult4Method) == null) {
          QueryService4Grpc.getGetQueryResult4Method = getGetQueryResult4Method = 
              io.grpc.MethodDescriptor.<com.coen6731.grpc.QueryRequest4, com.coen6731.grpc.QueryResponse4>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "QueryService4", "GetQueryResult4"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coen6731.grpc.QueryRequest4.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.coen6731.grpc.QueryResponse4.getDefaultInstance()))
                  .setSchemaDescriptor(new QueryService4MethodDescriptorSupplier("GetQueryResult4"))
                  .build();
          }
        }
     }
     return getGetQueryResult4Method;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueryService4Stub newStub(io.grpc.Channel channel) {
    return new QueryService4Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryService4BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new QueryService4BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryService4FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new QueryService4FutureStub(channel);
  }

  /**
   * <pre>
   * Define the gRPC service 
   * </pre>
   */
  public static abstract class QueryService4ImplBase implements io.grpc.BindableService {

    /**
     */
    public void getQueryResult4(com.coen6731.grpc.QueryRequest4 request,
        io.grpc.stub.StreamObserver<com.coen6731.grpc.QueryResponse4> responseObserver) {
      asyncUnimplementedUnaryCall(getGetQueryResult4Method(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetQueryResult4Method(),
            asyncUnaryCall(
              new MethodHandlers<
                com.coen6731.grpc.QueryRequest4,
                com.coen6731.grpc.QueryResponse4>(
                  this, METHODID_GET_QUERY_RESULT4)))
          .build();
    }
  }

  /**
   * <pre>
   * Define the gRPC service 
   * </pre>
   */
  public static final class QueryService4Stub extends io.grpc.stub.AbstractStub<QueryService4Stub> {
    private QueryService4Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueryService4Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryService4Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueryService4Stub(channel, callOptions);
    }

    /**
     */
    public void getQueryResult4(com.coen6731.grpc.QueryRequest4 request,
        io.grpc.stub.StreamObserver<com.coen6731.grpc.QueryResponse4> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetQueryResult4Method(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Define the gRPC service 
   * </pre>
   */
  public static final class QueryService4BlockingStub extends io.grpc.stub.AbstractStub<QueryService4BlockingStub> {
    private QueryService4BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueryService4BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryService4BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueryService4BlockingStub(channel, callOptions);
    }

    /**
     */
    public com.coen6731.grpc.QueryResponse4 getQueryResult4(com.coen6731.grpc.QueryRequest4 request) {
      return blockingUnaryCall(
          getChannel(), getGetQueryResult4Method(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Define the gRPC service 
   * </pre>
   */
  public static final class QueryService4FutureStub extends io.grpc.stub.AbstractStub<QueryService4FutureStub> {
    private QueryService4FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueryService4FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryService4FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueryService4FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.coen6731.grpc.QueryResponse4> getQueryResult4(
        com.coen6731.grpc.QueryRequest4 request) {
      return futureUnaryCall(
          getChannel().newCall(getGetQueryResult4Method(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_QUERY_RESULT4 = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final QueryService4ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(QueryService4ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_QUERY_RESULT4:
          serviceImpl.getQueryResult4((com.coen6731.grpc.QueryRequest4) request,
              (io.grpc.stub.StreamObserver<com.coen6731.grpc.QueryResponse4>) responseObserver);
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

  private static abstract class QueryService4BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryService4BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.coen6731.grpc.Services4.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("QueryService4");
    }
  }

  private static final class QueryService4FileDescriptorSupplier
      extends QueryService4BaseDescriptorSupplier {
    QueryService4FileDescriptorSupplier() {}
  }

  private static final class QueryService4MethodDescriptorSupplier
      extends QueryService4BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QueryService4MethodDescriptorSupplier(String methodName) {
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
      synchronized (QueryService4Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueryService4FileDescriptorSupplier())
              .addMethod(getGetQueryResult4Method())
              .build();
        }
      }
    }
    return result;
  }
}
