/*
 * Copyright 2015, Kenzan, All rights reserved.
 */
package com.kenzan.msl.common.bo;

import com.kenzan.msl.common.dto.AbstractDto;
import com.kenzan.msl.common.dto.AbstractSongDto;

/**
 * @author billschwanitz
 */
public class SongListBo extends AbstractListBo<SongBo> {
    @Override
    public SongBo convertDtoToBo(AbstractDto abstractDto) {
        AbstractSongDto abstractSongDto = (AbstractSongDto) abstractDto;

        SongBo songBo = new SongBo();
        songBo.setSongId(abstractSongDto.getSongId());
        songBo.setSongName(abstractSongDto.getSongName());
        songBo.setDuration(abstractSongDto.getSongDuration());
        songBo.setYear(abstractSongDto.getAlbumYear());
        songBo.setArtistId(abstractSongDto.getArtistId());
        songBo.setArtistMbid(abstractSongDto.getArtistMbid());
        songBo.setArtistName(abstractSongDto.getArtistName());
        songBo.setAlbumId(abstractSongDto.getAlbumId());
        songBo.setAlbumName(abstractSongDto.getAlbumName());
        songBo.setImageLink(abstractSongDto.getImageLink());

        return songBo;
    }
}
