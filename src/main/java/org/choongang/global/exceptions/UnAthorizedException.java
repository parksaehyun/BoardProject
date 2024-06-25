package org.choongang.global.exceptions;

import jakarta.servlet.http.HttpServletResponse;

public class UnAthorizedException extends CommonException{
    public UnAthorizedException() {
        super("접근 권한이 없습니다.", HttpServletResponse.SC_UNAUTHORIZED);
    }
}
