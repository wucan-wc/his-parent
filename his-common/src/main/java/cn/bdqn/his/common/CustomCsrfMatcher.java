package cn.bdqn.his.common;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.web.util.matcher.RequestMatcher;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Deprecated
@Component
@ConfigurationProperties(prefix = "csrf.allowed.server")
public class CustomCsrfMatcher implements RequestMatcher {
    public static final String HEADER_NAME = "remoteHost";

    private final HashSet<String> allowedMethods = new HashSet<>(
            Arrays.asList("GET","TRACE","HEAD","OPTIONS")
    );

    private Set<String> urls;


    @Override
    public boolean matches(HttpServletRequest httpServletRequest) {
        boolean returnValue = !this.allowedMethods.contains(httpServletRequest.getMethod());
        if(returnValue) {
            String remoteHost = httpServletRequest.getHeader(HEADER_NAME);
            if (remoteHost != null) {
                returnValue = !urls.contains(remoteHost);
            }
        }
        return returnValue;
    }

    public void setUrls(Set<String> urls){
        this.urls = urls;
    }

}
