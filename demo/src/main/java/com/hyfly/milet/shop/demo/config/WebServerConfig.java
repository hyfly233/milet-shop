package com.hyfly.milet.shop.demo.config;

import org.apache.coyote.http11.Http11NioProtocol;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.stereotype.Component;

/**
 * 当Spring容器中没有TomcatEmbeddedServletContainerFactory时，会把此bean加载到容器中
 */
@Component
public class WebServerConfig implements WebServerFactoryCustomizer<TomcatServletWebServerFactory> {
    @Override
    public void customize(TomcatServletWebServerFactory factory) {
        factory.addConnectorCustomizers(connector -> {
            Http11NioProtocol protocol = (Http11NioProtocol) connector.getProtocolHandler();
            // keepAliveTimeout设置30s没有请求自动断开，设置为0，表示不使用keep-alive
            protocol.setKeepAliveTimeout(30000);
            // maxKeepAliveRequests客户端发送超过10000则自动断开连接，设置为0，表示不使用keep-alive
            protocol.setMaxKeepAliveRequests(10000);
        });
    }
}
