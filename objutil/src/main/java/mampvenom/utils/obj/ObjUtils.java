package mampvenom.utils.obj;


import java.util.List;
import java.util.Map;

public class ObjUtils {

    /**
     * 오브젝트가 비어있는지 체크.
     *
     * @param obj 체크할 오브젝트.
     * @return null 이거나 비어있으면 true, 아니면 false.
     */
    public static boolean isEmpty(Object obj) {
        if (obj == null) {
            return true;
        } else if (obj instanceof String) {
            return ((String) obj).trim().length() == 0;
        } else if (obj instanceof Map) {
            return ((Map<?, ?>) obj).isEmpty();
        } else if (obj instanceof List) {
            return ((List<?>) obj).isEmpty();
        } else if (obj instanceof Object[]) {
            return ((Object[]) obj).length == 0;
        }
        return false;
    }
}
