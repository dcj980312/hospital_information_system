package com.jk.controller.test;

import com.jk.model.test.TestModel;
import com.jk.service.test.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * &lt;pre&gt;项目名称：hospital_information_system
 * 类名称：com.jk.controller.test
 * 类描述：
 * 创建人：丁成杰  Email -904531558@qq.com
 * 创建时间：2018/1/22 14:42
 * 修改人：丁成杰 Email -904531558@qq.com
 * 修改时间：2018/1/22 14:42
 * 修改备注：
 *
 * @version ${ENCLOSING_TYPE}${TAGS}&lt;/pre&gt;
 */
@Controller
@RequestMapping("testController")
public class TestController {
    @Autowired
    private TestService testService;


    @RequestMapping("findTree")
    @ResponseBody
    public List<TestModel> findTree(){
        List<TestModel> list=testService.findTree(0);
        List<TestModel> findTreeFalg = findTreeFalg(list);
        return findTreeFalg;
    }

    public List<TestModel> findTreeFalg(List<TestModel> list){
        List<TestModel> childList =new ArrayList<>();
        for (int i = 0; i <list.size(); i++) {
            TestModel tree=list.get(i);
            List<TestModel> addlist=testService.findTree(tree.getId());
            if(addlist.size()>0){
                List<TestModel> findList=findTreeChild(addlist);
                tree.setNodes(findList);
                childList.add(tree);
            }else{
                childList.add(tree);
            }
        }
        return childList;
    }

    public List<TestModel> findTreeChild(List<TestModel> childList){
        List<TestModel> listChild =new ArrayList<TestModel>();
        for (int i = 0; i < childList.size(); i++) {
            TestModel tree=childList.get(i);
            List<TestModel> addlistDemo=testService.findTree(tree.getId());
            if(addlistDemo.size()>0){
                List<TestModel> getlistDemo=findTreeChild(addlistDemo);
                tree.setNodes(getlistDemo);
                listChild.add(tree);
            }else{
                listChild.add(tree);
            }
        }
        return listChild;
    }


}
