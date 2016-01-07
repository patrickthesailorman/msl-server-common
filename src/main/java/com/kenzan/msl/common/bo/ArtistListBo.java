/*
 * Copyright 2015, Kenzan, All rights reserved.
 */
package com.kenzan.msl.common.bo;

import com.kenzan.msl.common.dao.AbstractArtistDao;
import com.kenzan.msl.common.dao.AbstractDao;

/**
 * @author billschwanitz
 */
public class ArtistListBo extends AbstractListBo<ArtistBo> {
    @Override
    public ArtistBo convertDaoToBo(AbstractDao abstractDao) {
        AbstractArtistDao abstractArtistDao = (AbstractArtistDao) abstractDao;

        ArtistBo artistBo = new ArtistBo();
        artistBo.setArtistId(abstractArtistDao.getArtistId());
        artistBo.setArtistMbid(abstractArtistDao.getArtistMbid());
        artistBo.setArtistName(abstractArtistDao.getArtistName());

        return artistBo;
    }
}
