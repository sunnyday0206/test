package org.example.becoco.domain.post.exception;

import org.example.becoco.global.error.exception.CustomException;
import org.example.becoco.global.error.exception.ErrorCode;


public class PostInvalidRequestException extends CustomException {
    public static final CustomException EXCEPTION = new PostInvalidRequestException();

    public PostInvalidRequestException() {
        super(ErrorCode.INVALID_REQUEST);
    }
}
