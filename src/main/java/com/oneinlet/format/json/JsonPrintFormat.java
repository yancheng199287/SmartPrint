package com.oneinlet.format.json;

import com.alibaba.fastjson.JSONObject;
import com.oneinlet.format.AbstractPrintFormat;

/**
 * Created by WangZiHe on 2017年11月16日 QQ/WeChat:648830605 QQ-Group:368512253
 * Blog:www.520code.net Github:https://github.com/yancheng199287
 */

public class JsonPrintFormat extends AbstractPrintFormat {

    @Override
    public String printBaseType(Object data) {
        // TODO Auto-generated method stub
        return JSONObject.toJSONString(data);
    }

    @Override
    public String printMap(Object data) {
        // TODO Auto-generated method stub
        return JSONObject.toJSONString(data);
    }

    @Override
    public String printCollection(Object data) {
        // TODO Auto-generated method stub
        return JSONObject.toJSONString(data);
    }


    @Override
    public String printArray(Object data) {
        return JSONObject.toJSONString(data);
    }


    @Override
    public String printBean(Object data) {
        // TODO Auto-generated method stub
        return JSONObject.toJSONString(data);
    }

}
