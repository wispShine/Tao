package com.zhiyou100.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.SocketException;

import org.apache.commons.net.ftp.FTPClient;

public class FtpUtil {
	
	//ftp上传
	
	public void upload(InputStream inputStream,String fileName) throws SocketException, IOException {
		//1.实例化ftpclient
		FTPClient fTPClient = new FTPClient();
		//2.连接服务器
		fTPClient.connect("ftp://192.168.0.72/");
		//3.登录服务器
		fTPClient.login("fdz", "root");
		//上传文件
		fTPClient.changeWorkingDirectory("/home/fdfs_storage/data");
		fTPClient.setFileType(FTPClient.BINARY_FILE_TYPE);
		fTPClient.storeFile(fileName, inputStream);
		//关闭
		fTPClient.logout();
	}
	
}
