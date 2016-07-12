package com.kenzan.msl.common;

/**
 * Created by anram88 on 6/29/16.
 */
public enum ContentType {

    ARTIST("Artist"), ALBUM("Album"), SONG("Song");

    public final String value;

    ContentType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static boolean hasValidContentType(String type) {
        for (ContentType contentType : ContentType.values()) {
            if (type.equals(contentType.value)){
                return true;
            }
        }
        return false;
    }
}
