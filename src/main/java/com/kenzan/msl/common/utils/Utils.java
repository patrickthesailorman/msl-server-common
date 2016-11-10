package com.kenzan.msl.common.utils;

/**
 * @author Kenzan
 */
public class Utils {
    /**
     * Retrieves the host for an URL
     *
     * @param url String
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
            if (urlPort > 0 && urlPort < end) {
                return url.substring(0, end) + ":" + port;
            }
            return url.substring(0, urlPort);
        }
    }
}
