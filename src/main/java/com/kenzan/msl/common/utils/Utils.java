package com.kenzan.msl.common.utils;

/**
 * @author Kenzan
 */
public class Utils {
    /**
     * Retrieves the host for an URL
     *
     * @param url String
     * @param port String
     * @return
     */
    public static String getHost(String url, String port){
        if(url == null || url.length() == 0) {
            return "";
        } else {
            int doubleslash = url.indexOf("//");
            if(doubleslash == -1)
                doubleslash = 0;
            else
                doubleslash += 2;

            int end = url.indexOf('/', doubleslash);
            end = end >= 0 ? end : url.length();

            int urlPort = url.indexOf(':', doubleslash);

            String result;
            if (port.length() > 0) {
                result = url.substring(0, urlPort) + ":" + port;
            } else {
                result = url.substring(0, end);
            }
            return result;
        }
    }
}
