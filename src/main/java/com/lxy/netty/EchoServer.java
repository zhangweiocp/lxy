package com.lxy.netty;

public class EchoServer {
	private final int port;
	public EchoServer(int port){
		this.port = port;
	}
	
	public static void main(String[] args)throws Exception{
		if(args.length != 1){
			System.err.println("Usage:" + EchoServer.class.getSimpleName()+"<port>");
			return;
		}
		int port = Integer.parseInt(args[0]);
		//调用服务器的start方法
		new EchoServer(port).start();
	}

	public void start()throws Exception {
		final EchoServerHandler serverHandler = new EchoServerHandler();
		
	}
}
