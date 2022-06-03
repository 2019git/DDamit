package com.ddamit.service.sys;

import com.ddamit.base.BaseService;
import com.ddamit.base.PageParam;
import com.ddamit.base.Pagination;
import com.ddamit.mapper.entity.sys.SysUser;
import com.ddamit.vo.sys.SysUserVo;
import org.apache.poi.ss.usermodel.Workbook;

/**
 * 用户表
 *
 * @author wangzhijun
 * @email developer@gmail.com
 * @date 2021-03-24 22:40:14
 */
public interface SysUserService extends BaseService<SysUser> {

    /**
     * 分页列表
     *
     * @author wangzhijun
     * @email developer@gmail.com
     * @date 2021-03-24 22:40:14
     */
    Pagination queryPage(PageParam pageParam);

    /**
     * 添加用户
     *
     * @param userVo
     */
    void addUser(SysUserVo userVo);

    /**
     * 查询详情信息
     *
     * @author wangzhijun
     * @email developer@gmail.com
     * @date 2021/3/27 18:06
     */
    SysUserVo queryInfo(Long id);

    /**
     * 修改详情信息
     *
     * @author wangzhijun
     * @email developer@gmail.com
     * @date 2021/3/27 18:39
     */
    void updateInfo(SysUserVo userVo);

    /**
     * 删除信息
     *
     * @author wangzhijun
     * @email developer@gmail.com
     * @date 2021/3/27 18:45
     */
    void deleteInfo(Long id);

    /**
     * 用户信息导出
     *
     * @author wangzhijun
     * @email developer@gmail.com
     * @date 2021/6/10 23:59
     */
    Workbook exportExcelUserInfo();
}

