/*
 * Copyright 2015, Kenzan, All rights reserved.
 */
package com.kenzan.msl.common.bo;

import com.kenzan.msl.common.dto.AbstractArtistDto;
import com.kenzan.msl.common.dto.AbstractDto;

/**
 * @author kenzan
 */
public class ArtistListBo extends AbstractListBo<ArtistBo> {

    /**
     * Implementation of super class method for Artists
     * Creates a new ArtistBo and map into it the info from the given Dto
     *
     * @param abstractDto the Dto to be converted
     * @return the Dto's equivalent Bo
     */
    @Override
    public ArtistBo convertDtoToBo(AbstractDto abstractDto) {
        AbstractArtistDto abstractArtistDto = (AbstractArtistDto) abstractDto;

        ArtistBo artistBo = new ArtistBo();
        artistBo.setArtistId(abstractArtistDto.getArtistId());
        artistBo.setArtistMbid(abstractArtistDto.getArtistMbid());
        artistBo.setArtistName(abstractArtistDto.getArtistName());
        artistBo.setImageLink(abstractArtistDto.getImageLink());

        return artistBo;
    }
}
