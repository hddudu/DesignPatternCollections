package bridge;

/**
 * <p>
 * 添加糖的实现
 * </p>
 * Create Date: 2016年3月17日
 * Last Modify: 2016年3月30日
 * 
 * @author <a href="http://weibo.com/u/5131020927">Q-WHai</a>
 * @see <a href="http://blog.csdn.net/lemon_tree12138">http://blog.csdn.net/lemon_tree12138</a>
 * @version 0.1.2
 */
public class SugarAddtion implements Addable {

    @Override
    public void adding() {
        System.out.println("已经向咖啡中添加了糖");
    }

    @Override
    public String toString() {
        return "Sugar";
    }
}
