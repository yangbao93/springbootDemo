package azuray.Exception;

public class ProjectRuntimeExcption extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private String code;

    public ProjectRuntimeExcption(String code, String msg) {
        super(msg);
        this.code = code;
    }

    public ProjectRuntimeExcption(String code, String msg, Throwable casue) {
        super(msg, casue);
        this.code = code;
    }

}
