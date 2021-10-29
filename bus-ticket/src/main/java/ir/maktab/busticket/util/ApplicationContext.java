package ir.maktab.busticket.util;


import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;

public class ApplicationContext {
    public static final ServletRequestAttributes attr = (ServletRequestAttributes)
            RequestContextHolder.currentRequestAttributes();
    public static final HttpSession session = ApplicationContext.attr.getRequest().getSession();

}
