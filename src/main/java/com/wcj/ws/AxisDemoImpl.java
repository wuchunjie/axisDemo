package com.wcj.ws;

import com.wcj.interfaze.AxisDemo;
import com.yjcloud.health.vcard.webservices.impl.ErhcService;
import com.yjcloud.health.vcard.webservices.impl.ErhcServiceImplService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.InvocationTargetException;

public class AxisDemoImpl implements AxisDemo {

    @Autowired
    private ErhcServiceImplService service;

    static Logger logger = Logger.getLogger(AxisDemoImpl.class);
    public String doService(String HeaderInParm, String BodyInParm) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        logger.info("HeaderInParm:"+HeaderInParm+"\nBodyInParm:"+BodyInParm);
        service = new ErhcServiceImplService();
        ErhcService erhcService = service.getErhcServiceImplPort();
        String responseXML = erhcService.doService(HeaderInParm,BodyInParm);
        logger.info("responseXML:"+responseXML);
        return responseXML;
    }
}
