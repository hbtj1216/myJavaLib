package com.tao.treasurebag.utils;


/**
 * 字符串工具类
 * 
 * @author michael
 *
 */
public class StringUtils {

	/**
	 * 找不到下标
	 */
	public static final int INDEX_NOT_FOUND = -1;

	//-------------------字符常量---------------------
	public static final char C_SPACE = ' ';
	public static final char C_TAB = '	';
	public static final char C_DOT = '.';
	public static final char C_SLASH = '/';
	public static final char C_BACKSLASH = '\\';
	public static final char C_CR = '\r';
	public static final char C_LF = '\n';
	public static final char C_UNDERLINE = '_';
	public static final char C_COMMA = ',';
	public static final char C_DELIM_START = '{';
	public static final char C_DELIM_END = '}';
	public static final char C_BRACKET_START = '[';
	public static final char C_BRACKET_END = ']';
	public static final char C_COLON = ':';

	//-----------------字符串常量----------------------
	public static final String SPACE = " ";
	public static final String TAB = "	";
	public static final String DOT = ".";
	public static final String DOUBLE_DOT = "..";
	public static final String SLASH = "/";
	public static final String BACKSLASH = "\\";
	public static final String EMPTY = "";
	public static final String CR = "\r";
	public static final String LF = "\n";
	public static final String CRLF = "\r\n";
	public static final String UNDERLINE = "_";
	public static final String COMMA = ",";
	public static final String DELIM_START = "{";
	public static final String DELIM_END = "}";
	public static final String BRACKET_START = "[";
	public static final String BRACKET_END = "]";
	public static final String COLON = ":";

	//---------------HTML常用元素----------------------
	public static final String HTML_NBSP = "&nbsp;";
	public static final String HTML_AMP = "&amp";
	public static final String HTML_QUOTE = "&quot;";
	public static final String HTML_LT = "&lt;";
	public static final String HTML_GT = "&gt;";
	
	//--------------空json--------------------------
	public static final String EMPTY_JSON = "{}";
	
	//---------------Empty Checks-------------------------
	/**
	 * 检查字符串是否为空<br>
	 * 空的定义:<br>
	 * 1. 为null<br>
	 * 2. 为""<br>
	 * 
	 * @param str 被检测的字符串
	 * @return true or false
	 */
	public static boolean isEmpty(final CharSequence str) {
		return str == null || str.length() == 0;
	}
	
	/**
	 * 检查字符串是否不为空<br>
	 * 不为空的定义：<br>
	 * 1. 不为null<br>
	 * 2. 不为""<br>
	 * 
	 * @param str 被检测的字符串
	 * @return true or false
	 */
	public static boolean isNotEmpty(final CharSequence str) {
		return !isEmpty(str);
	}
	
	/**
	 * 检查传入的字符串数组中是否包含空的字符串<br>
	 * 空的定义:<br>
	 * 1. 为null<br>
	 * 2. 为""<br>
	 * 注意：字符数组本身为null或者元素个数为0，返回false
	 * 
	 * @param strs 被检查的字符串数组
	 * @return true or false
	 */
	public static boolean hasEmpty(final CharSequence... strs) {
		return isAnyEmpty(strs);
	}
	
	/**
	 * 检查传入的字符串数组中是否有为空的字符串<br>
	 * 空的定义:<br>
	 * 1. 为null<br>
	 * 2. 为""<br>
	 * 注意：字符数组本身为null或者元素个数为0，返回false
	 * 
	 * @param strs 被检查的字符串数组
	 * @return true or false
	 */
	public static boolean isAnyEmpty(final CharSequence... strs) {
		if(ArrayUtils.isEmpty(strs)) {
			return false;
		}
		//检查每一个字符串是否为空
		for(final CharSequence str : strs) {
			if(isEmpty(str)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 检查传入的字符串数组中是否所有的字符串都不为空，也就是没有为空的字符串<br>
	 * 空的定义:<br>
	 * 1. 为null<br>
	 * 2. 为""<br>
	 * 
	 * @param strs 被检查的字符串数组
	 * @return true or false
	 */
	public static boolean isNoneEmpty(final CharSequence... strs) {
		return !isAnyEmpty(strs);
	}
	
	/**
	 * 检查传入的字符串数组中的所有字符串是否都为空<br>
	 * 空的定义:<br>
	 * 1. 为null<br>
	 * 2. 为""<br>
	 * 
	 * @param strs 被检查的字符串数组
	 * @return true or false
	 */
	public static boolean isAllEmpty(final CharSequence... strs) {
		if(ArrayUtils.isEmpty(strs)) {
			return true;
		}
		//检查所有的字符串
		for(final CharSequence str : strs) {
			if(isNotEmpty(str)) {
				return false;
			}
		}
		return true;
	}
	
	
	
	
}











