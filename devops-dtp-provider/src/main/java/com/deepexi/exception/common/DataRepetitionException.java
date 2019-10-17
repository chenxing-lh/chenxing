package com.deepexi.exception.common;

import com.deepexi.constant.BizCode;
import com.deepexi.exception.BizErrorResponseStatus;

@BizErrorResponseStatus(BizCode.DATA_REPETITION_ERROR)
public class DataRepetitionException extends RuntimeException {

    public DataRepetitionException(String message) {
        super(message);
    }

}
