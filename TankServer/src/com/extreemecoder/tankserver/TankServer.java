package com.extreemecoder.tankserver;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TankServer {
	
	public static void main(String[] args) {
		Server server = new Server(8192);
		server.start();
		
		InetAddress address = null; // 127.0.0.1 (localhost)
		try {
			address = InetAddress.getByName("192.168.1.10");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		int port = 8192;
		server.send(new byte[] { 0, 1, 2 }, address, port);
	}

}
