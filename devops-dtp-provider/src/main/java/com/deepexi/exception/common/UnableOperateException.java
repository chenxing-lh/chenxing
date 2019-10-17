package com.deepexi.exception.common;

import com.deepexi.constant.BizCode;
import com.deepexi.exception.BizErrorResponseStatus;

@BizErrorResponseStatus(BizCode.UNABLE_OPERATE_ERROR)
public class UnableOperateException extends RuntimeException {

    public UnableOperateException(String message) {
        super(message);
    }

}
