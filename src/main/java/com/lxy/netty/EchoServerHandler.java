package com.lxy.netty;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.CharsetUtil;

@Sharable
public class EchoServerHandler extends ChannelInboundHandlerAdapter{
	
	@Override
	public void channelRead(ChannelHandlerContext ctx,Object msg){
		ByteBuf in = (ByteBuf)msg;
		//将消息记录到控制台
		System.out.println("Server received: " + in.toString(CharsetUtil.UTF_8));
		//将接收到的消息写给发送者
		ctx.write(in);
	}
	
	@Override
	public void channelReadComplete(ChannelHandlerContext ctx){
		//将未决消息冲刷到远程结点，并关闭Channel
		ctx.writeAndFlush(Unpooled.EMPTY_BUFFER).addListener(ChannelFutureListener.CLOSE);
	}
	
	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause){
		cause.printStackTrace();
		ctx.close();
	}
}
