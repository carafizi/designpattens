package best.adapter;

/**
 * Created with IntelliJ IDEA.
 * User: carafizi
 * Date: 09.12.15
 * Time: 11:23
 */
public class AppleAdapter {
    private Orange orange;

    public AppleAdapter(Orange orange) {
        this.orange = orange;
    }

    public void getAColor(String str) {
        orange.getOColor(str);
    }
}
