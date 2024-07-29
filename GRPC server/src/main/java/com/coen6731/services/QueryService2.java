package com.coen6731.services;

import com.coen6731.grpc.QueryRequest2;
import com.coen6731.grpc.QueryResponse2;
import com.coen6731.grpc.QueryService2Grpc;
import com.coen6731.grpc.QueryService2Grpc.QueryService2BlockingStub;
import com.coen6731.grpc.QueryService2Grpc.QueryService2ImplBase;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class QueryService2 extends QueryService2ImplBase{

    @Override
    public void getQueryResult2(QueryRequest2 request, StreamObserver<QueryResponse2> responseObserver) {

        //send to DAO Service.
        ManagedChannel channel = ManagedChannelBuilder
            .forAddress("168.138.71.16", 9092).usePlaintext().build();

        QueryService2BlockingStub queryStub2 = QueryService2Grpc.newBlockingStub(channel);
        
        QueryRequest2 queryRequest2 = QueryRequest2
            .newBuilder()
                .setYear(request.getYear())
                .setType(request.getType())
                .setLength(request.getLength())
            .build();
        
        //response from DAO.	
        QueryResponse2 response2 = queryStub2.getQueryResult2(queryRequest2);

        QueryResponse2.Builder response = QueryResponse2.newBuilder();
        response.setYear(response2.getYear());
        response.setType(response2.getType());
        response.setLength(response2.getLength());
        response.setExpensiveStates(response2.getExpensiveStates());

        // QueryResponse2.Builder response = QueryResponse2.newBuilder();
        // response.setYear(request.getYear());
        // response.setType(request.getType());
        // response.setLength(request.getLength());
        // //response.putAllExpensiveStates(response2.getExpensiveStatesMap());
        // response.setExpensiveStates("M");

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
        System.out.println("Service2 Query Hit!");
    }

}
