package com.tao.treasurebag.utils;

import java.lang.reflect.Array;

/**
 * 数组工具类
 * 
 * @author michael
 *
 */
public class ArrayUtils {

	private ArrayUtils() {

	}
	
	//--------------getLength---------------------
	/**
	 * 获得数组对象的长度
	 * 
	 * @param array 数组对象
	 * @return 长度值
	 */
	public static int getLength(final Object array) {
		if(array == null) {
			return 0;
		}
		return Array.getLength(array);
	}
	
	//------------------Empty Checks------------------
	/**
	 * 检查Object数组是否为空<br>
	 * 空的定义:<br>
	 * 1. 为null<br>
	 * 2. 数组长度为0，没有元素<br>
	 * 
	 * @param array 被检查的数组
	 * @return true or false
	 */
	public static boolean isEmpty(final Object[] array) {
		return getLength(array) == 0;
	}
	
	/**
	 * 检查字符数组是否为空<br>
	 * 空的定义:<br>
	 * 1. 为null<br>
	 * 2. 数组长度为0，没有元素<br>
	 * 
	 * @param array 被检查的数组
	 * @return true or false
	 */
	public static boolean isEmpty(final char[] array) {
		return getLength(array) == 0;
	}
}
