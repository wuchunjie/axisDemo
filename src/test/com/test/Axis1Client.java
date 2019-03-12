package com.test;

import java.net.MalformedURLException;
import java.rmi.RemoteException;
import javax.xml.rpc.ServiceException;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

public class Axis1Client {
    public static void main(String[] args) {
        //测试提供给pb的短信服务
        try {
            String endpoint = "http://localhost:8080/axisDemo/services/myWebService?WSDL";
            //String endpoint = "http://localhost:8080/SmsServer/axisServices/Axis1SmsServer?wsdl";
            Service service = new Service(); // 创建一个Service实例，注意是必须的！
            Call call = (Call) service.createCall(); // 创建Call实例，也是必须的！
            call.setTargetEndpointAddress(new java.net.URL(endpoint));// 为Call设置服务的位置
            call.setOperationName("doService"); // 注意方法名与JavaBeanWS.java中一样！！
            String res = (String)call.invoke(new Object[]{"",""});
            System.out.println(" res:"+res);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (ServiceException e) {
            e.printStackTrace();
        }
    }
}