package cn.springmvc.mapper;

import cn.springmvc.model.Share;

public interface ShareMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Share record);

    int insertSelective(Share record);

    Share selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Share record);

    int updateByPrimaryKey(Share record);
}