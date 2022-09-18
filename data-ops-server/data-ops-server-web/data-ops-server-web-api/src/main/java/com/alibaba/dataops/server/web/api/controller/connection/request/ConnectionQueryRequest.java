package com.alibaba.dataops.server.web.api.controller.connection.request;

import com.alibaba.dataops.server.tools.base.wrapper.request.PageQueryRequest;

import lombok.Data;

/**
 * @author moji
 * @version ConnectionQueryRequest.java, v 0.1 2022年09月16日 14:23 moji Exp $
 * @date 2022/09/16
 */
@Data
public class ConnectionQueryRequest extends PageQueryRequest {

    /**
     * 别名模糊搜索词
     */
    private String searchKey;
}
