package com.oneinlet;

import java.util.Collection;
import java.util.Map;

import com.oneinlet.format.DefaultPrintFormat;
import com.oneinlet.format.PrintFormat;
import com.oneinlet.format.json.JsonPrintFormat;

/**
 * Created by WangZiHe on 2017年11月16日 QQ/WeChat:648830605 QQ-Group:368512253
 * Blog:www.520code.net Github:https://github.com/yancheng199287
 */

public class Sprint {

    public static Sprint sprint = new Sprint();

    private static PrintFormat pf = new JsonPrintFormat();

    public static Sprint getInstance() {
        return sprint;
    }

    public static Sprint getInstance(PrintFormat pf) {
        Sprint.pf = pf;
        return sprint;
    }

    public void print(Object data) {
        String content = " data is empty";
        if (data == null) {
            System.out.println(" data is null ");
        } else if (isBaseType(data)) {
            content = pf.printBaseType(data);
        } else if (data instanceof Map) {
            content = pf.printMap(data);
        } else if (data instanceof Collection) {
            content = pf.printCollection(data);
        } else if (data.getClass().isArray()) {
            content = pf.printArray(data);
        } else {
            content = pf.printBean(data);
        }

        System.out.println("\n" + content + "\n");
    }

    private boolean isBaseType(Object data) {
        return data.getClass().isAssignableFrom(Integer.class) || (data.getClass().isAssignableFrom(Boolean.class) || (data.getClass().isAssignableFrom(Character.class) || (data.getClass().isAssignableFrom(Double.class) || data.getClass().isAssignableFrom(String.class))));
    }

}
