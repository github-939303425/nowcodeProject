package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author dps
 * @create 2022-03-25-18:40
 */
@Mapper
@Repository
public interface DiscussPostMapper {

    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    //@Param是给参数取一个别名,使用在mybatis-mapper中
    //如果只有一个参数,并且在<if>里面使用,则必须使用别名
    int selectDiscussPostRows(@Param("userId") int userId);

}
