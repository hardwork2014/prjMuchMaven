package com.dooioo.common;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.log4j.Logger;

import java.io.Serializable;

/**
 * Created by hqm on 14-6-5.
 */
public class Configuration implements Serializable {
    private static Logger logger = Logger.getLogger(Configuration.class);

    //当前环境 测试development 生产production
    private String env;

    //当前环境的板块号
    private String version;

    //单例内部变量
    private static Configuration config;


    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    public synchronized static Configuration getIntance(){
        if(config == null){
            config = new Configuration();
            try{
                PropertiesConfiguration globalProperties = new PropertiesConfiguration("global.properties");
                globalProperties.setEncoding("UTF-8");
                config.setEnv(globalProperties.getString("env"));

                PropertiesConfiguration setupProperties = new PropertiesConfiguration(config.getEnv()+"_much.properties");
                setupProperties.setEncoding("UTF-8");
                config.setVersion(setupProperties.getString("version"));
            }catch (ConfigurationException e){
                logger.info("加载配置文件失败："+e.getMessage());
                e.printStackTrace();
            }
        }
        return config;
    }

}
