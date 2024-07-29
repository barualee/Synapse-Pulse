package com.coen6731.services;

import com.coen6731.grpc.QueryRequest5;
import com.coen6731.grpc.QueryResponse5;
import com.coen6731.grpc.QueryService5Grpc;
import com.coen6731.grpc.QueryService5Grpc.QueryService5BlockingStub;
import com.coen6731.grpc.QueryService5Grpc.QueryService5ImplBase;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;


public class QueryService5 extends QueryService5ImplBase{

    @Override
    public void getQueryResult5(QueryRequest5 request, StreamObserver<QueryResponse5> responseObserver) {

        //send to DAO Service.
        ManagedChannel channel = ManagedChannelBuilder
            .forAddress("168.138.71.16", 9095).usePlaintext().build();

        QueryService5BlockingStub queryStub5 = QueryService5Grpc.newBlockingStub(channel);
        
        QueryRequest5 queryRequest5 = QueryRequest5
            .newBuilder()
                .setYear(request.getYear())
                .setType(request.getType())
                .setLength(request.getLength())
            .build();
        
        //response from DAO.	
        QueryResponse5 response5 = queryStub5.getQueryResult5(queryRequest5);


        QueryResponse5.Builder response = QueryResponse5.newBuilder();
        response.setYear(response5.getYear());
        response.setType(response5.getType());
        response.setLength(response5.getLength());
        response.setRegionsAverage(response5.getRegionsAverage());

        // QueryResponse5.Builder response = QueryResponse5.newBuilder();
        // response.setYear(request.getYear());
        // response.setType(request.getType());
        // response.setLength(request.getLength());
        // //response.putAllRegionsAverage(response5.getRegionsAverageMap());
        // response.setRegionsAverage("R");

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
        System.out.println("Service5 Query Hit!");
    }

}
