package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsPage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes=DaoTest.class)
@RunWith(SpringRunner.class)
public class DaoTest {

    @Autowired
    CmsPageRepository cmsPageRepository;

    @Test
    public void test01(){
        List<CmsPage> all = cmsPageRepository.findAll();
        System.out.println(all);
    }

}
