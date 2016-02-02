/*
 * Copyright 2015, Kenzan, All rights reserved.
 */
package com.kenzan.msl.common.dto;

import java.util.UUID;

/**
 * Common super class for all Artist DTOs.
 *
 * NOTE: It would be nice to define here the columns that all Artist DTOs have in common.
 * Unfortunately the Datastax Mapper does not reflect on super classes when mapping result rows to
 * DTOs.
 *
 * @author billschwanitz
 */
public abstract class AbstractArtistDto extends AbstractDto {

    /**
     * @return the artistId
     */
    public abstract UUID getArtistId();

    /**
     * @param artistId the artistId to set
     */
    public abstract void setArtistId(UUID artistId);

    /**
     * @return the artistName
     */
    public abstract String getArtistName();

    /**
     * @param artistName the artistName to set
     */
    public abstract void setArtistName(String artistName);

    /**
     * @return the artistMbid
     */
    public abstract UUID getArtistMbid();

    /**
     * @param artistMbid the artistMbid to set
     */
    public abstract void setArtistMbid(UUID artistMbid);

    /**
     * @return the album imageLink
     */
    public abstract String getImageLink();

    /**
     * @param imageLink the imageLink to set
     */
    public abstract void setImageLink(String imageLink);

}

