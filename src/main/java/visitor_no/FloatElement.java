package visitor_no;

/**
 * <p></p>
 * Create Date: 2016年6月13日
 * Last Modify: 2016年6月13日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.0.1
 */
class FloatElement implements Element {
    private Float value;

    public FloatElement(Float value) {
        this.value = value;
    }

    public Float getValue() {
        return value;
    }
}