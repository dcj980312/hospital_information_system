package com.jk.service.test.impl;

import com.jk.dao.test.TestDao;
import com.jk.model.test.TestModel;
import com.jk.service.test.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import redis.clients.jedis.ShardedJedisPool;

import java.util.List;

/**
 * &lt;pre&gt;项目名称：hospital_information_system
 * 类名称：com.jk.service.test.impl
 * 类描述：
 * 创建人：丁成杰  Email -904531558@qq.com
 * 创建时间：2018/1/22 14:50
 * 修改人：丁成杰 Email -904531558@qq.com
 * 修改时间：2018/1/22 14:50
 * 修改备注：
 *
 * @version ${ENCLOSING_TYPE}${TAGS}&lt;/pre&gt;
 */
@Service("testService")
public class TestServiceImpl implements TestService{


    @Autowired
    private TestDao testDao;

    @Autowired
    private ShardedJedisPool shardedJedisPool;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<TestModel> findTree(int i) {
        System.out.println("111");
        return testDao.findTree(i);
    }
}
