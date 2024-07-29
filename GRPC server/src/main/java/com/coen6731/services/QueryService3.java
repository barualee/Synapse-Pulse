package com.coen6731.services;


import com.coen6731.grpc.QueryRequest3;
import com.coen6731.grpc.QueryResponse3;
import com.coen6731.grpc.QueryService3Grpc;
import com.coen6731.grpc.QueryService3Grpc.QueryService3BlockingStub;
import com.coen6731.grpc.QueryService3Grpc.QueryService3ImplBase;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class QueryService3 extends QueryService3ImplBase{

    @Override
    public void getQueryResult3(QueryRequest3 request, StreamObserver<QueryResponse3> responseObserver) {

        //send to DAO Service.
        ManagedChannel channel = ManagedChannelBuilder
            .forAddress("168.138.71.16", 9093).usePlaintext().build();

        QueryService3BlockingStub queryStub3 = QueryService3Grpc.newBlockingStub(channel);
        
        QueryRequest3 queryRequest3 = QueryRequest3
            .newBuilder()
                .setYear(request.getYear())
                .setType(request.getType())
                .setLength(request.getLength())
            .build();
        
        //response from DAO.	
        QueryResponse3 response3 = queryStub3.getQueryResult3(queryRequest3);


        QueryResponse3.Builder response = QueryResponse3.newBuilder();
        response.setYear(response3.getYear());
        response.setType(response3.getType());
        response.setLength(response3.getLength());
        response.setEconomicalStates(response3.getEconomicalStates());

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();

        System.out.println("Service3 Query Hit!");
    }
}
