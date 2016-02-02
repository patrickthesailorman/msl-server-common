/*
 * Copyright 2015, Kenzan, All rights reserved.
 */
package com.kenzan.msl.common.bo;

import com.kenzan.msl.common.dto.AbstractArtistDto;
import com.kenzan.msl.common.dto.AbstractDto;

/**
 * @author billschwanitz
 */
public class ArtistListBo extends AbstractListBo<ArtistBo> {
    @Override
    public ArtistBo convertDtoToBo(AbstractDto abstractDto) {
        AbstractArtistDto abstractArtistDto = (AbstractArtistDto) abstractDto;

        ArtistBo artistBo = new ArtistBo();
        artistBo.setArtistId(abstractArtistDto.getArtistId());
        artistBo.setArtistMbid(abstractArtistDto.getArtistMbid());
        artistBo.setArtistName(abstractArtistDto.getArtistName());

        return artistBo;
    }
}