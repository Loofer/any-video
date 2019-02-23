package cn.ictgu.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.embedded.undertow.UndertowServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SslConfig {

    @Value("${server.sslPort}")
    private int port;

    /**
     * 增加 80 端口的监听
     */
    @Bean
    public UndertowServletWebServerFactory servletContainer() {

        UndertowServletWebServerFactory undertowFactory = new UndertowServletWebServerFactory();
        undertowFactory.addBuilderCustomizers(builder -> builder.addHttpListener(port, "0.0.0.0"));
        return undertowFactory;
    }

}
