package com.arvatosystem.web.filter;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * Created by Celine.Yang on 2017/7/11.
 */
@WebFilter(filterName = "druidStatFilter",urlPatterns = "/*",initParams = {
        @WebInitParam(name="exclusions",value="*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")
})
public class DruidStatFilter extends WebStatFilter{

}
