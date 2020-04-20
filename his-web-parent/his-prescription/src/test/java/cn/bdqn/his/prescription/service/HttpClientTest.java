package cn.bdqn.his.prescription.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class HttpClientTest {
    @Test
    public void test1(){
        //获得HTTP客户端
        CloseableHttpClient httpClient= HttpClientBuilder.create().build();
        //参数
        StringBuffer sb=new StringBuffer();
        try {
            sb.append("type=1");
            sb.append("&");
            sb.append("code="+ URLEncoder.encode("R","utf-8"));
            sb.append("&");
            sb.append("pageNum="+1);
            sb.append("&");
            sb.append("pageSize="+5);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        //创建get请求
        HttpGet get=new HttpGet("http:/localhost:9007/api/prescriptionmodel"+"?"+sb);
        //响应模型
        CloseableHttpResponse response=null;
        try {
            //客户端执行
            response=httpClient.execute(get);
            //从响应模型中获取响应实体
            HttpEntity responseEntity =response.getEntity();
            if(responseEntity!=null){
                System.out.println("响应内容长度："+responseEntity.getContentLength());
                System.out.println("响应内容："+ EntityUtils.toString(responseEntity));
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if(httpClient!=null){
                    httpClient.close();
                }
                if(response!=null){
                    response.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }

        }

    }
}
