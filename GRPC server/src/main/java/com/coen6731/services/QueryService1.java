package com.coen6731.services;

import com.coen6731.grpc.QueryRequest1;
import com.coen6731.grpc.QueryResponse1;
import com.coen6731.grpc.QueryService1Grpc;
import com.coen6731.grpc.QueryService1Grpc.QueryService1BlockingStub;
import com.coen6731.grpc.QueryService1Grpc.QueryService1ImplBase;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class QueryService1 extends QueryService1ImplBase{

	@Override
	public void getQueryResult1(QueryRequest1 request, StreamObserver<QueryResponse1> responseObserver) {

		//send to DAO Service.
		ManagedChannel channel = ManagedChannelBuilder
			.forAddress("168.138.71.16", 9091).usePlaintext().build();

		QueryService1BlockingStub queryStub = QueryService1Grpc.newBlockingStub(channel);
		
		QueryRequest1 queryRequest1 = QueryRequest1
			.newBuilder()
				.setYear(request.getYear())
				.setState(request.getState())
				.setType(request.getType())
				.setLength(request.getLength())
				.setExpense(request.getExpense())
			.build();
		
		//response from DAO.	
		QueryResponse1 response1= queryStub.getQueryResult1(queryRequest1);

		QueryResponse1.Builder response = QueryResponse1.newBuilder();
		response.setYear(response1.getYear());
		response.setState(response1.getState());
		response.setType(response1.getType());
		response.setLength(response1.getLength());
		response.setExpense(response1.getExpense());
		response.setValue(response1.getValue());
		
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();

		System.out.println("Service1 Query Hit!");
	}

}
