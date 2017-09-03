package com.tao.java;

/**
 * Created by michael on 17-8-26.
 */

import java.io.*;

/**
 * 克隆工具类
 */
public class CloneUtils {

    /**
     * 深克隆.
     * @param src
     * @return
     */
    public static Object deepClone(Object src) {

        ByteArrayOutputStream memoryBuffer = new ByteArrayOutputStream();
        ObjectOutputStream out = null;
        ObjectInputStream in = null;

        Object dest = null;

        try {
            out = new ObjectOutputStream(memoryBuffer);
            //序列化到流
            out.writeObject(src);
            out.flush();
            in = new ObjectInputStream(new ByteArrayInputStream(memoryBuffer.toByteArray()));
            dest = in.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (out != null)
                try {
                    out.close();
                    out = null;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            if (in != null)
                try {
                    in.close();
                    in = null;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
        }
        return dest;
    }
}







