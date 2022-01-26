package com.credable.currencyzuulapigetway;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * if we want to apply multiple type of filter, then we have to create multiple class extends to ZuulFilter.
 * and we can set order to various filter as 1 onwards.
 */
@Component
public class ZuulLoggingFilter extends ZuulFilter {

    private final Logger logger = LoggerFactory.getLogger(ZuulLoggingFilter.class);

    /**
     * <b>pre</b> : filter will be applicable before request is executed
     * <br>
     * <b>post</b> : filter will be applicable after request is executed
     * <br>
     * <b>error</b> : filter will be applicable only in case of error
     *
     * @return string as "pre", "post", "error"
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * setting filter apply order. if we assign 1 then this filter will apply over request
     *
     * @return
     */
    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
        logger.info("request -> {} request url -> {}", request, request.getRequestURI());
        return null;
    }
}
