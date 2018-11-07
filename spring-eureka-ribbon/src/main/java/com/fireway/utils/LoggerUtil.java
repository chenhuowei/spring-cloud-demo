package com.fireway.utils;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: chenhuowei
 * @Date: 2018/11/7 14:42
 * @Description:
 */
public class LoggerUtil {

    private static Map<Class,Logger> loggerMap = new HashMap<>();


    public static  void info(String message,Class clazz){
        Logger logger = getLogger(clazz);
        logger.info("***************************************\n");
        logger.info(message+"\n");
        logger.info("***************************************");

    }

    public static  void debug(String message,Class clazz){
        Logger logger = getLogger(clazz);
        logger.info("***************************************\n");
        logger.debug(message+"\n");
        logger.info("***************************************");

    }

    private static Logger getLogger(Class clazz){
        Logger logger = loggerMap.get(clazz);
        if (null == logger){
            logger = LoggerFactory.getLogger(clazz);
            loggerMap.put(clazz,logger);
        }
        return logger;
    }



}
