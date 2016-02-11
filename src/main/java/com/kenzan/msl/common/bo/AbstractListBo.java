/*
 * Copyright 2015, Kenzan, All rights reserved.
 */
package com.kenzan.msl.common.bo;

import com.kenzan.msl.common.dto.AbstractDto;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author kenzan
 */
public abstract class AbstractListBo<T extends AbstractBo> {
    private UUID pagingState;
    private List<T> boList = new ArrayList<T>();

    public UUID getPagingState() {
        return pagingState;
    }

    public void setPagingState(UUID pagingState) {
        this.pagingState = pagingState;
    }

    public void add(AbstractDto dto) {
        boList.add(convertDtoToBo(dto));
    }

    public List<T> getBoList() {
        return boList;
    }

    public abstract T convertDtoToBo(AbstractDto dto);
}
