package azuray.common;

import java.io.Serializable;

public class CommonResponse implements ICommonResponse {

    private String code;

    private String msg;

    private Object datas;


    public CommonResponse(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public CommonResponse(String code, String msg, Object datas) {
        this.code = code;
        this.msg = msg;
        this.datas = datas;
    }
}
