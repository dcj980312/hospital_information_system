package com.jk.dao.test;

import com.jk.model.test.TestModel;

import java.util.List;

/**
 * &lt;pre&gt;项目名称：hospital_information_system
 * 类名称：com.jk.dao.test
 * 类描述：
 * 创建人：丁成杰  Email -904531558@qq.com
 * 创建时间：2018/1/22 15:24
 * 修改人：丁成杰 Email -904531558@qq.com
 * 修改时间：2018/1/22 15:24
 * 修改备注：
 *
 * @version ${ENCLOSING_TYPE}${TAGS}&lt;/pre&gt;
 */
public interface TestDao {

    List<TestModel> findTree(int i);
}
