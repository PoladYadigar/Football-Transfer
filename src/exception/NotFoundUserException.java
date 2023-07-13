package exception;

import enums.ExceptionEnums;

public class NotFoundUserException extends RuntimeException {
    public NotFoundUserException() {
        super(ExceptionEnums.NOT_FOUND_USER.name());

    }

}
