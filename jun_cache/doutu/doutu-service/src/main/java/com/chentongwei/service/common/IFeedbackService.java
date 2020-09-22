package com.chentongwei.service.common;

import com.chentongwei.common.entity.Page;
import com.chentongwei.entity.common.io.FeedbackIO;
import com.chentongwei.entity.common.io.StatusIO;
import com.chentongwei.entity.common.vo.FeedbackVO;

import java.util.List;

/**
 * 反馈业务层接口
 *
 * @author TongWei.Chen 2017-06-21 14:51:47
 */
public interface IFeedbackService {

    /**
     * 反馈列表查询
     *
     * @return
     */
    List<FeedbackVO> list(Page page);

    /**
     * 新增反馈
     *
     * @param feedbackIO：反馈io
     * @return
     */
    boolean save(FeedbackIO feedbackIO);

    /**
     * 修改处理状态
     *
     * @param statusIO
     * @return
     */
    boolean editStatus(StatusIO statusIO);
}