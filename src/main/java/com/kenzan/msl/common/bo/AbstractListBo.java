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

    /**
     * Get Universal Unique ID used by Cassandra to handle pagination
     * 
     * @return the current list's paging state
     */
    public UUID getPagingState() {
        return pagingState;
    }

    /**
     * Set the Bo List Universal Unique ID for use it as pagination helper later
     * 
     * @param pagingState the paging state to set
     */
    public void setPagingState(UUID pagingState) {
        this.pagingState = pagingState;
    }

    /**
     * Appends a converted Dto to the Bo list
     * 
     * @param dto the abstract Dto that needs to be mapped to a Bo
     */
    public void add(AbstractDto dto) {
        boList.add(convertDtoToBo(dto));
    }

    /**
     * Get the current list
     * 
     * @return the list containing the BOs
     */
    public List<T> getBoList() {
        return boList;
    }

    /**
     * Converts any Dto to its Bo equivalent
     * 
     * @param dto the Dto to be converted
     * @return the Dto's equivalent Bo
     */
    public abstract T convertDtoToBo(AbstractDto dto);
}
