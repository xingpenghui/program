package com.qfedu.mapper;

import com.qfedu.pojo.Wallet;

public interface WalletMapper {
    int deleteByPrimaryKey (Integer id);

    int insert (Wallet record);

    int insertSelective (Wallet record);

    Wallet selectByPrimaryKey (Integer id);

    int updateByPrimaryKeySelective (Wallet record);

    int updateByPrimaryKey (Wallet record);
}