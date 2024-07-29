package assignment_2_client;

import com.coen6731.grpc.*;
import com.coen6731.grpc.QueryService1Grpc.QueryService1BlockingStub;
import com.coen6731.grpc.QueryService2Grpc.QueryService2BlockingStub;
import com.coen6731.grpc.QueryService3Grpc.QueryService3BlockingStub;
import com.coen6731.grpc.QueryService4Grpc.QueryService4BlockingStub;
import com.coen6731.grpc.QueryService5Grpc.QueryService5BlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class gRPcClient {
	public static void main(String args[]) {
		ManagedChannel channel = ManagedChannelBuilder
			.forAddress("168.138.91.143", 8080).usePlaintext().build();
		
		QueryService1BlockingStub queryStub1 = QueryService1Grpc.newBlockingStub(channel);
		QueryService2BlockingStub queryStub2 = QueryService2Grpc.newBlockingStub(channel);
		QueryService3BlockingStub queryStub3 = QueryService3Grpc.newBlockingStub(channel);
		QueryService4BlockingStub queryStub4 = QueryService4Grpc.newBlockingStub(channel);
		QueryService5BlockingStub queryStub5 = QueryService5Grpc.newBlockingStub(channel);

//  		//1st query
		QueryRequest1 queryRequest1 = QueryRequest1
			.newBuilder()
				.setYear("2017")
				.setState("Alabama")
				.setType("Private")
				.setLength("4-year")
				.setExpense("Fees/Tuition")
			.build();
		
		QueryResponse1 response1= queryStub1.getQueryResult1(queryRequest1);
		
		System.out.println(response1.toString());
		System.out.println();
		
// 		//2nd query
		QueryRequest2 queryRequest2 = QueryRequest2
			.newBuilder()
				.setYear("2015")
				.setType("Private")
				.setLength("4-year")
			.build();
		
		QueryResponse2 response2 = queryStub2.getQueryResult2(queryRequest2);
		
		System.out.println(response2.toString());
		System.out.println();
		
// 		//3rd query
		QueryRequest3 queryRequest3 = QueryRequest3
		.newBuilder()
			.setYear("2017")
			.setType("Private")
			.setLength("4-year")
		.build();
	
		QueryResponse3 response3 = queryStub3.getQueryResult3(queryRequest3);
	
		System.out.println(response3.toString());
		System.out.println();

		//4th query
		QueryRequest4 queryRequest4 = QueryRequest4
		.newBuilder()
			.setType("Private")
			.setLength("4-year")
			.setLatestyear("2017")
			.setYearrange("1")
		.build();
	
		QueryResponse4 response4 = queryStub4.getQueryResult4(queryRequest4);
	
		System.out.println(response4.toString());
		System.out.println();

		//5th query
		QueryRequest5 queryRequest5 = QueryRequest5
		.newBuilder()
			.setYear("2017")
			.setType("Private")
			.setLength("4-year")
		.build();
	
		QueryResponse5 response5 = queryStub5.getQueryResult5(queryRequest5);
	
		System.out.println(response5.toString());
		System.out.println();
		channel.shutdown();
	}
}
