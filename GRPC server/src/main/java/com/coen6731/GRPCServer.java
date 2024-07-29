package com.coen6731;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

import com.coen6731.services.*;

public class GRPCServer {
	
	public static void main(String args[]) throws InterruptedException, IOException {
		Server server = ServerBuilder
			.forPort(8080)
				.addService(new QueryService1())
				.addService(new QueryService2())
				.addService(new QueryService3())
				.addService(new QueryService4())
				.addService(new QueryService5())
				.build();

		
		server.start();
		System.out.println("Gateway started:");
		server.awaitTermination();
	}
}
