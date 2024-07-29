package com.coen6731.services;


import com.coen6731.grpc.QueryRequest4;
import com.coen6731.grpc.QueryResponse4;
import com.coen6731.grpc.QueryService4Grpc;
import com.coen6731.grpc.QueryService4Grpc.QueryService4BlockingStub;
import com.coen6731.grpc.QueryService4Grpc.QueryService4ImplBase;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class QueryService4 extends QueryService4ImplBase{

    @Override
    public void getQueryResult4(QueryRequest4 request, StreamObserver<QueryResponse4> responseObserver) {

        //send to DAO Service.
        ManagedChannel channel = ManagedChannelBuilder
            .forAddress("168.138.71.16", 9094).usePlaintext().build();

        QueryService4BlockingStub queryStub4 = QueryService4Grpc.newBlockingStub(channel);
        
        QueryRequest4 queryRequest4 = QueryRequest4
            .newBuilder()
                .setType(request.getType())
                .setLength(request.getLength())
                .setLatestyear(request.getLatestyear())
                .setYearrange(request.getYearrange())
            .build();
        
        //response from DAO.	
        QueryResponse4 response4 = queryStub4.getQueryResult4(queryRequest4);


        QueryResponse4.Builder response = QueryResponse4.newBuilder();
        response.setType(response4.getType());
        response.setLength(response4.getLength());
        response.setLatestyear(response4.getLatestyear());
        response.setYearrange(response4.getYearrange());
        response.setHighestGrowthStates(response4.getHighestGrowthStates());


        // QueryResponse4.Builder response = QueryResponse4.newBuilder();
        // response.setType(request.getType());
        // response.setLength(request.getLength());
        // response.setLatestyear(request.getLatestyear());
        // response.setYearrange(request.getYearrange());
        // //response.putAllHighestGrowthStates(response4.getHighestGrowthStatesMap());
        // response.setHighestGrowthStates("A");

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
        System.out.println("Service4 Query Hit!");
    }

}
