package com.jk.model.test;

import java.io.Serializable;
import java.util.List;

/**
 * &lt;pre&gt;项目名称：hospital_information_system
 * 类名称：com.jk.model.test
 * 类描述：
 * 创建人：丁成杰  Email -904531558@qq.com
 * 创建时间：2018/1/22 14:48
 * 修改人：丁成杰 Email -904531558@qq.com
 * 修改时间：2018/1/22 14:48
 * 修改备注：
 *
 * @version ${ENCLOSING_TYPE}${TAGS}&lt;/pre&gt;
 */
public class TestModel implements Serializable{
    private static final long serialVersionUID = -1487187450649224675L;


    private int  id;

    private String text;

    private String url;

    private int pid;

    private List<TestModel> nodes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public List<TestModel> getNodes() {
        return nodes;
    }

    public void setNodes(List<TestModel> nodes) {
        this.nodes = nodes;
    }
}
