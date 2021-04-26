package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CmsPageRepository extends MongoRepository<CmsPage, String> {

    /**
     * 根据页面名称查询页面信息
     *
     * @param pageName
     * @return
     */
    CmsPage findByPageName(String pageName);

    /**
     * 根据页面名称和页面类型查询页面信息
     *
     * @param pageName
     * @param pageType
     * @return
     */
    CmsPage findByPageNameAndPageType(String pageName, String pageType);

    /**
     * 根据站点id和页面类型计算页面个数
     *
     * @param siteId
     * @param pageType
     * @return
     */
    int countBySiteIdAndPageType(String siteId, String pageType);

    /**
     * 根据站点id、分页信息和页面类型查询页面信息
     *
     * @param siteId
     * @param pageType
     * @param pageable
     * @return
     */

    Page<CmsPage> findBySiteIdAndPageType(String siteId, String pageType, Pageable pageable);

    /**
     * 根据 siteId 和 pageName pageWebPath 查找页面
     * @param siteId
     * @param pageName
     * @param pageWebPath
     * @return
     */
    CmsPage findBySiteIdAndPageNameAndPageWebPath(String siteId, String pageName, String pageWebPath);
}
