package com.deepexi.exception.common;

import com.deepexi.constant.BizCode;
import com.deepexi.exception.BizErrorResponseStatus;

@BizErrorResponseStatus(BizCode.DATA_NOT_EXIST_ERROR)
public class DataNotExistException extends RuntimeException {

    public DataNotExistException(String message) {
        super(message);
    }

}
