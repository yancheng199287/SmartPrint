package com.oneinlet.format;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by WangZiHe on 2017年11月16日 QQ/WeChat:648830605 QQ-Group:368512253
 * Blog:www.520code.net Github:https://github.com/yancheng199287
 */

/**
 * <h3>仅供才参考，不推荐使用，该格式化器无法打印嵌套对象，仅支持第一层，推荐使用Json格式化器</h3>
 */
@Deprecated
public final class DefaultPrintFormat extends AbstractPrintFormat {

    @Override
    public String printBaseType(Object data) {
        return "\n " + data + " \n";

    }

    @Override
    public String printMap(Object data) {
        Map<?, ?> map = (Map<?, ?>) data;
        String content = "\n size of Map is " + map.size();
        Iterator<?> arg4 = map.entrySet().iterator();
        while (arg4.hasNext()) {
            Map.Entry<?, ?> element$iv = (Map.Entry<?, ?>) arg4.next();
            content += "key is " + element$iv.getKey() + ", value is " + element$iv.getValue();
        }
        return content;
    }

    @Override
    public String printCollection(Object data) {
        Collection<?> collection = (Collection<?>) data;
        String content = "\n size of Collection is " + collection.size() + ' ';
        content += StringUtils.join((Iterable<?>) collection, ",");
        return content;
    }

    @Override
    public String printArray(Object data) {
        Object[] array = (Object[]) data;
        String content = "\n size of Array is " + array.length + ' ';
        content += StringUtils.join(array, ",");
        return content;
    }

    @Override
    public String printBean(Object data) {
        Class<?> c = data.getClass();
        String content = "\n simple name of Bean is " + c.getName() + ' ';
        Map<String, Object> $receiver$iv1 = new HashMap<String, Object>();
        // 获取所有的属性?
        Field[] fs = c.getDeclaredFields();
        for (Field field : fs) {
            field.setAccessible(true);
            try {
                $receiver$iv1.put(field.getName(), field.get(data).toString());
            } catch (IllegalArgumentException | IllegalAccessException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        Iterator<Entry<String, Object>> arg3 = $receiver$iv1.entrySet().iterator();
        while (arg3.hasNext()) {
            Map.Entry<String, Object> element$iv = (Map.Entry<String, Object>) arg3.next();
            content += "property is " + (String) element$iv.getKey() + ", value is " + (String) element$iv.getValue();
        }
        return content;
    }

}
