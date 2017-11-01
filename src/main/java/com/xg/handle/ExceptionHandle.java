package com.xg.handle;

import com.xg.bean.Result;
import com.xg.exception.DogException;
import com.xg.util.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**统一异常处理类
 * Created by xg on 2017/10/30.
 */
@ControllerAdvice
public class ExceptionHandle {

    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e) {
        if( e instanceof DogException){
            DogException dogException=(DogException) e;
            return ResultUtil.error(dogException.getCode(),dogException.getMessage());
        }else
            logger.info("<系统异常>",e);
        return ResultUtil.error(-1, e.getMessage());
    }
}
