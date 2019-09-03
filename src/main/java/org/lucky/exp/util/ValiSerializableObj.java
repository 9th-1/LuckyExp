/** 
 * @Project Name : LuckyExp
*
* @File name : ValiSerializableObj.java
*
* @Author : FayeWong
*
* @Email : 50125289@qq.com
*
----------------------------------------------------------------------------------
*    Who        Version     Comments
* 1. FayeWong    1.0
*
*
*
*
----------------------------------------------------------------------------------
*/
package org.lucky.exp.util;
import java.lang.reflect.Field;
import org.lucky.exp.exception.BindException;
/**
 * 对常见的实现序列化进行校验
*
* @author FayeWong
* @date 2019年8月31日
 */
public class ValiSerializableObj {
	public static boolean validation(Field field,boolean valiType) throws BindException {
		Class<?>[] clazzes = field.getType().getInterfaces();
		for(Class<?> clazz : clazzes) {
			if(clazz == String.class) {
				return valiType = false;
			}else if(clazz == Byte.class) {
				return valiType = false;
			}else if(clazz == Character.class) {
				return valiType = false;
			}else if(clazz == Short.class) {
				return valiType = false;
			}else if(clazz == Integer.class) {
				return valiType = false;
			}else if(clazz == Long.class) {
				return valiType = false;
			}else if(clazz == Float.class) {
				return valiType = false;
			}else if(clazz == Double.class) {
				return valiType = false;
			}else if(clazz == Boolean.class) {
				return valiType = false;
			}
		}
		return valiType;
	}
}
