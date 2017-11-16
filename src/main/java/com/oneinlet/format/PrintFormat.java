package com.oneinlet.format;

/**
 * Created by WangZiHe on 2017年11月16日 QQ/WeChat:648830605 QQ-Group:368512253
 * Blog:www.520code.net Github:https://github.com/yancheng199287
 */

public interface PrintFormat {

	String printBaseType(Object data);

	String printMap(Object data);

	String printCollection(Object data);

	String printArray(Object data);

	String printBean(Object data);

}
