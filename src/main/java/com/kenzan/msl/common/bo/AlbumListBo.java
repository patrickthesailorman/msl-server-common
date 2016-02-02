/*
 * Copyright 2015, Kenzan, All rights reserved.
 */
package com.kenzan.msl.common.bo;


import com.kenzan.msl.common.dto.AbstractAlbumDto;
import com.kenzan.msl.common.dto.AbstractDto;

/**
 * @author billschwanitz
 */
public class AlbumListBo extends AbstractListBo<AlbumBo> {

    @Override
    public AlbumBo convertDtoToBo(AbstractDto abstractDto) {
        AbstractAlbumDto abstractAlbumDto = (AbstractAlbumDto) abstractDto;

        AlbumBo albumBo = new AlbumBo();
        albumBo.setAlbumId(abstractAlbumDto.getAlbumId());
        albumBo.setAlbumName(abstractAlbumDto.getAlbumName());
        albumBo.setYear(abstractAlbumDto.getAlbumYear());
        albumBo.setArtistId(abstractAlbumDto.getArtistId());
        albumBo.setArtistName(abstractAlbumDto.getArtistName());
        albumBo.setImageLink(abstractAlbumDto.getImageLink());

        return albumBo;
    }

}