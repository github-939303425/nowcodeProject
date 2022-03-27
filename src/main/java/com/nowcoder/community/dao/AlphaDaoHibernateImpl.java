package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author dps
 * @create 2022-03-24-17:39
 */

@Repository("alphaHibernate")
public class AlphaDaoHibernateImpl implements AlphaDao{

    @Override
    public String select() {
        return "Hibernate";
    }

}
